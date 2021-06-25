package testcase;

import Constant.Constant;
import PageObjects.Railway_BookticketPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_14 extends BaseTest {
    @Test
    public void TC14() {
        System.out.println("TC 14 - User can book 1 ticket at a time");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("2. Login with a valid account ");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        System.out.println("3. Click on \"Book ticket\" tab");
        Railway_BookticketPage bookticketPage = loginPage.gotoBookTicketPage();
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("4. Select a \"Depart date\" from the list");
        System.out.println("5. Select \"Sài Gòn\" for \"Depart from\" and \"Nha Trang\" for \"Arrive at\".");
        System.out.println("6. Select \"Soft bed with air conditioner\" for \"Seat type\"");
        System.out.println("7. Select \"1\" for \"Ticket amount\"");
        System.out.println("8. Click on \"Book ticket\" button");
        bookticketPage.bookTicket("6/30/2021", "Sài Gòn", "Nha Trang", "Soft bed with air conditioner", "1");
        String actualMsg = bookticketPage.getBookTicketSuccessMsg() + " " + bookticketPage.getDepartDateInfo() + " " + bookticketPage.getDepartStationInfo() + " " + bookticketPage.getArriveStationInfo() + " " + bookticketPage.getSeatTypeInfo() + " " + bookticketPage.getAmountTicketInfo();
        String expectedMsg = "Ticket Booked Successfully!" + " 6/30/2021" + " Sài Gòn" + " Nha Trang" + " Soft bed with air conditioner" + " 1";
        Assert.assertEquals(actualMsg, expectedMsg, "Book fail");
    }
}
