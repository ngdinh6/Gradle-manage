package PageObjects;
import Constraint.Constraint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_LoginPage extends Railway_GeneralPage {
    //encapsulates login page
    //inherrit General page

    //Locators
    private final By _txtUsername = By.xpath("//input[@id='username']");
    private final By _txtPassword = By.xpath("//input[@id='password']");
    private final By _btnLogin = By.xpath("//input[@value='login']");
    private final By _lblLoginErrorMsg = By.xpath("//p[@class='message error LoginForm']");

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
