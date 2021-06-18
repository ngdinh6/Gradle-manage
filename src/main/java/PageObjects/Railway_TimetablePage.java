package PageObjects;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Railway_TimetablePage extends Railway_GeneralPage {
    //encapsulates register page
    //inherrit General page

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



    //Method
    public Railway_HomePage login(String email, String password, String confirmPassword, String pid) {
        //navigate to Check Price
        this.getLinkCheckPrice().click();
        //navigate to Book Ticket
        this.getLinkBookTicket().click();

        //land on check Ticket Price page
        return new Railway_HomePage();
    }

}


