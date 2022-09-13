package pageObject.herokuapp;

import org.openqa.selenium.By;
import pageObject.baseObject.BasePage;

public class NavigationPage extends BasePage {

    private By getByLink(String textLink) {
        return By.partialLinkText(textLink);
    }

    public NavigationPage open() {
        driver.get("http://the-internet.herokuapp.com/");
        return this;
    }

    public void navigateTo(NavigationItems navigationItem) {
        click(getByLink(navigationItem.getItem()));
    }

    public void navigateTo2(HomeWorkNavigation homeWorkNavigation) {
        click(getByLink(homeWorkNavigation.getItem()));
    }

}
