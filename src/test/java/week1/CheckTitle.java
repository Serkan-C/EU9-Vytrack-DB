package week1;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CheckTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        // user story
        // 1. go to cydeo practive page
        // 2. verify title is Practice

        String title = driver.getTitle();

        if (title.equals("Practice")){
            System.out.println("The tile is correct");
        }else {
            System.out.println("The tile is not correct");
        }


    }
}
