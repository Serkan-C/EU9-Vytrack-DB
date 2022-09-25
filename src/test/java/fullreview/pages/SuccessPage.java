package fullreview.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.*;

public class SuccessPage {

    public SuccessPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@role=\"alert\"]/p")
    public WebElement successMsg;
}
