package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianPage {

    public LibrarianPage(){
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

    @FindBy (xpath ="//a[.=' Add User']")
    public WebElement addUser;

    @FindBy (xpath = "//input[@name='full_name']")
    public WebElement fullNameBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy (xpath ="//input[@name='email']" )
    public WebElement emailBox;

    @FindBy (id = "address")
    public WebElement addressBox;

    @FindBy (xpath ="//button[.='Save changes']" )
    public WebElement saveChanges;

    @FindBy(xpath = "//a[.=' Add Book']")
    public WebElement addBook;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@name='isbn']")
    public WebElement isbnBox;

    @FindBy(xpath = "//input[@name='year']")
    public WebElement year;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement author;

    @FindBy(id = "description")
    public WebElement description;

    @FindBy(xpath = "//div[.='The user has been created']")  //TODO:check locator
    public WebElement userHasBeenAddedMsg;

    @FindBy(xpath = "//div[@id='toast-container']")  //TODO:check locator
    public WebElement newBookAddedMsg;



    public void logOut(){
        librarianNameLink.click();
        logOutBtn.click();
    }




}
