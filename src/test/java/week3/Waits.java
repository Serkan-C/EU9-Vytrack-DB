package week3;

import org.openqa.selenium.*;
import utilities.*;

import java.util.concurrent.*;


public class Waits {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

//        driver.get("https://practice.cydeo.com/dynamic_loading/4");
//

//
//        System.out.println(driver.findElement(By.xpath("//div[@id=\"finish\"]/h4")).isDisplayed());

        driver.get("https://practice.cydeo.com/dynamic_loading/3");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println(driver.findElement(By.id("login")).getAttribute("name"));


    }
}
