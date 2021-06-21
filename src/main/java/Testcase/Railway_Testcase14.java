package Testcase;

import Constant.Constant;
import PageObjects.Railway_BookticketPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Railway_Testcase14 extends Railway_BaseTest{
    @Test
    public void TC14(){
        System.out.println("TC 14 - User can book 1 ticket at a time");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_BookticketPage bookticketPage = loginPage.gotoBookTicketPage();
        bookticketPage.bookTicket("6/25/2021",1,2,"Soft bed with air conditioner","1");
        String actualMsg = bookticketPage.getBookTicketSuccessMsg() + bookticketPage.getDepartDateInfo() + bookticketPage.getDepartStationInfo() + bookticketPage.getArriveStationInfo() + bookticketPage.getSeatTypeInfo() + bookticketPage.getAmountTicketInfo();
        String expectedMsg = "Ticket Booked Successfully!" + bookticketPage.getDepartDateInfo() + bookticketPage.getDepartStationInfo() + bookticketPage.getArriveStationInfo() + bookticketPage.getSeatTypeInfo() + bookticketPage.getAmountTicketInfo();
        Assert.assertEquals(actualMsg, expectedMsg, "Book fail");
    }
}
