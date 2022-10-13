package avengerHours.week4;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class JSExecuterPractice extends Base {

    @Test
    public void test1(){

        driver.get("http://practice.cybertekschool.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement link = driver.findElement(By.linkText("Autocomplete"));

        js.executeScript("arguments[0].click()",link);
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement input = driver.findElement(By.xpath("//input[@type=\"text\"]"));

        js.executeScript("arguments[0].setAttribute('value', 'Cydeo EU9')",input);
    }


}
