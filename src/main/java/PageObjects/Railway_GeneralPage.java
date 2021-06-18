package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Constant.Constant;
public class Railway_GeneralPage {
    //contains all UI and method, shared other pages
    //Locator
    private final By tabLogin = By.xpath("//div[@id=\"menu\"]/ul/li[8]/a/span[text()=\"Login\"]");
    private final By tabLogout = By.xpath("//div[@id = 'menu']//a[@href) = '/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@id=\"banner\"]/div/strong");
    private final By tabRegister = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Register\"]");
    private final By tabBookTicket = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Book ticket\"]");
    private final By tabTicketPrice = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Ticket price\"]");
    private final By tabTimetable = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Timetable\"]");
    private final By tabContact = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Contact\"]");
    private final By tabChangePassword = By.xpath("//ul/li[@class=\"selected\"]/a/span[text()=\"Change password\"]");
    //Elements
    protected WebElement getTabLogin(){
        return Constant.WEBDRIVER.findElement(tabLogin);
    }
    protected WebElement getTabLogout(){
        return Constant.WEBDRIVER.findElement(tabLogout);
    }
    protected WebElement getlblWelcomeMessage(){
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getTabRegister(){
        return Constant.WEBDRIVER.findElement(tabRegister);
    }
    protected WebElement getTabBookTicket(){
        return Constant.WEBDRIVER.findElement(tabBookTicket);
    }
    protected WebElement getTabTicketPrice(){
        return Constant.WEBDRIVER.findElement(tabTicketPrice);
    }
    protected WebElement getTabTimetable(){
        return Constant.WEBDRIVER.findElement(tabTimetable);
    }
    protected WebElement getTabContact(){
        return Constant.WEBDRIVER.findElement(tabContact);
    }
    protected WebElement getTabChangePassword(){
        return Constant.WEBDRIVER.findElement(tabChangePassword);
    }
    //Methods
    public String getWelcomeMessage(){
        return this.getlblWelcomeMessage().getText();
    }

    public Railway_LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new Railway_LoginPage();
    }
    public Railway_RegisterPage gotoRegisterPage(){
        this.getTabRegister().click();
        return new Railway_RegisterPage();
    }
    public Railway_BookticketPage gotoBookTicketPage(){
        this.getTabBookTicket().click();
        return new Railway_BookticketPage();
    }
    public Railway_TicketpricePage gotoTicketPricePage(){
        this.getTabTicketPrice().click();
        return new Railway_TicketpricePage();
    }
    public Railway_TimetablePage gotoTimetablePage(){
        this.getTabTimetable().click();
        return new Railway_TimetablePage();
    }
    public Railway_ChangePasswordPage gotoChangePassword(){
        this.getTabChangePassword().click();
        return new Railway_ChangePasswordPage();
    }



}
