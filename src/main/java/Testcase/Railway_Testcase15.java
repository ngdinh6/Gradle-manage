package Testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import PageObjects.Railway_TimetablePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Railway_Testcase15 extends Railway_BaseTest {
    @Test
    public void TC15(){
        System.out.println("TC 15 - User can open \"Book ticket\" page by clicking on \"Book ticket\" link in \"Train timetable\" page");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        Railway_TimetablePage timetablePage = loginPage.gotoTimetablePage();
        System.out.println("4. Click on \"book ticket\" link of the route from \"Huế\" to \"Sài Gòn\"");
        timetablePage.navigateToBookTicketPage("Huế", "Sài Gòn");
        String actualMsg = "Depart Station:" + timetablePage.txtDepartStation() + " " + "Arrive Station:" + timetablePage.txtArriveStation();
        String expectedMsg = "Depart Station:" + "Huế" + " " + "Arrive Station:" + "Sài Gòn";
        Assert.assertEquals(actualMsg, expectedMsg, "Fail to navigate to book ticket page");
    }
}

