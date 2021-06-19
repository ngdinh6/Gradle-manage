package Testcase;

import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import Constant.Constant;
public class Railway_Testcase02 extends Railway_BaseTest{
    @Test
    public void TC02(){
        System.out.println("TC 02 - User can't login with blank 'Username' textbox");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.login("", Constant.PASSWORD).getLoginErrorMsg();
        String expectedMsg = "There was a problem with your login and/or errors exist in your form." ;
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form. ");
    }
}
