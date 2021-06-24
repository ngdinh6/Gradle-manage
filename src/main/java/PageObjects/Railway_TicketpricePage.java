package PageObjects;

;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_TicketpricePage extends Railway_GeneralPage {
    //Locators
    private final By _btnCheckPrice = By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td[@class=\"NoBorder\"]/a[text()=\"Check Price\"]");

    //elements
    public WebElement getBtnCheckPrice() {
        return Constant.WEBDRIVER.findElement(_btnCheckPrice);
    }
}
