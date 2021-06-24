package testcase;

import PageObjects.Railway_HomePage;
import PageObjects.Railway_RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TC_11 extends BaseTest {
    @Test
    public void TC11(){
        System.out.println("TC 11 - User can't create account while password and PID fields are empty");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_RegisterPage registerPage = homePage.gotoRegisterPage();
        registerPage.register("ngdinh@gmail.com3", "", "", "");
        String actualMsg = registerPage.getRegisterFailureMsg() + registerPage.getErrorPasswordMsg() + registerPage.getErrorPidMsg();
        String expectedMsg = "There're errors in the form. Please correct the errors and try again." + "Invalid password length" + "Invalid ID length";
        Assert.assertEquals(actualMsg, expectedMsg, "Register fail");
    }
}
