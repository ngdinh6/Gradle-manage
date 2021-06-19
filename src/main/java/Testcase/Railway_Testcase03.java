package Testcase;

import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Constant;
public class Railway_Testcase03 extends Railway_BaseTest{
    @Test
    public void TC03(){
        System.out.println("TC 03 - User cannot log into Railway with invalid password");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.login(Constant.USERNAME, Constant.WPASSWORD).getLoginErrorMsg(); ;
        String expectedMsg = "Invalid username or password. Please try again." ;
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form.");
    }
}
