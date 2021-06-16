package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Constraint.Constraint;
public class Railway_Bookticket extends Railway_GeneralPage {

    //inherrit General page

    //Locators
    private final By _selectDepartDate = By.xpath("//form/fieldset/ol//select[@name=\"Date\"]");
    private final By _selectDepartStation = By.xpath("//form/fieldset/ol//select[@name=\"DepartStation\"]");
    private final By _selectArriveStation = By.xpath("//form/fieldset/ol//select[@name=\"ArriveStation\"]");
    private final By _selectSeatType = By.xpath("//form/fieldset/ol//select[@name=\"SeatType\"]");
    private final By _selectTicketAmount = By.xpath("//form/fieldset/ol//select[@name=\"TicketAmount\"]");
    private final By _btnSubmitBookTicket = By.xpath("//form[@method=\"post\"]/fieldset/input[@value=\"Book ticket\"]");
    //elements
    public WebElement getTxtUsername(){
        return Constraint.WEBDRIVER.findElement(_txtUsername);
    }
    public WebElement getTxtPassword(){
        return Constraint.WEBDRIVER.findElement(_txtPassword);
    }
    public WebElement getBtnLogin(){
        return Constraint.WEBDRIVER.findElement(_btnLogin);
    }
    public WebElement getLblLoginErrorMsg(){
        return Constraint.WEBDRIVER.findElement(_lblLoginErrorMsg);
    }

    //Method
    public Railway_HomePage login(String username, String password){
        //submit login cre
        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
        //land on Home page
        return new Railway_HomePage();
    }
}
