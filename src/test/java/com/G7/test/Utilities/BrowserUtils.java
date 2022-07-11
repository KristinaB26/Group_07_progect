package com.G7.test.Utilities;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    //    TC : Create utility method
//   1. Create a new class called BrowserUtils
//   2. Create a method to make Multiple Windows logic re-usable 3. When method is called, it should switch window and verify
//    title.

//    Method info:
//   • Name: switchWindowAndVerify
//   • Return type: void
//   • Arg1: WebDriver
//   • Arg2: String expectedInUrl
//   • Arg3: String expectedTitle

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle) {

        Set<String> allWindowHandles = driver.getWindowHandles();

        for(String each : allWindowHandles) {
            driver.switchTo().window(each);
            if(driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title  Verification failed!");


    }

    public static void verifyTitle(WebDriver driver, String expectedTitle) {
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Title Verification failed");
    }
    public static void waitForInvisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }


    public static boolean checkVisibilityOfElement (WebElement element, int timeToWait) {
        boolean result = false;
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWait);

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            result = true;
        } catch (TimeoutException e) {
            System.out.println("Element was not visible within the timeframe");
        }
        return result;
    }

}
