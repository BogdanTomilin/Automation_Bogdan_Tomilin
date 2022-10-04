package pageObject.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObject.baseObject.BasePage;
import pageObject.herokuapp.SortableDataTablesPage;

public class LoginPage  extends BasePage {

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginBtn = By.id("login-butto");

    public LoginPage open() {
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    public LoginPage open(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage enterUsername(String username) {
        enter(this.username, username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        enter(this.password, password);
        return this;
    }

    public LoginPage verifyThatLoginPageIsClosed(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtn));
        return this;
    }


    public LoginPage clickLogin() {
        click(loginBtn);
        Assert.assertTrue(driver.findElement(loginBtn).isDisplayed());
        return this;
    }

    public LoginPage checkTableIsDisplayed2() {
        Assert.assertTrue(driver.findElement(loginBtn).isDisplayed());
        return this;
    }

}
