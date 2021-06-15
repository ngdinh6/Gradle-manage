package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Constraint.Constraint;
public class Railway_GeneralPage {
    //contains all UI and method, shared other pages
    //Locator
    private final By tabLogin = By.xpath("//div[@id = 'menu']//a[@href) = '/Account/Login.cshtml']");
    private final By tabLogout = By.xpath("//div[@id = 'menu']//a[@href) = '/Account/Logout']");
    private final By lblWelcomeMessage = By.xpath("//div[@class = 'account')/strong");
    private final By tabRegister = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Register\"]");
    private final By tabBookTicket = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Book ticket\"]");
    private final By tabTicketPrice = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Ticket price\"]");
    private final By tabTimetable = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Timetable\"]");
    private final By tabContact = By.xpath("//*[@id=\"menu\"]//li//a//span[text()=\"Contact\"]");
    //Elements
    protected WebElement getTabLogin(){
        return Constraint.WEBDRIVER.findElement(tabLogin);
    }
    protected WebElement getTabLogout(){
        return Constraint.WEBDRIVER.findElement(tabLogout);
    }
    protected WebElement getlblWelcomeMessage(){
        return Constraint.WEBDRIVER.findElement(lblWelcomeMessage);
    }
    protected WebElement getTabRegister(){
        return Constraint.WEBDRIVER.findElement(tabRegister);
    }
    protected WebElement getTabBookTicket(){
        return Constraint.WEBDRIVER.findElement(tabBookTicket);
    }
    protected WebElement getTabTicketPrice(){
        return Constraint.WEBDRIVER.findElement(tabTicketPrice);
    }
    protected WebElement getTabTimetable(){
        return Constraint.WEBDRIVER.findElement(tabTimetable);
    }
    protected WebElement getTabContact(){
        return Constraint.WEBDRIVER.findElement(tabContact);
    }
    //Methods
    public String getWelcomeMessage(){
        return this.getlblWelcomeMessage().getText();
    }
    public Railway_LoginPage gotoLoginPage(){
        this.getTabLogin().click();
        return new Railway_LoginPage();
    }
    public Railway_Register gotoRegisterPage(){
        this.getTabRegister().click();
        return new Railway_Register();
    }
    public Railway_Bookticket gotoBookTicketPage(){
        this.getTabBookTicket().click();
        return new Railway_Bookticket();
    }
    public Railway_Ticketprice gotoTicketPricePage(){
        this.getTabTicketPrice().click();
        return new Railway_Ticketprice();
    }
    public Railway_Timetable gotoTimetablePage(){
        this.getTabTimetable().click();
        return new Railway_Timetable();
    }


}
