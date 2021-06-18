package PageObjects;
;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_TicketpricePage extends Railway_GeneralPage{

    //inherrit General page

    //Locators
    private final By _btnCheckPrice = By.xpath("//*[@id=\"content\"]/table/tbody/tr[2]/td[@class=\"NoBorder\"]/a[text()=\"Check Price\"]");
    //table
    ////div/div/table[@class="MyTable WideTable"]

    //elements
    public WebElement getBtnCheckPrice() {
        return Constant.WEBDRIVER.findElement(_btnCheckPrice);
    }


    //Method
    public Railway_HomePage login(String email, String password, String confirmPassword, String pid) {
        //navigate to Check Price page
        this.getBtnCheckPrice().click();


        //
        return new Railway_HomePage();
    }


}
