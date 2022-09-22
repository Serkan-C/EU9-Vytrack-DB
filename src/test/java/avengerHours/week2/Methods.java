package avengerHours.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.util.*;

public class Methods {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

//        WebElement link1 = driver.findElement(By.xpath("//a[.=\"Add/Remove Elements\"]"));

//        List<WebElement> links = driver.findElements(By.xpath("//a"));

//        WebElement wrongLink = driver.findElement(By.xpath("//hhhhhh"));

//        List<WebElement> wrongLinks = driver.findElements(By.xpath("//fffffff"));
//        System.out.println(wrongLinks);


//        link1.click();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement textInput = driver.findElement(By.name("email"));
//        textInput.sendKeys("abc@abc.com" + Keys.ENTER);

//        System.out.println(driver.findElement(By.xpath("//label")).getText());
        System.out.println(driver.findElement(By.xpath("//label")).getAttribute("for"));


    }
}
