package lecture5homework;

import driver.SimpleDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static driver.SimpleDriver.getWebDriver;

public class Task5 {
    @BeforeTest
    public void preconditions() {
        SimpleDriver simpleDriver = new SimpleDriver();
        getWebDriver().get("https://masterskayapola.ru/kalkulyator/laminata.html");
    }

    @BeforeMethod
    public void reload() {
        getWebDriver().navigate().refresh();

    }

    @Test
    public void test1() {
      enter ("calc_roomwidth", "15,000");
        enter ("calc_roomheight", "10,000");
        enter ("calc_lamwidth", "300");
        enter ("calc_lamheight", "200");
        enter ("calc_inpack", "50");
        enter ("calc_price", "100");
        select("По длине комнаты");
        enter ("calc_bias", "150");
        enter ("calc_walldist", "20");
        submit();
        List<String> actualData = getActualData();
        List<String> expectedData = new ArrayList<>() {{
            add("Площадь укладки: 149.00 м2.");
            add("Кол-во панелей: 2501 шт.");
            add("Кол-во упаковок: 51 шт.");
            add(" Стоимость: 15300 руб.");
            add(" Остатки: 49 шт.");
            add(" Отрезки: 27 шт.");
        }};
        Assert.assertEquals(actualData, expectedData);

    }


    @Test
    public void test2() {
        enter ("calc_roomwidth", "10,000");
        enter ("calc_roomheight", "5,000");
        enter ("calc_lamwidth", "1200");
        enter ("calc_lamheight", "192");
        enter ("calc_inpack", "12");
        enter ("calc_price", "500");
        select("По длине комнаты");
        enter ("calc_bias", "300");
        enter ("calc_walldist", "10");
        submit();
        List<String> actualData = getActualData();
        List<String> expectedData = new ArrayList<>() {{
            add("Площадь укладки: 49.70 м2.");
            add("Кол-во панелей: 222 шт.");
            add("Кол-во упаковок: 19 шт.");
            add(" Стоимость:  26265 руб.");
            add(" Остатки: 6 шт.");
            add(" Отрезки: 9 шт.");
        }};
        Assert.assertEquals(actualData, expectedData);

    }


    @Test
    public void test3() {
        enter ("calc_roomwidth", "7,000");
        enter ("calc_roomheight", "5,000");
        enter ("calc_lamwidth", "1500");
        enter ("calc_lamheight", "250");
        enter ("calc_inpack", "20");
        enter ("calc_price", "400");
        select("По длине комнаты");
        enter ("calc_bias", "250");
        enter ("calc_walldist", "10");
        submit();
        List<String> actualData = getActualData();
        List<String> expectedData = new ArrayList<>() {{
            add("Площадь укладки: 34.76 м2.");
            add("Кол-во панелей: 94 шт.");
            add("Кол-во упаковок: 5 шт.");
            add(" Стоимость:  15000 руб.");
            add(" Остатки: 6 шт.");
            add(" Отрезки: 6 шт.");
        }};
        Assert.assertEquals(actualData, expectedData);

    }


    @AfterTest
    public void postconditions() {
        getWebDriver().close();
    }

    private void enter(String name, String value) {
        getWebDriver().findElement(By.name(name)).clear();
        getWebDriver().findElement(By.name(name)).sendKeys(value);
    }

    private void select(String value) {
        Select selectNapravlenie = new Select(getWebDriver().findElement(By.name("calc_direct")));
        selectNapravlenie.selectByVisibleText(value);
    }

    private List<String> getActualData() {
        List<String> actualData = new ArrayList<>();
        List<WebElement> result = getWebDriver().findElements(By.cssSelector("#inputcalc > div > div.col-xs-12.col-sm-12.whiteback"));
        result.forEach(webElement -> {
            actualData.add(webElement.getText());
        });
        return actualData;
        // ВОТ ЗДЕСЬ И ПРОБЛЕМА
    }

    private void submit() {
        getWebDriver().findElement(By.cssSelector("[value='Рассчитать']")).click();
    }




}







