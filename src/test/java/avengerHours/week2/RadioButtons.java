package avengerHours.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class RadioButtons {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        List<WebElement> buttons = driver.findElements(By.xpath("//input[@type=\"radio\"]"));

        for (WebElement btn : buttons) {
            btn.click();
            Thread.sleep(1000);
        }
    }
}
