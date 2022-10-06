package avengerHours.week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Frames {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/nested_frames");


//        System.out.println(frame.getText());

        driver.switchTo().frame(0);

        driver.switchTo().frame("frame-middle");

        WebElement label = driver.findElement(By.xpath("//div[.=\"MIDDLE\"]"));
        System.out.println(label.getText());
    }
}
