package pageObject.herokuapp;

import org.openqa.selenium.By;
import pageObject.baseObject.BasePage;

public class DynamicControlsPage extends BasePage {

    private By checkBox = By.id("checkbox");
    private By clickRemove = By.id("checkbox-example");

    private By clickEnable = By.id("input-example");





    public DynamicControlsPage clickOnCheckBox() {
        click(checkBox);
        return this;
    }

    public DynamicControlsPage clickOnRemove() {
        click(clickRemove);
        return this;
    }

    public DynamicControlsPage clickOnEnable() {
        click(clickEnable);
        return this;
    }

}
