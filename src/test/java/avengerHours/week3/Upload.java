package avengerHours.week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Upload {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/upload");

        driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Zulpikar\\IdeaProjects\\EU9SeleniumReview\\src\\test\\java\\avengerHours\\week3\\sample.txt");
    }
}
