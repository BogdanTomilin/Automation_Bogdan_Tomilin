package lecture8;

import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.LoginPage;
import pageObject.saucedemo.ProductPage;

public class Lecture8_1  extends BaseTest {

    @Test
    public void login() {

        new LoginPage()
                .open()
                .enterUsername("performance_glitch_user")
                .enterPassword("secret_sauce")
                .clickLogin()
                .verifyThatLoginPageIsClosed();
        new ProductPage().verifyPageTitle();
    }

}
