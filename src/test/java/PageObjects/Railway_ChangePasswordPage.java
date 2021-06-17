package PageObjects;

import Constant.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Railway_ChangePasswordPage {


    //Locators
    private final By _txtCurrentPass = By.xpath("//input[@id=\"currentPassword\"]");
    private final By _txtNewPassword = By.xpath("//input[@id=\"newPassword\"]");
    private final By _txtConfirmNewPassword = By.xpath("//input[@id=\"confirmPassword\"]");
    private final By _btnChangePassword = By.xpath("//input[@value=\"Change Password\"]");
    //change pass success inform
    //form[@id="ChangePW"]/fieldset/p[@class="message success"]
    //elements
    public WebElement getTxtCurrentPass(){
        return Constant.WEBDRIVER.findElement(_txtCurrentPass);
    }
    public WebElement gettxtNewPassword(){
        return Constant.WEBDRIVER.findElement(_txtNewPassword);
    }
    public WebElement getTxtConfirmNewPassword(){
        return Constant.WEBDRIVER.findElement(_txtConfirmNewPassword);
    }
    public WebElement getBtnChangePassword(){
        return Constant.WEBDRIVER.findElement(_btnChangePassword);
    }

    //Method
    public Railway_ChangePasswordPage changePassword(String currentPassword, String newPassword, String confirmNewPassword){

        this.getTxtCurrentPass().sendKeys(currentPassword);
        this.gettxtNewPassword().sendKeys(newPassword);
        this.getTxtConfirmNewPassword().sendKeys(confirmNewPassword);
        this.getBtnChangePassword().click();
        return new Railway_ChangePasswordPage();
    }
}
