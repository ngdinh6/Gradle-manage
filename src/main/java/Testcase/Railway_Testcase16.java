package Testcase;

import Constant.Constant;
import PageObjects.Railway_BookticketPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import PageObjects.Railway_MyTicketPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Railway_Testcase16 extends Railway_BaseTest {
    @Test
    public void TC16(){
        System.out.println("TC 16 - User can cancel a ticket");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        //login
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_BookticketPage bookticketPage = loginPage.gotoBookTicketPage();
        //book ticket
        bookticketPage.bookTicket("6/25/2021",2,3,"Soft bed with air conditioner","1");
        Railway_MyTicketPage myticketPage = bookticketPage.gotoMyTicketPage();
        //choose and cancel ticket
        myticketPage.cancelTicket();

        String actualMsg = myticketPage.getMyDepartStation("2") + myticketPage.getMyAriveStation("2");
        String expectedMsg = "Sài Gòn" + "Nha Trang";
        Assert.assertEquals(actualMsg, expectedMsg, "Cancel fail");
    }
}

