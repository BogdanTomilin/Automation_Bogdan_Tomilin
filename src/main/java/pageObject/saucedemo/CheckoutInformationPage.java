package pageObject.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObject.baseObject.BasePage;

import static driver.SimpleDriver.getWebDriver;

public class CheckoutInformationPage extends BasePage {

    private final By finishBtn = By.cssSelector("[class='btn btn_action btn_medium cart_button']");

    public CheckoutInformationPage() {
        verifyPageUri();
    }

    public static void verifyPageUri() {
        Assert.assertTrue(getWebDriver().getCurrentUrl().contains("checkout-step-two.html"));
    }

    private static WebElement getElementNameItem(String productName) {
        return getWebDriver().findElement(By.xpath("//*[@class = 'inventory_item_name' and text() = '" + productName + "']//ancestor::div[@class='cart_item']"));
    }
    public static WebElement getElementProductName(String productName) {
        return getElementNameItem(productName).findElement(By.className("inventory_item_name"));
    }
    public String getProductName(String productName) {
        return getText(getElementProductName(productName));
    }

    private WebElement getFinishPay(String productName) {
        return getElementNameItem(productName).findElement(By.tagName("button"));
    }

    public CheckoutInformationPage checkFinishButton() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(finishBtn));
        return  this;
    }

    public CheckoutInformationPage clickFinish(){
        click(finishBtn);
        return this;
    }

}
