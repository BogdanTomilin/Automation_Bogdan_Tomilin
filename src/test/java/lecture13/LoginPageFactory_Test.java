package lecture13;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageFactory.moodpanda.HomePage;
import pageFactory.moodpanda.LoginPage;
import pageObject.baseObject.BaseTest;

public class LoginPageFactory_Test extends BaseTest {


    @Test
    public void login_Test() {
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
