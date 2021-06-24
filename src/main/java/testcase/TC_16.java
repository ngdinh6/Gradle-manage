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
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        //login
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_BookticketPage bookticketPage = loginPage.gotoBookTicketPage();
        jse.executeScript("window.scrollBy(0,550)");
        bookticketPage.bookTicket("6/30/2021", "Sài Gòn", "Nha Trang", "Soft bed with air conditioner", "1");
        Railway_MyTicketPage myticketPage = bookticketPage.gotoMyTicketPage();
        jse.executeScript("window.scrollBy(0,550)");
        myticketPage.cancelTicket("Sài Gòn", "Nha Trang", "Soft bed with air conditioner", "6/30/2021", "1");
        //choose and cancel ticket
        //myticketPage.cancelTicket("Nha Trang","Sài Gòn");
        System.out.println("Success");

    }
}

