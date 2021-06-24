package testcase;

import Constant.Constant;
import Extent_Report.Utility;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.IOException;

public class BaseTest {
    // Create global variable which will be used in all method
    ExtentReports extent;
    ExtentTest logger;

    @Parameters("browserName")
    @BeforeMethod
    // This code will run before executing any testcase
    public void setup() {
        ExtentHtmlReporter reporter = new ExtentHtmlReporter("java/Extent_Report/ExtentReport.html");

        extent = new ExtentReports();

        extent.attachReporter(reporter);

        logger = extent.createTest("TC 01");
    }

    public void setUp(String browserName) throws Exception {

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
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            String temp = Utility.getScreenshot(Constant.WEBDRIVER);

            logger.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        }

        extent.flush();
        Constant.WEBDRIVER.quit();

    }

}