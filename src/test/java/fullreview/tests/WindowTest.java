package fullreview.tests;

import org.openqa.selenium.*;
import org.testng.annotations.*;

import java.util.*;

public class WindowTest extends TestBase {

    @Test
    public void window() {
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        driver.findElement(By.id("newWindowBtn")).click();
        Set<String> handels = driver.getWindowHandles();
        for (String handel : handels) {
            System.out.println(driver.switchTo().window(handel).getTitle());
        }
    }
}
