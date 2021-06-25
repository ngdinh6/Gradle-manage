package testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_02 extends BaseTest {
    @Test
    public void TC02() {
        System.out.println("TC 02 - User can't login with blank 'Username' textbox");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        System.out.println("2. Click on \"Login\" tab");
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        System.out.println("3. User doesn't type any words into \"Username\" textbox but enter valid information into \"Password\" textbox ");
        System.out.println("4. Click on \"Login\" button");
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        String actualMsg = loginPage.login("", Constant.PASSWORD).getLoginErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form.";
        Assert.assertEquals(actualMsg, expectedMsg, "Error message is not displayed as expected ");
    }
}
