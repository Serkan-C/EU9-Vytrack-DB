package fullreview.tests;

import org.openqa.selenium.*;
import org.testng.*;
import org.testng.annotations.*;

public class TabelTest extends TestBase{

    @Test
    public void webTabel(){
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        String expectedData = "Germany";
        WebElement actual = driver.findElement(By.xpath("//td[.=\"Google\"]/following-sibling::td[2]"));
        Assert.assertEquals(actual.getText(),expectedData);
    }
}
