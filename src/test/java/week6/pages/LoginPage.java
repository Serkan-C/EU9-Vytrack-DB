package week6.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.annotations.*;
import utilities.*;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "username")
    public WebElement nameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(id = "wooden_spoon")
    public WebElement loginBtn;

    @FindBy(id = "flash")
    public WebElement successMsg;

    public void loginMethod(String username, String password){

        nameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }




}
