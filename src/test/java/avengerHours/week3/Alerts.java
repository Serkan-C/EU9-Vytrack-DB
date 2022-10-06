package avengerHours.week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Alerts {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/javascript_alerts");

        WebElement alert = driver.findElement(By.xpath("//button[.=\"Click for JS Alert\"]"));
        WebElement confirm = driver.findElement(By.xpath("//button[.=\"Click for JS Confirm\"]"));
        WebElement prompt = driver.findElement(By.xpath("//button[.=\"Click for JS Prompt\"]"));

        alert.click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.accept();

        confirm.click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert2.dismiss();

        prompt.click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert3.sendKeys("Avenger Hour for EU9");
        alert3.accept();
    }
}
