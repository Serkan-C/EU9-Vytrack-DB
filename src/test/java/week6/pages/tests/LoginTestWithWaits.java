package week6.pages.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import utilities.*;
import week6.pages.*;

import java.util.concurrent.*;

public class LoginTestWithWaits {

    LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/3");
        loginPage = new LoginPage();
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }


    // without wait
    @Test
    public void test1(){
        loginPage.loginMethod("tomsmith","SuperSecretPassword");
    }

    //use thread.sleep
    @Test
    public void test2() throws InterruptedException {
        Thread.sleep(10000);
        loginPage.loginMethod("tomsmith","SuperSecretPassword");
    }

    //use implicity wait
    @Test
    public void test3(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage.loginMethod("tomsmith","SuperSecretPassword");
    }

    @Test
    public void test4(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
        loginPage.loginMethod("tomsmith","SuperSecretPassword");
    }



}
