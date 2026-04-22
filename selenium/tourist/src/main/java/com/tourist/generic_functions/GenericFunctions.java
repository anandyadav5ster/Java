package com.tourist.generic_functions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class GenericFunctions {
    private WebDriver driver;
    public GenericFunctions(WebDriver driver){
        this.driver = driver;
    }

    public enum typeOfLocator {
        EVALUATEXPATH, EVALUATECSSSELECTOR, EVALUATEID, EVALUATELINKTEXT, EVALUATENAME, EVALUATECLASS, UIAUTOMATOR, ACCESSIBILITYID, UIAUTOMATION;
    }

    public boolean waitForPresenceAndVisibilityOfElement(String locator, String value) {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        List<WebElement> e;
        boolean bStatus= false;
        switch (typeOfLocator.valueOf(locator)) {
            case EVALUATEXPATH:
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(value)));
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(value)));
                e = driver.findElements(By.xpath(value));
                if(e.size() ==1){
                    bStatus = true;
                }
                break;
            case EVALUATECSSSELECTOR:
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(value)));
                wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(value)));
                e = driver.findElements(By.xpath(value));
                if(e.size() ==1){
                    bStatus = true;
                }
            break;
            default:
                break;
        }
        return bStatus;
    }


    public WebElement createWebElement(String locator, String value) {
        WebElement element = null;

        switch (typeOfLocator.valueOf(locator)) {
            case EVALUATEXPATH:
                if (waitForPresenceAndVisibilityOfElement(locator, value)){
                    element = driver.findElement(By.xpath(value));
                } else{
                    System.err.println("Element is not found with locator "+ locator + "value as "+value);
                }
                break;
             case EVALUATECSSSELECTOR:
                if (waitForPresenceAndVisibilityOfElement(locator, value)) {
                    element = driver.findElement(By.xpath(value));
                } else{
                    System.err.println("Element is not found with locator "+ locator + "value as "+value);
                }
                
                break;
            default:
                break;
        }
        return element;
    }
}
