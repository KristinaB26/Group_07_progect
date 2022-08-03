package com.cydeo.step_definitions;

import com.cydeo.pages.LibrarianPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingNewUser {

    LibrarianPage librarianPage = new LibrarianPage();
    LoginPage loginPage=new LoginPage();

    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),15);

    @Given("librarian is on the homePage")
    public void librarian_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        loginPage.InputEmailAddress.sendKeys("librarian1@library");
        loginPage.InputPassword.sendKeys("qU9mrvur");
        loginPage.signInBtn.click();

    }
    @When("librarian click Users module")
    public void librarian_click_users_module() {
        librarianPage.usersLink.click();
    }
    @When("librarian click “+Add User” button")
    public void librarian_click_add_user_button() {
        librarianPage.addUser.click();
    }

    @When("librarian enter full name, password, email and address")
    public void librarian_enter_full_name_password_email_and_address() {
        librarianPage.fullNameBox.sendKeys("James Bond");
        librarianPage.passwordBox.sendKeys("23423453");
        librarianPage.emailBox.sendKeys("bondjames@gmail.com");
        librarianPage.addressBox.sendKeys("Florida");
    }
    @When("librarian click save changes")
    public void librarian_click_save_changes() {
        librarianPage.saveChanges.click();
    }

    @Then("verify a new user is created")
    public void verify_a_new_user_is_created() {

        // Assert.assertEquals("bondjames2@gmail.com", librarianPage.newUserEmail.getText()); //Mehmet's Way

//Gizem's way
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='toast-message']")));

        String expectedMsg = "The user has been created.";
        String actualMsg = librarianPage.userHasBeenAddedMsg.getText();

        Assert.assertEquals("Message is not verified!", expectedMsg, actualMsg);

    }





}
