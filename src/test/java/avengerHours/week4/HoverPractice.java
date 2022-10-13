package avengerHours.week4;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;
import org.testng.annotations.*;

import java.util.*;

public class HoverPractice extends Base {

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(driver);
        List<WebElement> hovers = driver.findElements(By.xpath("//div[@class=\"figure\"]"));
        for (WebElement hover : hovers) {
            actions.moveToElement(hover).perform();
            Thread.sleep(1000);

        }
    }

}
