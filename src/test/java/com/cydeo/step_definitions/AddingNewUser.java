package com.cydeo.step_definitions;

import com.cydeo.pages.LibrarianBasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingNewUser {

    LibrarianBasePage librarianBasePage= new LibrarianBasePage();
    LoginPage loginPage=new LoginPage();

    @Given("librarian is on the homePage")
    public void librarian_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
        loginPage.InputEmailAddress.sendKeys("librarian1@library");
        loginPage.InputPassword.sendKeys("qU9mrvur");
        loginPage.signInBtn.click();

    }
    @When("librarian click Users module")
    public void librarian_click_users_module() {
       librarianBasePage.usersLink.click();
    }
    @When("librarian click “+Add User” button")
    public void librarian_click_add_user_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("librarian enter full name, password, email and address")
    public void librarian_enter_full_name_password_email_and_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("librarian click save changes")
    public void librarian_click_save_changes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify a new user is created")
    public void verify_a_new_user_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @When("librarian click Books module")
    public void librarian_click_books_module() {
        librarianBasePage.booksLink.click();
    }
    @When("librarian click \"+Add Book” button")
    public void librarian_click_add_book_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("librarian enter BookName, ISBN, Year, Author, and Description")
    public void librarian_enter_book_name_isbn_year_author_and_description() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify a new book is added")
    public void verify_a_new_book_is_added() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




}
