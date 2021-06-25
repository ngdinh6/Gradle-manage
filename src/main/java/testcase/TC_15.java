package testcase;

import Constant.Constant;
import PageObjects.Railway_HomePage;
import PageObjects.Railway_LoginPage;
import PageObjects.Railway_TimetablePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Constant.Constant.WEBDRIVER;

public class TC_15 extends BaseTest {
    @Test
    public void TC15() {
        System.out.println("TC 15 - User can open \"Book ticket\" page by clicking on \"Book ticket\" link in \"Train timetable\" page");
        System.out.println("1. Navigate to QA Railway Website");
        Railway_HomePage homePage = new Railway_HomePage();
        homePage.open();
        Railway_LoginPage loginPage = homePage.gotoLoginPage();
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        System.out.println("2. Login with a valid account");
        loginPage.login(Constant.USERNAME, Constant.PASSWORD);
        System.out.println("3. Click on \"Timetable\" tab");
        Railway_TimetablePage timetablePage = loginPage.gotoTimetablePage();
        //navigate to bookticket page
        System.out.println("4. Click on \"book ticket\" link of the route from \"Huế\" to \"Sài Gòn\"0");
        timetablePage.navigateToBookTicketPage("Huế", "Sài Gòn");
        Select drpDepartStation = new Select(Constant.WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]//form/fieldset/ol/li/select[@name=\"DepartStation\"]")));
        String selectedDepart = drpDepartStation.getFirstSelectedOption().getText();
        Select drpArriveStation = new Select(Constant.WEBDRIVER.findElement(By.xpath("//span[@id=\"ArriveStation\"]/select[@name=\"ArriveStation\"]")));
        String selectedArrive = drpArriveStation.getFirstSelectedOption().getText();
        String actualMsg = selectedDepart + selectedArrive;
        String expectedMsg = "Huế" + "Sài Gòn";
        Assert.assertEquals(actualMsg, expectedMsg, "Not the selected choice");
    }
}

