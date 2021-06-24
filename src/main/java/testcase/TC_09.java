package testcase;

import Constant.Constant;
import PageObjects.Railway_ChangePasswordPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TC_09 extends BaseTest {
    @Test
    public void TC09(){
        System.out.println("TC 09 - User can change password");
        Railway_HomePage homePage = new Railway_HomePage();
        System.out.println("1. Navigate to QA Railway Website");
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        System.out.println("2. Login with valid account");
        loginPage.login(Constant.USERNAME, "nguyendinh");
        System.out.println("3. Click on \"Change Password\" tab");
        Railway_ChangePasswordPage changePasswordPage = loginPage.gotoChangePasswordPage();
        System.out.println("4. Enter valid value into all fields.");
        System.out.println("5. Click on \"Change Password\" button");
        changePasswordPage.changePassword("nguyendinh","nguyendinh","nguyendinh");
        String actualMsg = changePasswordPage.getChangePasswordSuccessMsg();
        String expectedMsg = "Your password has been updated!";
        Assert.assertEquals(actualMsg, expectedMsg, "Change pass Fail");


    }
}
