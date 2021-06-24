package testcase;

import Constant.Constant;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    //@BeforeTest
    @Parameters("browserName")
    @BeforeMethod
    public void setUp(String browserName) {

        System.out.println("browser: " + browserName);
        if (browserName.equalsIgnoreCase("ie")) {
            //System.setProperty("webdriver.ie.driver", "");
            Constant.WEBDRIVER = new InternetExplorerDriver();
            Constant.WEBDRIVER.manage().window();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            //System.setProperty("webdriver.gecko.driver", "");
            Constant.WEBDRIVER = new FirefoxDriver();
            Constant.WEBDRIVER.manage().window();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            //System.setProperty("webdriver.chrome.driver", "");
            Constant.WEBDRIVER = new ChromeDriver();
            Constant.WEBDRIVER.manage().window();
        }
    }
    /*
    public void beforeMethod () {
        System.out.println("Pre-Condition");
        Constant.WEBDRIVER = new ChromeDriver();
        Constant.WEBDRIVER.manage().window();
        Constant.WEBDRIVER.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Constant.WEBDRIVER.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }*/
    @AfterMethod
    public void afterMethod () {
        System.out.println("Post-condition");
        Constant.WEBDRIVER.quit();
    }
}