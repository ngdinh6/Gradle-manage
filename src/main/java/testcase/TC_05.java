package testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_05 extends BaseTest {
    @Test
    public void TC05() {
        System.out.println("TC 05 - System shows message when user enters wrong password several times");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        System.out.println("2. Click on \"Login\" tab");
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        System.out.println("3. Enter valid information into \"Username\" textbox except \"Password\" textbox.");
        System.out.println("4. Click on \"Login\" button");
        System.out.println("5. Repeat step 3 three more times.");
        loginPage.loginWrongPassword(Constant.USERNAME, "invalid");
        String actualMsg = loginPage.getLoginErrorMsg();
        String expectedMsg = "You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.";
        Assert.assertEquals(actualMsg, expectedMsg, "Test case 05 fail");
    }
}
