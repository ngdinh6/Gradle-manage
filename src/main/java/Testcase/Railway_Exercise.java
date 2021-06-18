package Testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
public class Railway_Exercise {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Pre-Condition");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\Gradle-manage\\src\\main\\java\\Execution\\chromedriver.exe");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window().maximize();;

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }

    @Test
    public void TC01(){
        System.out.println("TC 01 - User can log into Railway with valid username and passowrd");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        String actualMsg = loginPage.login(Constant.USERNAME, Constant.PASSWORD).getWelcomeMessage();
        String expectedMsg = "Welcome" + Constant.USERNAME;
        Assert.assertEquals(actualMsg, expectedMsg, "Welcome message is not displayed as expected");
    }
    @Test
    public void TC02(){
        System.out.println("TC 02 - User can't login with blank 'Username' textbox");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();

        WebElement password = Constant.WEBDRIVER.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys(Constant.PASSWORD);
        String actualMsg = "There was a problem with your login and/or errors exist in your form. " ;
        String expectedMsg = "There was a problem with your login and/or errors exist in your form. " ;
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form. ");
    }
    /*@Test
    public void TC03(){
        System.out.println("TC 03 - User cannot log into Railway with invalid password ");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME,Constant.WPASSWORD );
        String actualMsg = "There was a problem with your login and/or errors exist in your form. " ;
        String expectedMsg = "There was a problem with your login and/or errors exist in your form. " ;
        Assert.assertEquals(actualMsg, expectedMsg, "There was a problem with your login and/or errors exist in your form. ");
    }
    *//*public void TC04(){
        System.out.println("TC 04 - Login page displays when un-logged User clicks on 'Book ticket' ");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_Bookticket bookticket = homePage.gotoBookTicketPage();
        String actualMsg =

    }*//*
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
}
