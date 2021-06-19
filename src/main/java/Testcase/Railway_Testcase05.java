package Testcase;

import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Constant;
public class Railway_Testcase05 {
    @Test
    public void TC05(){
        System.out.println("TC 05 - System shows message when user enters wrong password several times\n");
        Railway_HomePage homePage = new Railway_HomePage();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.loginWrongPassword(Constant.USERNAME, Constant.WPASSWORD);
        String actualMsg =loginPage.getLoginErrorMsg();
        String expectedMsg = "User can't login and message \"You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.\" appears.\n";
        Assert.assertEquals(actualMsg, expectedMsg, "User can't login and message \"You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.\" appears.\n");
    }
}
