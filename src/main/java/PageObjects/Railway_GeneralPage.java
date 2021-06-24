package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Constant.Constant;

public class Railway_GeneralPage {
    //contains all UI and method, shared other pages
    //Locator
    private final By tabLogin = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Login\"]");
    private final By tabLogout = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Log out\"]");
    private final By tabRegister = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Register\"]");
    private final By tabBookTicket = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Book ticket\"]");
    private final By tabTicketPrice = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Ticket price\"]");
    private final By tabTimetable = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Timetable\"]");
    private final By tabContact = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Contact\"]");
    private final By tabChangePassword = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"Change password\"]");
    private final By tabMyTicket = By.xpath("//div[@id=\"menu\"]//a/span[text()=\"My ticket\"]");
    private final By lblWelcomeMessage = By.xpath("//div[@id=\"banner\"]/div/strong");
    private final By lblLoginErrorMsg = By.xpath("//div[@id=\"content\"]/p[@class=\"message error LoginForm\"]");
    private final By lblLoginPage = By.xpath("//div[@id=\"content\"]/h1[text()=\"Login Page\"]");
    private final By lblChangePasswordPage = By.xpath("//div[@id=\"menu\"]/ul/li[8]/a/span[text()=\"Change password\"]");
    private final By lblRegisterSuccessMsg = By.xpath("//div[@id=\"content\"]/p");
    private final By lblRegisterFailureMsg = By.xpath("//div[@id=\"content\"]/p[@class=\"message error\"]");
    private final By lblChangePasswordSuccessMsg = By.xpath("//form[@id=\"ChangePW\"]/fieldset//p[@class=\"message success\"]");
    private final By lblErrorPasswordMsg = By.xpath("//form[@id=\"RegisterForm\"]/fieldset/ol/li[@class=\"password\"]/label[@class=\"validation-error\"]");
    private final By lblErrorPidMsg = By.xpath("//form[@id=\"RegisterForm\"]/fieldset/ol/li[@class=\"pid-number\"]/label[@class=\"validation-error\"]");
    private final By lblBookTicketSuccessMsg = By.xpath("//div[@id=\"content\"]/h1[text()=\"Ticket Booked Successfully!\"]");
    //Elements

    protected WebElement getlblWelcomeMessage() {
        return Constant.WEBDRIVER.findElement(lblWelcomeMessage);
    }

    protected WebElement getLblBookTicketSuccessMsg() {
        return Constant.WEBDRIVER.findElement(lblBookTicketSuccessMsg);
    }

    protected WebElement getLblErrorPasswordMsg() {
        return Constant.WEBDRIVER.findElement(lblErrorPasswordMsg);
    }

    protected WebElement getLblErrorPidMsg() {
        return Constant.WEBDRIVER.findElement(lblErrorPidMsg);
    }

    protected WebElement getLblLoginErrorMsg() {
        return Constant.WEBDRIVER.findElement(lblLoginErrorMsg);
    }

    protected WebElement getLblRegisterFailureMsg() {
        return Constant.WEBDRIVER.findElement(lblRegisterFailureMsg);
    }

    protected WebElement getTabLogin() {
        return Constant.WEBDRIVER.findElement(tabLogin);
    }

    protected WebElement getTabLogout() {
        return Constant.WEBDRIVER.findElement(tabLogout);
    }

    protected WebElement getTabRegister() {
        return Constant.WEBDRIVER.findElement(tabRegister);
    }

    protected WebElement getLblRegisterSuccessMsg() {
        return Constant.WEBDRIVER.findElement(lblRegisterSuccessMsg);
    }

    protected WebElement getLblChangePasswordSuccessMsg() {
        return Constant.WEBDRIVER.findElement(lblChangePasswordSuccessMsg);
    }

    protected WebElement getLblLoginPage() {
        return Constant.WEBDRIVER.findElement(lblLoginPage);
    }

    protected WebElement getTabMyTicket() {
        return Constant.WEBDRIVER.findElement(tabMyTicket);
    }

    protected WebElement getTabBookTicket() {
        return Constant.WEBDRIVER.findElement(tabBookTicket);
    }

    protected WebElement getTabTicketPrice() {
        return Constant.WEBDRIVER.findElement(tabTicketPrice);
    }

    protected WebElement getTabTimetable() {
        return Constant.WEBDRIVER.findElement(tabTimetable);
    }

    protected WebElement getTabContact() {
        return Constant.WEBDRIVER.findElement(tabContact);
    }

    protected WebElement getTabChangePassword() {
        return Constant.WEBDRIVER.findElement(tabChangePassword);
    }

    protected WebElement getLblChangePassword() {
        return Constant.WEBDRIVER.findElement(lblChangePasswordPage);
    }

    //Methods
    public String getTxtChangePasswordTab() {
        return this.getTabChangePassword().getText();
    }

    public String getTxtLogoutTab() {
        return this.getTabLogout().getText();
    }

    public String getTxtMyTicketTab() {
        return this.getTabMyTicket().getText();
    }

    public String getWelcomeMessage() {
        return this.getlblWelcomeMessage().getText();
    }

    public String getErrorPasswordMsg() {
        return this.getLblErrorPasswordMsg().getText();
    }

    public String getBookTicketSuccessMsg() {
        return this.getLblBookTicketSuccessMsg().getText();
    }

    public String getRegisterFailureMsg() {
        return this.getLblRegisterFailureMsg().getText();
    }

    public String getLoginErrorMsg() {
        return this.getLblLoginErrorMsg().getText();
    }

    public String getChangePasswordSuccessMsg() {
        return this.getLblChangePasswordSuccessMsg().getText();
    }

    public String getErrorPidMsg() {
        return this.getLblErrorPidMsg().getText();
    }

    public String getLoginPageTitle() {
        return this.getLblLoginPage().getText();
    }

    public String getRegisterSuccessMsg() {
        return this.getLblRegisterSuccessMsg().getText();
    }

    public Railway_LoginPage gotoLoginPage() {
        this.getTabLogin().click();
        return new Railway_LoginPage();
    }

    public Railway_MyTicketPage gotoMyTicketPage() {
        this.getTabMyTicket().click();
        return new Railway_MyTicketPage();
    }

    public Railway_LogoutPage gotoLogoutPage() {
        this.getTabLogout().click();
        return new Railway_LogoutPage();
    }

    public Railway_RegisterPage gotoRegisterPage() {
        this.getTabRegister().click();
        return new Railway_RegisterPage();
    }

    public Railway_BookticketPage gotoBookTicketPage() {
        this.getTabBookTicket().click();
        return new Railway_BookticketPage();
    }

    public Railway_TicketpricePage gotoTicketPricePage() {
        this.getTabTicketPrice().click();
        return new Railway_TicketpricePage();
    }

    public Railway_TimetablePage gotoTimetablePage() {
        this.getTabTimetable().click();
        return new Railway_TimetablePage();
    }

    public Railway_ChangePasswordPage gotoChangePasswordPage() {
        this.getTabChangePassword().click();
        return new Railway_ChangePasswordPage();
    }

}
