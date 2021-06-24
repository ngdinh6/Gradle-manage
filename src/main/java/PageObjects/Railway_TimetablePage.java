package PageObjects;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Constant.Constant.WEBDRIVER;

public class Railway_TimetablePage extends Railway_GeneralPage {
    //Locators
    private final By _linkCheckPrice = By.xpath("//table//tr[@class=\"OddRow\"]//td[6]//a[text()=\"check price\"]");
    private final By _linkBookTicket = By.xpath("//table//tr[@class=\"OddRow\"]//td[7]//a[text()=\"book ticket\"]");
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
    public void navigateToBookTicketPage(String DepartStation, String ArriveStation) {
        By linkBookTicket = By.xpath("//div//table/tbody/tr[17]/td[text()='" + DepartStation + "']/../td[text()='" + ArriveStation + "']/../td/a[text()='book ticket']");
        JavascriptExecutor jse = (JavascriptExecutor) WEBDRIVER;
        jse.executeScript("window.scrollBy(0,550)");
        WEBDRIVER.findElement(linkBookTicket).click();
    }

}


