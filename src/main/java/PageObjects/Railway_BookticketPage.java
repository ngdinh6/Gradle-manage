package PageObjects;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_BookticketPage extends Railway_GeneralPage {


    //Locators
    private final By _selectDepartDate = By.xpath("//form/fieldset/ol//select[@name=\"Date\"]");
    private final By _selectDepartStation = By.xpath("//form/fieldset/ol//select[@name=\"DepartStation\"]");
    private final By _selectArriveStation = By.xpath("//form/fieldset/ol//select[@name=\"ArriveStation\"]");
    private final By _selectSeatType = By.xpath("//form/fieldset/ol//select[@name=\"SeatType\"]");
    private final By _selectTicketAmount = By.xpath("//form/fieldset/ol//select[@name=\"TicketAmount\"]");
    private final By _btnSubmitBookTicket = By.xpath("//form[@method=\"post\"]/fieldset/input[@value=\"Book ticket\"]");
    //elements
    public WebElement getSelectDepartDate(){
        return Constant.WEBDRIVER.findElement(_selectDepartDate);
    }
    public WebElement getSelectDepartStation(){
        return Constant.WEBDRIVER.findElement(_selectDepartStation);
    }
    public WebElement getSelectArriveStation(){
        return Constant.WEBDRIVER.findElement(_selectArriveStation);
    }
    public WebElement getSelectSeatType(){
        return Constant.WEBDRIVER.findElement(_selectSeatType);
    }
    public WebElement getSelectTicketAmount(){
        return Constant.WEBDRIVER.findElement(_selectTicketAmount);
    }
    public WebElement getBtnSubmitBookTicket(){
        return Constant.WEBDRIVER.findElement(_btnSubmitBookTicket);
    }

    //Method
    /*public Railway_MyTicketPage filterTicket( String DepartDate){

        Select drpDepartStation = new Select(Constant.WEBDRIVER.findElement(_selectFilterDepartStation));
        drpDepartStation.selectByVisibleText("Sài Gòn");
        Select drpArriveStation = new Select(Constant.WEBDRIVER.findElement(_selectFilterArriveStation));
        drpDepartStation.selectByVisibleText("Phan Thiết");
        this.getTxtFilterDepartDate().sendKeys(DepartDate);
        Select drpStatus = new Select(Constant.WEBDRIVER.findElement(_selectFilterStatus));
        drpDepartStation.selectByValue("Ignore");
        this.btnCancelTickets().click();

        return new Railway_MyTicketPage();
    }*/
}
