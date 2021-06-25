package testcase;

import Constant.Constant;
import PageObjects.Railway_BookticketPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import PageObjects.Railway_MyTicketPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_16 extends BaseTest {
    @Test
    public void TC16() {
        System.out.println("TC 16 - User can cancel a ticket");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("2. Login with a valid account");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_BookticketPage bookticketPage = loginPage.gotoBookTicketPage();
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("3. Book a ticket");
        bookticketPage.bookTicket("6/30/2021", "Sài Gòn", "Nha Trang", "Soft bed with air conditioner", "1");
        System.out.println("4. Click on \"My ticket\" tab");
        Railway_MyTicketPage myticketPage = bookticketPage.gotoMyTicketPage();
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("5. Click on \"Cancel\" button of ticket which user want to cancel.");
        System.out.println("6. Click on \"OK\" button on Confirmation message \"Are you sure?\"");
        myticketPage.cancelTicket("Sài Gòn", "Nha Trang", "Soft bed with air conditioner", "6/30/2021", "1");
        System.out.println("Success");

    }
}

