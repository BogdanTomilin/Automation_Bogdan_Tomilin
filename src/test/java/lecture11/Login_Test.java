package lecture11;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.LoginPage;

public class Login_Test extends BaseTest {

    @Parameters({"username", "password"})
    @Test
    public void login() {
        get(LoginPage.class)
                .open()
                .enterUsername()
                .enterPassword()
                .clickLogin()
                .verifyThatLoginPageIsClosed();
    }

}
