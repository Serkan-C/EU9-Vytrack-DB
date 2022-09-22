package avengerHours.week2;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CheckBox {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/checkboxes");

        driver.findElement(By.name("checkbox1")).isSelected();
        driver.findElement(By.name("checkbox2")).click();


    }
}
