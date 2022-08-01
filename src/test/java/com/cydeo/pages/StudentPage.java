package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentPage {

   public StudentPage(){
       PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Books']")
   public WebElement booksLink;

   @FindBy(xpath = "//span[.='Borrowing Books']")
   public WebElement borrowingBookLink;

   @FindBy(id = "navbarDropdown")
    public WebElement studentNameLink;

   @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOutBtn;

}
