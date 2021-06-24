package PageObjects;

import Constant.Constant;

public class Railway_HomePage extends Railway_GeneralPage {

    public Railway_HomePage open() {
        Constant.WEBDRIVER.navigate().to(Constant.RAILWAY_URL);
        return this;
    }
}
