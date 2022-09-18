package base;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.concurrent.*;

public abstract class TestBase {

    public WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
