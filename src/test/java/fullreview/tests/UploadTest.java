package fullreview.tests;

import org.openqa.selenium.*;
import org.testng.annotations.*;

public class UploadTest extends TestBase {

    @Test
    public void upload(){
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        driver.findElement(By.name("upload")).sendKeys("C:\\Users\\Zulpikar\\IdeaProjects\\EU9SeleniumReview\\src\\test\\java\\fullreview\\UserStory.txt");
    }
}
