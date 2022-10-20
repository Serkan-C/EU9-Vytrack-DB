package avengerHours.week5.waits;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.concurrent.*;

public class Waits {

    @Test
    public void test1() throws InterruptedException {
        System.out.println("bofore sleep");
        Thread.sleep(2000);
        System.out.println("After sleep");
    }

    @Test
    public void test2(){
        WebDriver driver = Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }




}
