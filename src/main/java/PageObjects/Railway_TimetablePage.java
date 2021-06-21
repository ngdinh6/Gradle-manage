package PageObjects;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_TimetablePage extends Railway_GeneralPage {
    //Locators
    private final By _linkCheckPrice = By.xpath("//table//tr[@class=\"OddRow\"]//td[6]//a[text()=\"check price\"]");
    private final By _linkBookTicket = By.xpath("//table//tr[@class=\"OddRow\"]//td[7]//a[text()=\"book ticket\"]");
    //private final By _trainTimeTable = By.xpath("//div[@id=\"content\"]/div/div/table");
    //elements
    public WebElement getLinkCheckPrice() {
        return Constant.WEBDRIVER.findElement(_linkCheckPrice);
    }
    public WebElement getLinkBookTicket() {
        return Constant.WEBDRIVER.findElement(_linkBookTicket);
    }
    public String txtDepartStation(){
        return Constant.WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]/div/div/table/tbody/tr[17]/td[2]")).getText();
    }
    public String txtArriveStation(){
        return Constant.WEBDRIVER.findElement(By.xpath("//div[@id=\"content\"]/div/div/table/tbody/tr[17]/td[3]")).getText();
    }
    //Method
    public Railway_TimetablePage navigateToBookTicketPage(String DepartStation, String ArriveStation) {
        //navigate to BookTicket
        if(isTextDepartStationPresent(DepartStation)==true && isTextArriveStationPresent(ArriveStation)==true)
        this.getLinkBookTicket().click();
        return new Railway_TimetablePage();
    }
    public boolean isTextDepartStationPresent(String departStation) {
        boolean isTextDepartStationPresent = txtDepartStation().contains(departStation);
        return isTextDepartStationPresent;
    }
    public boolean isTextArriveStationPresent(String arriveStation) {
        boolean isTextArriveStationPresent = txtArriveStation().contains(arriveStation);
        return isTextArriveStationPresent;
    }
    /*public Railway_TimetablePage navigateToCheckTicketPage() {
        //navigate to Check Price
        this.getLinkCheckPrice().click();
        return new Railway_TimetablePage();
    }*/
}


