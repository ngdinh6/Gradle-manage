package testcase;

import Constant.Constant;
import PageObjects.*;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_06 extends BaseTest {
    @Test
    public void TC06() {
        System.out.println("TC 06 - Additional pages display once user logged in");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        System.out.println("2. Click on \"Login\" tab");
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("3. Login with valid account");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_MyTicketPage myticketPage = loginPage.gotoMyTicketPage();
        Railway_ChangePasswordPage changePasswordPage = myticketPage.gotoChangePasswordPage();
        Railway_GeneralPage generalPage = new Railway_GeneralPage();
        System.out.println("Check \"My ticket\", \"Change password\" and \"Logout\" tabs are displayed. ");
        String actualMsg = generalPage.getTxtChangePasswordTab() + generalPage.getTxtLogoutTab() + generalPage.getTxtMyTicketTab();
        String expectedMsg = "Change password" + "Log out" + "My ticket";
        Assert.assertEquals(actualMsg, expectedMsg, "Additional page are displayed");
    }
}
