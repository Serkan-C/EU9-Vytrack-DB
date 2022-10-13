package avengerHours.week4;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

public class KeyboardPractice extends Base {

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/key_presses");

        Actions actions = new Actions(driver);

        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.SPACE).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.HOME).perform();
        Thread.sleep(1000);

    }
}
