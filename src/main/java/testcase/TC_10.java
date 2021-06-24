package testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_RegisterPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_10 extends BaseTest {
    @Test
    public void TC10() {
        System.out.println("TC 10 - User can't create account with \"Confirm password\" is not the same with \"Password\"");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_RegisterPage registerPage = homePage.gotoRegisterPage();
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        String actualMsg = registerPage.register("ngdinh@gmail.com2", "nguyendinh", "nguyendinh1", Constant.PID).getRegisterFailureMsg();
        String expectedMsg = "There're errors in the form. Please correct the errors and try again.";
        Assert.assertEquals(actualMsg, expectedMsg, "Register fail");
    }
}
