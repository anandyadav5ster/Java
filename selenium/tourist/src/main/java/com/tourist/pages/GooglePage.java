package com.tourist.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GooglePage {

    private WebDriver driver;
    private WebDriverWait wait;
    
    public By searchBox = By.name("q");


    public GooglePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean waitMethod(By locator){
        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
        } catch (Exception e) {
             return false;
        }
       
       
    }
    public void navigateTo(){
        driver.get("https://www.google.com");
    }
  
    public String getTitle() {
        String title = driver.getTitle();
        return title;
    }



    
}
