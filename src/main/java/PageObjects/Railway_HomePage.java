package PageObjects;

import Constant.Constant;

public class Railway_HomePage extends Railway_GeneralPage {
    //encapsulates Home page, starting point of all the test case
    //inherrit General page

    //Locator
    //Elements
    //Method

    public Railway_HomePage open() {
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
