package com.tourist;


import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;

import com.tourist.config.readConfig;
import com.tourist.pages.GooglePage;

import io.restassured.specification.RequestSpecification;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest{

	public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
	public static ExtentTest test;
		public static void main(String[] args)
		{
			
			String reportPath = System.getProperty("user.dir")+"\\selenium\\Reports\\"+"extentReport.html";
			spark = new ExtentSparkReporter(reportPath);
			extent = new ExtentReports();
			extent.attachReporter(spark);
			driver = new ChromeDriver();
        	driver.manage().window().maximize();
			try{
			test = extent.createTest("Google Title Validation");
			// String url = readConfig.getproperty("url");
			driver.get("https://www.google.com");
			String title = driver.getTitle();
			test.log(Status.INFO, "Title of the page is " + title);
            Assert.assertEquals(title, "Google", "Title validation failed");
			// CAPTURE SCREENSHOT AFTER LOG
            String screenshotPath = takescreenshot("GooglePage");
            test.addScreenCaptureFromPath(screenshotPath);

            test.pass("Title validated successfully",MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
			
		}
		catch (Exception e) {
            test.log(Status.FAIL, "An error occurred: " + e.getMessage());
        } finally {
			driver.quit();
            // --- 4. Save/Flush the report ---
            extent.flush(); 
            System.out.println("Report generated: extentReport.html");
        }
	}


  // // FIX: Removed 'static'
    static String takescreenshot(String fileName) throws IOException {
        File srcshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "\\screenshots\\" + fileName + ".png";
        FileUtils.copyFile(srcshot, new File(path));
		return path;
    }


    

    
    // public void checkBrokenLinks() throws IOException {
    //     // FIX: You MUST create the test object before calling verify()
    //     test = extent.createTest("Broken Links Check");
        
    //     driver.get("https://testautomationpractice.blogspot.com/");
    //     List<WebElement> links = driver.findElements(By.tagName("a"));
        
    //     for (WebElement link : links) {
    //         String url = link.getAttribute("href");
    //         if (url != null && !url.isEmpty()) {
    //             verify(url);
    //         }
    //     }
    // }

    // // FIX: Removed 'static' so it can access the 'test' instance variable
    // void verify(String urlString) {
    //     try {
    //         URL link = new URL(urlString);
    //         HttpURLConnection connection = (HttpURLConnection) link.openConnection();
    //         connection.setConnectTimeout(3000);
    //         connection.connect();
            
    //         int statuscode = connection.getResponseCode();
    //         if (statuscode >= 400) {
    //             test.log(Status.WARNING, "URL is broken: " + urlString + " | Status Code: " + statuscode);
    //         } else {
    //             test.log(Status.INFO, "URL is valid: " + urlString + " | Status Code: " + statuscode);
    //         }
    //     } catch (Exception e) {
    //         test.log(Status.INFO, "Exception for URL " + urlString + ": " + e.getMessage());
    //     }
    // }

  

    // // FIX: Removed 'static'
    // void windowHandle() {
    //     String pw = driver.getWindowHandle();
    //     Set<String> allwin = driver.getWindowHandles();
    //     Iterator<String> it = allwin.iterator();
    //     while (it.hasNext()) {
    //         String cw = it.next();
    //         if (!cw.equalsIgnoreCase(pw)) {
    //             driver.switchTo().window(cw);
    //             test.log(Status.INFO, "Switched to window: " + cw);
    //         }
    //     }
	// }
}
