package fullreview.tests;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

public class FrameTest extends TestBase{

    @Test
    public void getFrameByIndex(){
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        driver.switchTo().frame(0);
        WebElement title  = driver.findElement(By.className("color_h1"));
        Assert.assertEquals(title.getText(),"Tutorial");
    }

    @Test
    public void getFrameByElement(){
        driver.get("https://www.w3schools.com/html/html_iframe.asp");
        WebElement frame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);
        WebElement title  = driver.findElement(By.className("color_h1"));
        Assert.assertEquals(title.getText(),"Tutorial");
    }
}
