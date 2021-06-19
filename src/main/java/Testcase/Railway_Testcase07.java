package Testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Railway_Testcase07 extends Railway_BaseTest{
    @Test
    public void TC07(){
        System.out.println("TC 07 - User can create new account");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_RegisterPage registerPage = homePage.gotoRegisterPage();
        String actualMsg = registerPage.register("ngdinh@gmail.com2", "nguyendinh", "nguyendinh", Constant.PID).getRegisterSuccessMsg();
        String expectedMsg = "Thank you for registering your account";
        Assert.assertEquals(actualMsg, expectedMsg, "Register done");
    }
}
