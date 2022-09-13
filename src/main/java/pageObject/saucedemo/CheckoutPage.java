package pageObject.saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObject.baseObject.BasePage;

public class CheckoutPage  extends BasePage {

    private final By firstname = By.id("first-name");
    private final By lastname = By.id("last-name");
    private final By postalcode = By.id("postal-code");
    private final By continueBtn = By.id("continue");

    public CheckoutPage enterFirstName(String firstname){
        enter(this.firstname, firstname);
        return this;
    }
    public CheckoutPage enterLastName(String lastname){
        enter(this.lastname, lastname);
        return this;
    }

    public CheckoutPage enterPostalCode(String postalcode){
        enter(this.postalcode, postalcode);
        return this;
    }

    public CheckoutPage verifyThatCheckoutPageIsClosed(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(continueBtn));
        return this;
    }

    public CheckoutPage clickContinue() {
        click(continueBtn);
        return this;
    }

}
