package PageObjects;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_LoginPage extends Railway_GeneralPage {
    //encapsulates login page
    //inherrit General page

    //Locators
    private final By _txtUsername = By.xpath("//input[@id='username']");
    private final By _txtPassword = By.xpath("//input[@id='password']");
    private final By _btnLogin = By.xpath("//input[@value='login']");
    private final By _lblLoginErrorMsg = By.xpath("//div[@id=\"content\"]/p[@class=\"message error LoginForm\"]");

    //elements
    public WebElement getTxtUsername(){
        return Constant.WEBDRIVER.findElement(_txtUsername);
    }
    public WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(_txtPassword);
    }
    public WebElement getBtnLogin(){
        return Constant.WEBDRIVER.findElement(_btnLogin);
    }
    public WebElement getLblLoginErrorMsg(){
        return Constant.WEBDRIVER.findElement(_lblLoginErrorMsg);
    }

    //Method
    public Railway_LoginPage login(String username, String password){

        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();
        //land on Home page
        return new Railway_LoginPage();
    }

}
