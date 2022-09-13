package lecture7homework;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.BasketPage;
import pageObject.saucedemo.HeaderPage;
import pageObject.saucedemo.LoginPage;
import pageObject.saucedemo.ProductPage;

public class HomeWork7PartC extends BaseTest {

    @BeforeClass
    public void login() {
        new LoginPage()
                .open()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();
    }

//    @Test
//    public void productTest() {
//        String productName = "Sauce Labs Onesie";
//        ProductPage productPage = new ProductPage();
//        productPage.verifyPageTitle();
//        String productCost = productPage.getProductCost(productName);
//        productPage.addProductToBasket(productName);
//        HeaderPage headerPage = new HeaderPage();
//        headerPage.clickBasketBtn();
//        BasketPage basketPage = new BasketPage();
//        String cartProductCost = basketPage.getProductCost(productName);
//        Assert.assertEquals(productCost, cartProductCost);
//        Assert.assertEquals(basketPage.enterCartQuantity(productName), "1");
//        basketPage
//                .clickRemove(productName)
//                .checkThatRemoveBtnNotExist();
//    }

}
