package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianBasePage {

    public LibrarianBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//span[.='Dashboard']")
    public WebElement dashboardLink;

    @FindBy(xpath="//span[.='Users']")
    public WebElement usersLink;

    @FindBy(xpath="//span[.='Books']")
    public WebElement booksLink;

    @FindBy(id="navbarDropdown")
    public WebElement librarianNameLink;

    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOutBtn;

    public void logOut(){
        librarianNameLink.click();
        logOutBtn.click();
    }




}
