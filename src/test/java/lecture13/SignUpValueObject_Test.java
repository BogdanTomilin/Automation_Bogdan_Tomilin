package lecture13;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageFactory.moodpanda.HomePage;
import pageObject.baseObject.BaseTest;
import pageObject.moodpanda.NavigationPage;
import pageObject.moodpanda.SignUpPage;
import pageObject.moodpanda.entity.SignUp;
import pageObject.moodpanda.entity.SignUpBuilder;

public class SignUpValueObject_Test extends BaseTest {


    @Test
    public void login_Test() {
        new HomePage().open();
        new NavigationPage().clickSignUp();

        SignUp signUp = new SignUp() {{
            setEmail(properties.getProperty("email"));
            setCheckbox(true);
            setFirstName("First Name");
            setLastName("S");
            setPassword(properties.getProperty("password"));
        }};

        new SignUpPage().enterData(signUp);
    }



    @Test
    public void loginBuilder_Test() {
        new HomePage().open();
        new NavigationPage().clickSignUp();

        SignUpBuilder signUp = new SignUpBuilder.Builder()
                .withEmail(properties.getProperty("email"))
                .withLastName("S")
                .withFirstName("First Name")
                .withCheckbox(false)
                .withPassword(properties.getProperty("password"))
                .build();

        new SignUpPage().enterData(signUp);
    }

}
