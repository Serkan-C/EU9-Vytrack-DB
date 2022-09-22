package avengerHours.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Display {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dynamic_loading/1");

        System.out.println(driver.findElement(By.cssSelector("div#finish > h4")).isDisplayed());

        driver.findElement(By.xpath("//button")).click();

        Thread.sleep(6000);

        System.out.println(driver.findElement(By.cssSelector("div#finish > h4")).isDisplayed());
    }
}
