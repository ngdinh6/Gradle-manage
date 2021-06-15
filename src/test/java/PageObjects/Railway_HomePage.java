package PageObjects;
import  Constraint.Constraint;
public class Railway_HomePage extends Railway_GeneralPage {
    //encapsulates Home page, starting point of all the test case
    //inherrit General page

    //Locator
    //Elements
    //Method

    public Railway_HomePage open(){
        Constraint.WEBDRIVER.navigate().to(Constraint.RAILWAY_URL);
        return this;
    }
}
