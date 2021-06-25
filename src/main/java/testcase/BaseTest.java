package testcase;

import Constant.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
public class BaseTest {
    @Parameters("browserName")
    @BeforeMethod
    public void setUp( String browserName) throws Exception {

        System.out.println("browser: " + browserName);
        if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            Constant.WEBDRIVER = new EdgeDriver();
            Constant.WEBDRIVER.manage().window();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            Constant.WEBDRIVER = new FirefoxDriver();
            Constant.WEBDRIVER.manage().window();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            Constant.WEBDRIVER = new ChromeDriver();
            Constant.WEBDRIVER.manage().window();
        }
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Post-Condition");
        Constant.WEBDRIVER.quit();
    }

}