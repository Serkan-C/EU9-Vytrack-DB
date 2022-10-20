package avengerHours.week5.pages;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;
import week6.tests.pages.*;

import java.util.concurrent.*;

public class ButtonTest {

    ButtonPage buttonPage = new ButtonPage();

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        driver.get("https://practice.cydeo.com/multiple_buttons");
        buttonPage.button1.click();
        Assert.assertEquals("Clicked on button one!", buttonPage.result.getText());
    }


}
