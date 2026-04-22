package com.tourist;


import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;

import com.tourist.config.readConfig;
import com.tourist.pages.GooglePage;





/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest{
  GooglePage googlePage;


  @Test
  public void testGoogleTitle(){
    googlePage = new GooglePage(driver);
    String url = readConfig.getproperty("url");
	System.out.println(url);
    driver.get(url);
    String title = driver.getTitle();
    Assert.assertEquals(title, "Google","Title validation failed");
  }

  static void checkBrokenLinks() throws IOException{

		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement link : links){
			String url = link.getAttribute("href");
			verify(url);
		}
	}
	static void verify(String url) throws IOException{

		URL link = new URL(url);
		HttpURLConnection connection = (HttpURLConnection)link.openConnection();
		connection.setConnectTimeout(3000);
		int statuscode = connection.getResponseCode();
		if(statuscode==200){
			System.out.println("URL is valid");
		}
		else{
			System.out.println("URl is not valid");
		}
	}
	
	@Test
	static void takescreenshot() throws IOException{
		TakesScreenshot srcshot = ((TakesScreenshot)driver);
		java.io.File src = srcshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new java.io.File("path to save"));
	}
	
	@Test

	static void windowHandle(){
		String pw= driver.getWindowHandle();
		java.util.Set<String> allwin = driver.getWindowHandles();
		java.util.Iterator<String> it = allwin.iterator();
		while(it.hasNext()){
			String cw = it.next();
			if(!cw.equalsIgnoreCase(pw)){
				driver.switchTo().window(cw);
			}
		}
	}
 
}
