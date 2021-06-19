package Testcase;

import PageObjects.Railway_BookticketPage;
import PageObjects.Railway_HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Railway_Testcase04 extends  Railway_BaseTest{
    @Test
    public void TC04(){
        System.out.println("TC 04 - Login page displays when un-logged User clicks on 'Book ticket' ");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_BookticketPage bookticketPage = homePage.gotoBookTicketPage();
        String actualMsg = bookticketPage.getLoginPageTitle();
        String expectedMsg = "Login Page";
        Assert.assertEquals(actualMsg, expectedMsg, "Safe Railway - Login");
    }
}
