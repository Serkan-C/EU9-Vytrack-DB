package avengerHours.week4;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;
import utilities.*;

public class ActionPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/drag_and_drop");
        WebElement source = driver.findElement(By.id("column-a"));
        WebElement target = driver.findElement(By.id("column-b"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/drag_and_drop_circles");
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droptarget"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source,target).perform();
    }


}
