package lecture11.steps;

import pageObject.baseObject.BasePage;
import pageObject.saucedemo.LoginPage;

public class LoginSteps extends BasePage {

    LoginPage loginPage = new LoginPage();


    public LoginSteps login(String username, String password) {
        loginPage.open().enterUsername(username).enterPassword(password).clickLogin();
        return this;
    }

}
