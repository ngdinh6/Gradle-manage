package Testcase;

import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import PageObjects.Railway_Register;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Common.Common1;
import Constraint.Constraint;
import org.testng.annotations.Test;

public class Railway_LoginTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-Condition");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATTDN21.02.05\\Desktop\\Selenium_testing\\Gradle manage\\src\\test\\java\\Execution\\chromedriver.exe");
        Constraint.WEBDRIVER = new ChromeDriver();
        Constraint.WEBDRIVER.manage().window().maximize();;

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Psot-condition");
        Constraint.WEBDRIVER.quit();
    }

    @Test
    public void TC01(){
        System.out.println("TC 01 - User can log into Railway with valid username and passowrd");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.login(Constraint.USERNAME, Constraint.PASSWORD).getWelcomeMessage();
        String expectedMsg = "Welcome" + Constraint.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
    @Test
    public void TC02(){
        System.out.println("TC 01 - User can register Railway with valid email, passowrd and PID");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_Register registerPage = homePage.gotoRegisterPage();
        String actualMsg = registerPage..getWelcomeMessage();
        String expectedMsg = "Welcome" + Constraint.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }

}
