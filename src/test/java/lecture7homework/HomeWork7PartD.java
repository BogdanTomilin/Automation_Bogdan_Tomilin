package lecture7homework;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.saucedemo.*;

public class HomeWork7PartD extends BaseTest {

    @BeforeClass
    public void login() {
        new LoginPage()
                .open()
                .enterUsername("standard_user")
                .enterPassword("secret_sauce")
                .clickLogin();
    }

//    @Test
//    public void productTest(){
//        String productName = "Sauce Labs Onesie";
//        ProductPage productPage = new ProductPage();
//        productPage.verifyPageTitle();
//        String productCost = productPage.getProductCost(productName);
//        productPage.addProductToBasket(productName);
//        new HeaderPage().clickBasketBtn();
//        BasketPage basketPage = new BasketPage();
//        String cartProductCost = basketPage.getProductCost(productName);
//        Assert.assertEquals(productCost, cartProductCost);
//        Assert.assertEquals(basketPage.enterCartQuantity(productName), "1");
//        basketPage.clickCheckout(productName);
//        basketPage.checkCheckoutButton();
//        CheckoutPage checkoutPage = new CheckoutPage();
//        checkoutPage
//                .enterFirstName("Bogdan")
//                .enterLastName("Tomilin")
//                .enterPostalCode("65832315")
//                .clickContinue();
//        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
//        CheckoutInformationPage.verifyPageUri();
//        WebElement elementProductName = CheckoutInformationPage.getElementProductName(productName);
//        checkoutInformationPage
//                .clickFinish()
//                .checkFinishButton();
//    }

}
