package fullreview.tests;

import fullreview.pages.*;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.testng.*;
import org.testng.annotations.*;
import utilities.*;

import java.util.*;
import java.util.concurrent.*;

public class VerifyTest {

    WebDriver driver;

    RegistrationPage rsPage;


    @BeforeMethod
    public void setUp() {
        driver = Driver.getDriver();
        rsPage = new RegistrationPage();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }

    @Test
    public void navigationTest() {
        driver.get("https://practice.cydeo.com/registration_form");
        rsPage.homeLink.click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();
        Assert.assertEquals(driver.getCurrentUrl(), "https://practice.cydeo.com/registration_form");
    }

    @Test
    public void validateTest() throws InterruptedException {
        driver.get(ConfigurationReader.getProperty("registration.form.url"));
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,500)");

        Assert.assertEquals(driver.getTitle(), ConfigurationReader.getProperty("page.title"));
        Assert.assertTrue(rsPage.homeLink.isDisplayed());
        Assert.assertEquals(rsPage.title.getText(), "Registration form");
        Assert.assertTrue(rsPage.cydeoLink.isDisplayed());

    }

    @Test
    public void test3() {
        driver.get(ConfigurationReader.getProperty("registration.form.url"));
        Select select = new Select(rsPage.departDrop);
        List<String> dropOptions = new ArrayList<>();
        for (WebElement option : select.getOptions()) {
                dropOptions.add(option.getText());
        }

        int num = rsPage.radioBtns.size();
        List<String> expectedOptions = Arrays.asList("Select your Department/Office", "Department of Engineering", "Department of Agriculture", "Accounting Office", "Tresurer's Office", "MPDC", "MCTC", "MCR", "Mayor's Office", "Tourism Office");

        Assert.assertEquals(num, 3);
        Assert.assertEquals(dropOptions,expectedOptions);

    }


}
