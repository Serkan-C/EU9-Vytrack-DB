package week6.pages.tests;

import org.testng.annotations.*;
import utilities.*;
import week6.pages.*;

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
}
