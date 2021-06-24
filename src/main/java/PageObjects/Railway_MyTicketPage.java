package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Constant.Constant.WEBDRIVER;

public class Railway_MyTicketPage extends Railway_GeneralPage {
    //Locators
    private final By _selectFilterDepartStation = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterDpStation\"]");
    private final By _selectFilterArriveStation = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterArStation\"]");
    private final By _selectFilterStatus = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterStatus\"]");
    private final By _txtFilterDepartDate = By.xpath("//div[@id=\"content\"]/form//table/tbody/tr/td/input[@name=\"FilterDpDate\"]");
    private final By _btnApplyFilter = By.xpath("//div[@id=\"content\"]/form//input[@value=\"Apply Filter\"]");

    //elements
    public WebElement getTxtFilterDepartDate() {
        return WEBDRIVER.findElement(_txtFilterDepartDate);
    }

    public WebElement getBtnApplyFilter() {
        return WEBDRIVER.findElement(_btnApplyFilter);
    }

    //Method
    public void cancelTicket(String departStation, String arriveStation, String seatType, String departDate, String amount) {
        By deleteButton = By.xpath("//td[2][text()='" + departStation + "']/../td[text()='" + arriveStation + "']" + "/../td[text()='" + seatType + "']/../td[text()='" + departDate + "']/../td[text()='" + amount + "']/../td/input");
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,250)");
        WEBDRIVER.findElement(deleteButton).click();
        WEBDRIVER.switchTo().alert().accept();
    }

}
