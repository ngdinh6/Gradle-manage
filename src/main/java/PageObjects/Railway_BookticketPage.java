package PageObjects;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Railway_BookticketPage extends Railway_GeneralPage {
    //Locators
    private final By _selectDepartDate = By.xpath("//div[@id=\"content\"]//form/fieldset/ol/li/select[@name=\"Date\"]");
    private final By _selectDepartStation = By.xpath("//div[@id=\"content\"]//form/fieldset/ol/li/select[@name=\"DepartStation\"]");
    private final By _selectArriveStation = By.xpath("//span[@id=\"ArriveStation\"]/select[@name=\"ArriveStation\"]");
    private final By _selectSeatType = By.xpath("//div[@id=\"content\"]//form/fieldset/ol/li[4]/select[@name=\"SeatType\"]");
    private final By _selectTicketAmount = By.xpath("//div[@id=\"content\"]//form/fieldset/ol/li[5]/select[@name=\"TicketAmount\"]");
    private final By _btnSubmitBookTicket = By.xpath("//form[@method=\"post\"]/fieldset/input[@value=\"Book ticket\"]");
    private final By _lblDepartStation = By.xpath("//div[@id=\"content\"]//table//tr[@class=\"OddRow\"]/td[1]");
    private final By _lblArriveStation = By.xpath("//div[@id=\"content\"]//table//tr[@class=\"OddRow\"]/td[2]");
    private final By _lblSeatType = By.xpath("//div[@id=\"content\"]//table//tr[@class=\"OddRow\"]/td[3]");
    private final By _lblDepartDate = By.xpath("//div[@id=\"content\"]//table//tr[@class=\"OddRow\"]/td[4]");
    private final By _lblAmountTicket = By.xpath("//div[@id=\"content\"]//table//tr[@class=\"OddRow\"]/td[7]");
    //elements
    public WebElement getLblDepartStation(){
        return Constant.WEBDRIVER.findElement(_lblDepartStation);
    }
    public WebElement getLblArriveStation(){
        return Constant.WEBDRIVER.findElement(_lblArriveStation);
    }
    public WebElement getLblSeatType(){
        return Constant.WEBDRIVER.findElement(_lblSeatType);
    }
    public WebElement getLblDepartDate(){
        return Constant.WEBDRIVER.findElement(_lblDepartDate);
    }
    public WebElement getLblAmountTicket(){
        return Constant.WEBDRIVER.findElement(_lblAmountTicket);
    }
    public WebElement getBtnSubmitBookTicket(){
        return Constant.WEBDRIVER.findElement(_btnSubmitBookTicket);
    }
    //Method
    public String getDepartStationInfo(){
        return this.getLblDepartStation().getText();
    }
    public String getArriveStationInfo(){
        return this.getLblArriveStation().getText();
    }
    public String getSeatTypeInfo(){
        return this.getLblSeatType().getText();
    }
    public String getDepartDateInfo(){
        return this.getLblDepartDate().getText();
    }
    public String getAmountTicketInfo(){
        return this.getLblAmountTicket().getText();
    }
    public Railway_BookticketPage bookTicket(String departDate, int departStation, int arriveStation, String seatType, String amount ){

        Select drpDepartDate = new Select(Constant.WEBDRIVER.findElement(_selectDepartDate));
        drpDepartDate.selectByVisibleText(departDate);
        Select drpDepartStation = new Select(Constant.WEBDRIVER.findElement(_selectDepartStation));
        drpDepartStation.selectByIndex(departStation);
        Select drpArriveStation = new Select(Constant.WEBDRIVER.findElement(_selectArriveStation));
        drpArriveStation.selectByIndex(arriveStation);
        Select drpSeatType = new Select(Constant.WEBDRIVER.findElement(_selectSeatType));
        drpSeatType.selectByVisibleText(seatType);
        Select drpTicketAmount = new Select(Constant.WEBDRIVER.findElement(_selectTicketAmount));
        drpTicketAmount.selectByVisibleText(amount);
        this.getBtnSubmitBookTicket().click();
        return new Railway_BookticketPage();
    }
}
