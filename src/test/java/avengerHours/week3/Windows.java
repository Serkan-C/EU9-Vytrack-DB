package avengerHours.week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class Windows {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/windows");

        driver.findElement(By.xpath("//a[.=\"Click Here\"]")).click();

        System.out.println(driver.getTitle());

        Set<String> handels = driver.getWindowHandles();
        String target = "";
        for (String handle : handels) {
            driver.switchTo().window(handle);
            if(driver.getTitle().equals("New Window")){
                target = handle;
            }
        }
        driver.switchTo().window(target);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
    }
}
