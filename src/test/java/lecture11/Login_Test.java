package lecture11;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.LoginPage;

public class Login_Test extends BaseTest {

    @Parameters({"username", "password"})
    @Test
    public void login(String username, String password) {
        get(LoginPage.class)
                .open()
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin()
                .verifyThatLoginPageIsClosed();
    }

}
