package lecture8homework;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.herokuapp.DynamicControlsPage;
import pageObject.herokuapp.NavigationPage;

import static pageObject.herokuapp.HomeWorkNavigation.DYNAMIC_CONTROLS;

public class HomeWork8 extends BaseTest {

    @BeforeMethod
    public void precondition() {
        new NavigationPage()
                .open();
    }

    @Test
    public void dynamicControl_Test () {

      new NavigationPage().navigateTo2(DYNAMIC_CONTROLS);
      new DynamicControlsPage().clickOnCheckBox().clickOnRemove().clickOnEnable();

    }
 //  Не доделал. Остался File Upload.

}
