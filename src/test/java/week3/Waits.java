package week3;

import org.openqa.selenium.*;
import utilities.*;

import java.util.concurrent.*;


public class Waits {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = Driver.getDriver();

        driver.get("https://practice.cydeo.com/dynamic_loading/4");

        Thread.sleep(6000);

        System.out.println(driver.findElement(By.xpath("//div[@id=\"finish\"]/h4")).isDisplayed());


    }
}
