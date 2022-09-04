package week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class FindAndFinds {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

//        List<WebElement> links = driver.findElements(By.tagName("a"));
////        for (WebElement link : links) {
////            System.out.println(link.getText());
////        }
//        System.out.println(links.get(10).getText());
//        links.get(3).click();

        driver.findElement(By.xpath("//a[text()=\"Multiple Buttons\"]")).click();
        List<WebElement> btns = driver.findElements(By.xpath("//button"));
        for (WebElement btn : btns) {
            btn.click();
            Thread.sleep(1000);
        }


    }
}
