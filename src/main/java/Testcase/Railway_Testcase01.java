package Testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Railway_Testcase01 extends Railway_BaseTest {


    @Test
    public void TC01(){
        System.out.println("TC 01 - User can log into Railway with valid username and passowrd");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        String actualMsg = loginPage.getWelcomeMessage();
        String expectedMsg = "Welcome " + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }

}

