package PageObjects;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_RegisterPage extends Railway_GeneralPage {

    //Locators
    private final By _txtEmail = By.xpath("//*[@id=\"email\"]");
    private final By _txtPassword = By.xpath("//*[@id=\"password\"]");
    private final By _txtConfirmPassword = By.xpath("//*[@id=\"confirmPassword\"]");
    private final By _txtPID = By.xpath("//*[@id=\"pid\"]");
    private final By _btnRegister = By.xpath("//*[@id=\"RegisterForm\"]/fieldset/p/input");



    //elements
    public WebElement getTxtEmail(){
        return Constant.WEBDRIVER.findElement(_txtEmail);
    }
    public WebElement getTxtPassword(){
        return Constant.WEBDRIVER.findElement(_txtPassword);
    }
    public WebElement getTxtConfirmPassword(){
        return Constant.WEBDRIVER.findElement(_txtConfirmPassword);
    }
    public WebElement getTxtPID(){
        return Constant.WEBDRIVER.findElement(_txtPID);
    }
    public WebElement getBtnRegister(){
        return Constant.WEBDRIVER.findElement(_btnRegister);
    }

    //Method
    public Railway_RegisterPage register(String email, String password, String confirmPassword, String pid){

        this.getTxtEmail().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
        this.getTxtPID().sendKeys(pid);
        this.getBtnRegister().click();
        //land on Home page
        return new Railway_RegisterPage();
    }

}
