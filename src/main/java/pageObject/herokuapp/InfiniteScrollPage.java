package pageObject.herokuapp;

import org.openqa.selenium.By;
import pageObject.baseObject.BasePage;

public class InfiniteScrollPage extends BasePage  {

    private By pageFooter = By.id("page-footer");

    public InfiniteScrollPage infiniteScroll(Integer count) {
        for (int i = 0; i < count; i++) {
            actions.scrollToElement(driver.findElement(pageFooter)).build().perform();
        }
        return this;
    }
}
