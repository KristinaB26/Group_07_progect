package com.G7.test.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Vytrack_Utilities {

    public static void vytrack_login() throws InterruptedException {
//username input
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));


        WebElement usernameBox = Driver.getDriver().findElement(By.name("_username"));
        usernameBox.sendKeys(ConfigurationReader.getProperty("vytrack.username"));

//pw input
        WebElement passwordBox = Driver.getDriver().findElement(By.name("_password"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("vytrack.pw"));

        WebElement loginBtn = Driver.getDriver().findElement(By.xpath("//button[.='Log in']"));
// login
        loginBtn.click();

        Thread.sleep(3000);

        Actions action = new Actions(Driver.getDriver());

        WebElement fleet = Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']"));
        WebElement vehicleTab = Driver.getDriver().findElement(By.xpath("//span[.='Vehicles']"));

        action.moveToElement(fleet).click(vehicleTab).perform();









    }
}
