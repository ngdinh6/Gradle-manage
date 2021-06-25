package testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_RegisterPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_07 extends BaseTest {
    @Test
    public void TC07() {
        System.out.println("TC 07 - User can create new account");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        System.out.println("2. Click on \"Register\" tab");
        Railway_RegisterPage registerPage = homePage.gotoRegisterPage();
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("3. Enter valid information into all fields");
        System.out.println("4. Click on \"Register\" button");
        System.out.println("Check message appear");
        String actualMsg = registerPage.register("ngdinh109@gmail.com", "nguyendinh", "nguyendinh", Constant.PID).getRegisterSuccessMsg();
        String expectedMsg = "You're here";
        Assert.assertEquals(actualMsg, expectedMsg, "Register fail");
    }
}
