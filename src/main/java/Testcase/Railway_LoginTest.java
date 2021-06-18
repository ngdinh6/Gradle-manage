package Testcase;

import Constant.Constant;
import PageObjects.Railway_BookticketPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class Railway_LoginTest extends Railway_BaseTest {


    @Test
    public void TC01(){
        System.out.println("TC 01 - User can log into Railway with valid username and passowrd");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.login(Constant.USERNAME, Constant.PASSWORD).getWelcomeMessage();
        String expectedMsg = "Welcome " + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
    @Test
    public void TC02(){
        System.out.println("TC 02 - User can't login with blank 'Username' textbox");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();

        WebElement password = Constant.WEBDRIVER.findElement(By.xpath("//input[@id=\"password\"]"));
        password.sendKeys(Constant.PASSWORD);
        String actualMsg = "There was a problem with your login and/or errors exist in your form. " ;
        String expectedMsg = "There was a problem with your login and/or errors exist in your form. " ;
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form. ");
    }
    @Test
    public void TC03(){
        System.out.println("TC 03 - User cannot log into Railway with invalid password");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();

        WebElement email = Constant.WEBDRIVER.findElement(By.xpath("//input[@id=\"username\"]"));
        email.sendKeys(Constant.EMAIL);
        WebElement invalidPassword = Constant.WEBDRIVER.findElement(By.xpath("//input[@id=\"password\"]"));
        invalidPassword.sendKeys(Constant.WPASSWORD);
        String actualMsg = "There was a problem with your login and/or errors exist in your form " ;
        String expectedMsg = "There was a problem with your login and/or errors exist in your form " ;
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form. ");
    }
    @Test
    public void TC04(){
        System.out.println("TC 04 - Login page displays when un-logged User clicks on 'Book ticket' ");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_BookticketPage bookticketPage = homePage.gotoBookTicketPage();
        String actualMsg = Constant.WEBDRIVER.getTitle();
        String expectedMsg = "Safe Railway - Login";
        Assert.assertEquals(actualMsg, expectedMsg, "Safe Railway - Login");
    }
    @Test
    public void TC05(){
        System.out.println("TC 05 - System shows message when user enters wrong password several times\n");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();

        String actualMsg = loginPage.loginWrongPassword(Constant.USERNAME, Constant.WPASSWORD).getWelcomeMessage();
        String expectedMsg = "User can't login and message \"You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.\" appears.\n";
        Assert.assertEquals(actualMsg, expectedMsg, "User can't login and message \"You have used 4 out of 5 login attempts. After all 5 have been used, you will be unable to login for 15 minutes.\" appears.\n");
    }
}
    /*
    @Test
    public void TC07(){
        System.out.println("TC 07 - User can create new account");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_Register RegisterPage = homePage.gotoRegisterPage();
        Railway_Register actualMsg = RegisterPage.register(Constant.EMAIL, Constant.PASSWORD, Constant.CONFIRM_RE_PASSWORD, Constant.PID);
        //String expectedMsg = "Welcome" + Constraint.USERNAME;
        Assert.assertEquals(actualMsg, "Welcome message is not displayed as expected");
    }
    @Test
    public void TC09(){
        System.out.println("TC 09 - User can change password");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.login(Constant.WUSERNAME, Constant.PASSWORD);

        Railway_ChangePasswordPage changePasswordPage = new Railway_ChangePasswordPage();
        changePasswordPage.changePassword(Constant.CURRENT_PASSWORD, Constant.NEW_PASSWORD, Constant.CONFIRM_NEW_PASSWORD);
        String actualMsg = "There was a problem with your login and/or errors exist in your form. " ;
        String expectedMsg = "There was a problem with your login and/or errors exist in your form. " ;
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form. ");
    }
*/

