package com.tourist;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


/**
 * Parent class for all tests to manage WebDriver lifecycle.
 */
public class BaseTest {
    protected static WebDriver driver;
    public static ExtentReports objExtenteport;
    public static ExtentTest objExtentTest;
    public static final Logger log = LogManager.getLogger(BaseTest.class);


    public enum typeOfBrowser {
            chrome, firefox, edge;
        }
    @BeforeMethod
    public WebDriver setup() {
        // Read browser from terminal command line: mvn test -Dbrowser=chrome
        String browser = System.getProperty("browser", "chrome").toLowerCase();
         switch (typeOfBrowser.valueOf(browser)) {
            case chrome:
                log.info("Opening "+ browser+ " Browser");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case firefox:
                log.info("Opening "+ browser+ " Browser");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                break;
        }
        
        driver.manage().window().maximize();
        return driver;
    }

    @AfterMethod
    public void tearDown() {
        log.info("Close Browser");
        if (driver != null) {
            driver.quit();
        }
      objExtenteport.flush();
       File file = new File(System.getProperty("user.dir"));
       String reportPath = file+"\\" + "reports" + File.separator + "ExecutionReport.html";
    }
}
