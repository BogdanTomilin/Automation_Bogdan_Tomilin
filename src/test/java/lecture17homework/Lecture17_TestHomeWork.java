package lecture17homework;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

public class Lecture17_TestHomeWork {

    @BeforeTest
    public void pre(){
        baseUrl = "https://www.rw.by/";
    }


   @Test
    public void authorization_Test1() {
       open(baseUrl);
       $( "Sign up").click();
       $(By.cssSelector("[placeholder='Your first name']")).sendKeys("JoJo");
       $(By.cssSelector("placeholder=\"e.g. 'S'\"")).sendKeys("J");
       $(By.cssSelector("[placeholder='Your email address']")).sendKeys("JoJo@mail.com");
       $(By.cssSelector("[type='password']")).sendKeys("JoJo16");
       $(By.xpath("//*[@class='box']//button")).click();
    }

    @Test
    public void authorization_Test2() {
        open(baseUrl);
        $( "Sign up").click();
        $(By.cssSelector("[placeholder='Your first name']")).sendKeys("Joseph");
        $(By.cssSelector("placeholder=\"e.g. 'S'\"")).sendKeys("J");
        $(By.cssSelector("[placeholder='Your email address']")).sendKeys("Joseph@mail.com");
        $(By.cssSelector("[type='password']")).sendKeys("Joseph16");
        $(By.xpath("//*[@class='box']//button")).click();
    }

    @Test
    public void authorization_Test3() {
        open(baseUrl);
        $( "Sign up").click();
        $(By.cssSelector("[placeholder='Your first name']")).sendKeys("jonathan");
        $(By.cssSelector("placeholder=\"e.g. 'S'\"")).sendKeys("J");
        $(By.cssSelector("[placeholder='Your email address']")).sendKeys("Jonathan@mail.com");
        $(By.cssSelector("[type='password']")).sendKeys("Jonathan16");
        $(By.xpath("//*[@class='box']//button")).click();
    }

    @Test
    public void login_Test1() {
        open(baseUrl);
        $(By.partialLinkText("Login")).click();
        $(By.cssSelector("[type='text']")).sendKeys("Joseph@mail.com");
        $(By.cssSelector("[type='password']")).sendKeys("Joseph16");
        $(By.xpath("//button[@class]")).click();
    }

    @Test
    public void login_Test2() {
        open(baseUrl);
        $(By.partialLinkText("Login")).click();
        $(By.cssSelector("[type='text']")).sendKeys("Jonathan@mail.com");
        $(By.cssSelector("[type='password']")).sendKeys("Jonathan16");
        $(By.xpath("//button[@class]")).click();
    }

    @Test
    public void login_Test3() {
        open(baseUrl);
        $(By.partialLinkText("Login")).click();
        $(By.cssSelector("[type='text']")).sendKeys("JoJo@mail.com");
        $(By.cssSelector("[type='password']")).sendKeys("JoJo16");
        $(By.xpath("//button[@class]")).click();
    }

}
