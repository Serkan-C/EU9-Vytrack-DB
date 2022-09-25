package fullreview.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;
import utilities.*;
import week4.*;

public class ActionTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = Driver.getDriver();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void hover(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(By.id("sub-menu"));
        actions.moveToElement(hover).perform();
        System.out.println(driver.findElement(By.id("link1")).getText());
    }


}
