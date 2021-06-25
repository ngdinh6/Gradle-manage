package testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_03 extends BaseTest {
    @Test
    public void TC03() {
        System.out.println("TC 03 - User cannot log into Railway with invalid password");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        System.out.println("2. Click on \"Login\" tab");
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("3. Enter valid Email and invalid Password");
        System.out.println("4. Click on \"Login\" button");
        String actualMsg = loginPage.login(Constant.USERNAME, Constant.WPASSWORD).getLoginErrorMsg();
        String expectedMsg = "Invalid username or password. Please try again.";
        Assert.assertEquals(actualMsg, expectedMsg, "Testcase fail");
    }
}
