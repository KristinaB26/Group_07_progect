package com.G7.test.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {
    public static String returnOrderDate(WebDriver driver, String custumerName) {
        String locator = "//td=.='" +custumerName + "']//following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        return  customerDateCell.getText();

    }
    public static String returnOrderDate2 (WebDriver driver, String customerName) {

        return driver.findElement(By.xpath("//td=.='" +customerName + "']//following-sibling::td[3]")).getText();
    }


    //Method #2 info:
    //• Name: orderVerify ()
    //• Return type: void
    //• Arg1: WebDriver driver
    //• Arg2: String customerName
    //• Arg3: String expectedOrderDate
    //This method should accept above-mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.

    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate) {
        String locator = "//td=.='" +customerName + "']//following-sibling::td[3]";

        WebElement customerDateCell = driver.findElement(By.xpath(locator));

        Assert.assertEquals(customerDateCell.getText(), expectedOrderDate, "Order dates are not matched");

    }


}
