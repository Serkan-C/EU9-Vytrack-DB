package fullreview.tests;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.concurrent.*;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }



}
