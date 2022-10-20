package lecture11;

import io.qameta.allure.*;
import lecture11.steps.LoginSteps;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.ProductPage;

public class Product_Test extends BaseTest {

    @Parameters({"steps"})
    @Test()
    @Description("Product test")
    @Step("Login and check product page")
    @Link("https://test.com")
    @Issue("Product Page issue")
    @TmsLink("Product Page tms")
    public void productTest(@Optional("0") String steps) {
        if (steps.equals("0")) get(LoginSteps.class).login(properties.getProperty("username"), properties.getProperty("password"));
        get(ProductPage.class).verifyPageTitle();
    }

}
