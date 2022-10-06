package avengerHours.week3;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;

import java.util.*;

public class Dropdown {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(0);

        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);

        selectMonth.selectByValue("1");
        selectDay.selectByIndex(0);

        List<WebElement> months = selectMonth.getOptions();
        List<String> monthNames = new ArrayList<>();
        for (WebElement monthName : months) {
            monthNames.add(monthName.getText());
        }

        System.out.println(monthNames);
        Assert.assertTrue(monthNames.contains("April"));
    }
}
