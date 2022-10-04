package lecture9homework;

import org.testng.Assert;
import org.testng.annotations.*;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.BasketPage;
import pageObject.saucedemo.HeaderPage;
import pageObject.saucedemo.LoginPage;
import pageObject.saucedemo.ProductPage;
import testNgUtils.Listener;
import testNgUtils.Retry;

@Listeners(Listener.class)
public class HomeWork9Test extends BaseTest {

    int timeout = 4;



    @Parameters({"url", })
    @BeforeMethod
    public void preconditions(@Optional("https://www.saucedemo.com/") String url) {
        new LoginPage()
                .open(url);
    }

    @Test(dataProvider = "login data")
    public void login(String username, String password) {
        new LoginPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin();
    }

    @Test (dataProvider = "login data" , timeOut = 1000)
    public void login1(String username, String password) {
        pause(3);
        new LoginPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin();
    }

    @Test (dataProvider = "login data" , dependsOnMethods = "login1")
    public void login2(String username, String password) {
        new LoginPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin();
    }

    @Test (dataProvider = "login data" , retryAnalyzer = Retry.class)
    public void login3(String username, String password) {
        timeout--;
        pause(timeout);
        new LoginPage()
                .enterUsername(username)
                .enterPassword(password)
                .clickLogin();
    }



    @DataProvider(name = "login data")
    public Object[][] getData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"problem_user", "secret_sauce"},
                {"performance_glitch_user", "secret_sauce"},
        };
    }


    private void pause(long timeout) {
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test ( enabled = false, invocationCount = 5, threadPoolSize = 5)
    public void exercise2 () {
        new LoginPage()
                .open()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();
        String productName = "Sauce Labs Onesie";
        ProductPage productPage = new ProductPage();
        productPage.verifyPageTitle();
        String productCost = productPage.getProductCost(productName);
        productPage.addProductToBasket(productName);
        HeaderPage headerPage = new HeaderPage();
        headerPage.clickBasketBtn();
        BasketPage basketPage = new BasketPage();
        String cartProductCost = basketPage.getProductCost(productName);
        Assert.assertEquals(productCost, cartProductCost);
        Assert.assertEquals(basketPage.enterCartQuantity(productName), "1");
//                BasketPage
//                .clickRemove(productName)
//                .checkThatRemoveBtnNotExist();

    }





}
