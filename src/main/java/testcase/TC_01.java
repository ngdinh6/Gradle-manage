package testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_01 extends BaseTest {


    @Test
    public void TC01() {
        System.out.println("TC 01 - User can log into Railway with valid username and passowrd");
        //System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        //System.out.println("2. Click on \"Login\" tab");
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        //System.out.println("3. Enter valid Email and Password");
        //System.out.println("4. Click on \"Login\" button");
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome " + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }

}

