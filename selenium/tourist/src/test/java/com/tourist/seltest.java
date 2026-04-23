package com.tourist;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class seltest {
    public static WebDriver driver;
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;

    @Test
    public void Google() {

        String currentDir = System.getProperty("user.dir");
        // Create a File object and get the parent
        File file = new File(currentDir);
        String parentDir = file.getParent();
        String reportPath = parentDir + "\\Reports\\" + "extentReport.html";
        System.out.println(reportPath);
        spark = new ExtentSparkReporter(reportPath);
        extent = new ExtentReports();
        extent.attachReporter(spark);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            test = extent.createTest("Google Title Validation");
            // String url = readConfig.getproperty("url");
            driver.get("https://www.google.com");
            String title = driver.getTitle();
            test.log(Status.INFO, "Title of the page is " + title);
            Assert.assertEquals(title, "Google", "Title validation failed");
            // CAPTURE SCREENSHOT AFTER LOG
            String screenshotPath = takescreenshot("GooglePage");

            test.pass("Title validated successfully",
                    MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());

        } catch (Exception e) {
            test.log(Status.FAIL, "An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
            // --- 4. Save/Flush the report ---
            extent.flush();
            System.out.println("Report generated: extentReport.html");
        }
    }

    static String takescreenshot(String fileName) throws IOException {
        File srcshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        File file  =  new File(currentDir);
        String parentDir = file.getParent();
        String srcPath =  parentDir+"\\screenshots\\" + fileName + ".png";
        FileUtils.copyFile(srcshot, new File(srcPath));
        return srcPath;
    }
}
