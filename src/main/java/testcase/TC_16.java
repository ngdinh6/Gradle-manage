package testcase;

import Constant.Constant;
import PageObjects.Railway_BookticketPage;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import PageObjects.Railway_MyTicketPage;
import org.testng.annotations.Test;

public class TC_16 extends BaseTest {
    @Test
    public void TC16(){
        System.out.println("TC 16 - User can cancel a ticket");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        //login
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_BookticketPage bookticketPage = loginPage.gotoBookTicketPage();
        bookticketPage.bookTicket("6/30/2021","Sài Gòn","Nha Trang","Soft bed with air conditioner","1");
        Railway_MyTicketPage myticketPage = bookticketPage.gotoMyTicketPage();
        myticketPage.cancelTicket("Sài Gòn","Nha Trang","Soft bed with air conditioner","6/30/2021","1");
        //choose and cancel ticket
        //myticketPage.cancelTicket("Nha Trang","Sài Gòn");
        System.out.println("Success");
        /*tring actualMsg = myticketPage.getMyDepartStation("2") + myticketPage.getMyAriveStation("2");
        String expectedMsg = "Sài Gòn" + "Nha Trang";
        Assert.assertEquals(actualMsg, expectedMsg, "Cancel fail");*/
    }
}

