package lecture13;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageFactory.moodpanda.HomePage;
import pageFactory.moodpanda.LoginPage;
import pageObject.baseObject.BaseTest;

public class LoginComponent_Test extends BaseTest {

    @Parameters({})
    @Test
    public void login_Test(String url, String email, String password) {
        new HomePage()
                .open()
                .clickGetStarted();


        new LoginPage()
                .enterEmail(properties.getProperty("email"))
                .enterPassword(properties.getProperty("password"))
                .clickLogin()
                .verifyErrorMessage("Your email or password is wrong");
    }

}
