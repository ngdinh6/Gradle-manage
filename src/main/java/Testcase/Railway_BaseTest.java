package Testcase;

import Constant.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class Railway_BaseTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-Condition");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATTDN21.02.05\\Desktop\\Selenium_testing\\Gradle manage\\src\\main\\java\\Execution\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();;

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }
}
