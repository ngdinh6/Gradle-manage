package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Constant.Constant.WEBDRIVER;

public class Railway_MyTicketPage extends Railway_GeneralPage{
    //Locators
    private final By _selectFilterDepartStation = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterDpStation\"]");
    private final By _selectFilterArriveStation = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterArStation\"]");
    private final By _selectFilterStatus = By.xpath("//div[@id=\"content\"]//table/tbody/tr/td/select[@name=\"FilterStatus\"]");
    private final By _txtFilterDepartDate = By.xpath("//div[@id=\"content\"]/form//table/tbody/tr/td/input[@name=\"FilterDpDate\"]");
    private final By _btnApplyFilter = By.xpath("//div[@id=\"content\"]/form//input[@value=\"Apply Filter\"]");
    //private final By _btnCancelTickets = By.xpath("//div[@id=\"content\"]/form//table/tbody/tr[3]/td[11]/input[@value=\"Cancel\"]");
    //elements
    public WebElement getTxtFilterDepartDate(){
        return WEBDRIVER.findElement(_txtFilterDepartDate);
    }
    public WebElement getBtnApplyFilter(){
        return WEBDRIVER.findElement(_btnApplyFilter);
    }
    /*public WebElement getBtnCancelTickets(String row){
        return WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]/form/div[2]/div/table/tbody/tr[" + row + "]/td[11]/input[@value=\"Cancel\"]"));
    }*/
    public WebElement getBtnCancelTickets(String row){
        return WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]/form/div[2]/div/table/tbody/tr[" +row+ "]/td[11]/input[@value=\"Cancel\"]"));
    }
    public String getMyDepartStation(String depRow){
        return WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]/form/div[2]/div/table/tbody/tr[" +depRow+ "]/td[2]")).getText();
    }
    public String getMyAriveStation(String arrRow){
        return WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]/form/div[2]/div/table/tbody/tr[" +arrRow+ "]/td[3]")).getText();
    }
    //Method
    public String getTxtBtnCancelTickets(String Row){
        return WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]/form/div[2]/div/table/tbody/tr[" +Row+ "]/td[11]/input[@value=\"Cancel\"]")).getText();
    }
    public Railway_MyTicketPage filterTicket( int departStation, int arriveStation, String DepartDate, String status){
        Select drpDepartStation = new Select(WEBDRIVER.findElement(_selectFilterDepartStation));
        drpDepartStation.selectByIndex(departStation);
        Select drpArriveStation = new Select(WEBDRIVER.findElement(_selectFilterArriveStation));
        drpArriveStation.selectByIndex(arriveStation);
        this.getTxtFilterDepartDate().sendKeys(DepartDate);
        Select drpStatus = new Select(WEBDRIVER.findElement(_selectFilterStatus));
        drpStatus.selectByVisibleText(status);
        this.getBtnApplyFilter().click();
        return new Railway_MyTicketPage();
    }
    public Railway_MyTicketPage cancelTicket( ){
        //,DepartStationChoice, String ArriveStatioChoice, String option
        JavascriptExecutor jse = (JavascriptExecutor)WEBDRIVER;
        jse.executeScript("window.scrollBy(0,250)");

        if(isCancelExist("")==true) {
            this.getBtnCancelTickets("2").click();
            WEBDRIVER.switchTo().alert().accept();
            return new Railway_MyTicketPage();
        }
        else
            System.out.println("Ticket not exist");
            return new Railway_MyTicketPage();
    }
    public boolean isCancelExist(String cancelBtn) {
        boolean isCancelExist = getTxtBtnCancelTickets("2").contains(cancelBtn);
        return isCancelExist;
    }

    /*public boolean isDepartExist(String departExist, String dep) {
        boolean isDepartExist = getLblDepartStation(dep).contains(departExist);
        return isDepartExist;
    }
    public boolean isArriveExist(String arriveExist, String arr) {
        boolean isArriveExist = getLblAriveStation(arr).contains(arriveExist);
        return isArriveExist;
    }*/
}
