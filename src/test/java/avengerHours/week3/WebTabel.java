package avengerHours.week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class WebTabel {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/web-tables");

        System.out.println(driver.findElement(By.xpath("//td[.=\"Cheese\"]")).getText());

        List<WebElement> userInfo = driver.findElements(By.xpath("(//tr)[3]/td"));

        for (WebElement info : userInfo) {
            System.out.println(info.getText());

        }
    }
}
