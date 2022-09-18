package ExtraTasks;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.*;
import org.testng.annotations.*;

public class Task3 {
    @Test
    public void test1(){



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        userName.sendKeys("Tester");
        password.sendKeys("test");
        loginBtn.click();

        driver.findElement(By.xpath("//a[.=\"View all orders\"]")).click();
        String date = driver.findElement(By.xpath("//td[.=\"Susan McLaren\"]/following-sibling::td[3]")).getText();
        Assert.assertEquals(date, "01/05/2010");

    }



}
