package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
  public   WebElement  InputEmailAddress;

    @FindBy(id = "inputPassword")
  public   WebElement  InputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
  public   WebElement signInBtn;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement errorMsg;


}
