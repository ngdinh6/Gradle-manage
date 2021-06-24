package testcase;

import PageObjects.Railway_ChangePasswordPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import PageObjects.Railway_MyTicketPage;
import PageObjects.Railway_GeneralPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Constant;
public class TC_06 extends BaseTest {
    @Test
    public void TC06(){
        System.out.println("TC 06 - Additional pages display once user logged in");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_MyTicketPage myticketPage = loginPage.gotoMyTicketPage();
        Railway_ChangePasswordPage changePasswordPage = myticketPage.gotoChangePasswordPage();
        Railway_GeneralPage generalPage = new Railway_GeneralPage();
        String actualMsg = generalPage.getTxtChangePasswordTab() + generalPage.getTxtLogoutTab() + generalPage.getTxtMyTicketTab();
        String expectedMsg = "Change password" + "Log out" + "My ticket";
        Assert.assertEquals(actualMsg, expectedMsg, "Additional page are displayed");
    }
}
