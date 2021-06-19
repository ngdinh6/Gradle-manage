package PageObjects;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Railway_MyTicketPage extends Railway_GeneralPage{
    //Locators
    private final By _selectFilterDepartStation = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterDpStation\"]");
    private final By _selectFilterArriveStation = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterArStation\"]");
    private final By _selectFilterStatus = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterStatus\"]");
    private final By _txtFilterDepartDate = By.xpath("//div[@id=\"content\"]/form//table/tbody/tr/td/input[@name=\"FilterDpDate\"]");
    private final By _btnApplyFilter = By.xpath("//div[@id=\"content\"]/form//input[@value=\"Apply Filter\"]");
    private final By _btnCancalTickets = By.xpath("//div[@id=\"content\"]/form//table/tbody/tr[2]/td[11]/input[@value=\"Cancel\"]");
    //elements
    public WebElement getSelectFilterDepartStation(){
        return Constant.WEBDRIVER.findElement(_selectFilterDepartStation);
    }
    public WebElement getSelectFilterArriveStation(){
        return Constant.WEBDRIVER.findElement(_selectFilterArriveStation);
    }
    public WebElement getSelectFilterStatus(){
        return Constant.WEBDRIVER.findElement(_selectFilterStatus);
    }
    public WebElement getTxtFilterDepartDate(){
        return Constant.WEBDRIVER.findElement(_txtFilterDepartDate);
    }
    public WebElement btnApplyFilter(){
        return Constant.WEBDRIVER.findElement(_btnApplyFilter);
    }
    public WebElement btnCancelTickets(){
        return Constant.WEBDRIVER.findElement(_btnCancalTickets);
    }
    //Method
    public Railway_MyTicketPage filterTicket( String DepartDate){

        Select drpDepartStation = new Select(Constant.WEBDRIVER.findElement(_selectFilterDepartStation));
        drpDepartStation.selectByVisibleText("Sài Gòn");
        Select drpArriveStation = new Select(Constant.WEBDRIVER.findElement(_selectFilterArriveStation));
        drpDepartStation.selectByVisibleText("Phan Thiết");
        this.getTxtFilterDepartDate().sendKeys(DepartDate);
        Select drpStatus = new Select(Constant.WEBDRIVER.findElement(_selectFilterStatus));
        drpDepartStation.selectByValue("Ignore");
        this.btnCancelTickets().click();

        return new Railway_MyTicketPage();
    }


}
