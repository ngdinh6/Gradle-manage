package PageObjects;
import Constraint.Constraint;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_Register extends Railway_GeneralPage {
    //encapsulates register page
    //inherrit General page

    //Locators
    private final By _txtEmail = By.xpath("//*[@id=\"email\"]");
    private final By _txtPassword = By.xpath("//*[@id=\"password\"]");
    private final By _txtConfirmPassword = By.xpath("//*[@id=\"confirmPassword\"]");
    private final By _txtPID = By.xpath("//*[@id=\"pid\"]");
    private final By _btnRegister = By.xpath("//*[@id=\"RegisterForm\"]/fieldset/p/input");

    //elements
    public WebElement getTxtEmail(){       return Constraint.WEBDRIVER.findElement(_txtEmail);    }
    public WebElement getTxtPassword(){
        return Constraint.WEBDRIVER.findElement(_txtPassword);
    }
    public WebElement getTxtConfirmPassword(){
        return Constraint.WEBDRIVER.findElement(_txtConfirmPassword);
    }
    public WebElement getTxtPID(){
        return Constraint.WEBDRIVER.findElement(_txtPID);
    }
    public WebElement getBtnRegisiter(){
        return Constraint.WEBDRIVER.findElement(_btnRegister);
    }

    //Method
    public Railway_HomePage login(String email, String password, String confirmPassword, String pid){
        //submit register cre
        this.getTxtEmail().sendKeys(email);
        this.getTxtPassword().sendKeys(password);
        this.getTxtConfirmPassword().sendKeys(confirmPassword);
        this.getTxtPID().sendKeys(pid);
        this.getBtnRegisiter().click();
        //land on Home page
        return new Railway_HomePage();
    }

}
