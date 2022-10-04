package lecture11homework;

import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.LoginPage;
import pageObject.saucedemo.ProductPage;

public class HomeWork11Test extends BaseTest {

    @Test
    public void login() {

        new LoginPage()
                .open()
                .enterUsername("performance_glitch_user")
                .enterPassword("secret_sauce")
                .clickLogin()
                .checkTableIsDisplayed2()
                .verifyThatLoginPageIsClosed();
        new ProductPage().verifyPageTitle();
    }

}
