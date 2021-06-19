package PageObjects;
import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_LoginPage extends Railway_GeneralPage {
    //encapsulates login page
    //inherrit General page

    //Locators
    private final By _txtUsername = By.xpath("//input[@id=\"username\"]");
    private final By _txtPassword = By.xpath("//input[@id=\"password\"]");
    private final By _btnLogin = By.xpath("//form//p[@class=\"form-actions\"]/input[@value=\"Login\"]");


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
    //Method
    public Railway_LoginPage login(String username, String password){

        this.getTxtUsername().sendKeys(username);
        this.getTxtPassword().sendKeys(password);
        this.getBtnLogin().click();

        return new Railway_LoginPage();
    }

    public Railway_LoginPage loginWrongPassword(String username, String wpassword){
        for (int i=1; i<4; i++){
            this.getTxtUsername().sendKeys(username);
            this.getTxtPassword().sendKeys(wpassword);
            this.getBtnLogin().click();

        }
        final Railway_LoginPage railway_loginPage = new Railway_LoginPage();
        return railway_loginPage;
    }

}
