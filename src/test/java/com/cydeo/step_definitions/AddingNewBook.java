package com.cydeo.step_definitions;

import com.cydeo.pages.LibrarianPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingNewBook {

    LibrarianPage librarianPage = new LibrarianPage();
    LoginPage loginPage = new LoginPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);

    @When("librarian click Books module")
    public void librarian_click_books_module() {
        librarianPage.booksLink.click();
    }

    @When("librarian click \"+Add Book” button")
    public void librarian_click_add_book_button() {
        librarianPage.addBook.click();
    }

    @When("librarian enter BookName, ISBN, Year, Author, and Description")
    public void librarian_enter_book_name_isbn_year_author_and_description() {
        librarianPage.nameBox.sendKeys("Harry Potter");
        librarianPage.isbnBox.sendKeys("123");
        librarianPage.year.sendKeys("2000");
        librarianPage.author.sendKeys("J.K. Rowling");
        librarianPage.description.sendKeys("Fantasy Book");

    }

    @Then("verify a new book is added")
    public void verify_a_new_book_is_added() {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='toast-message']")));

        String expectedMsg = "The book has been created.";
        String actualMsg = librarianPage.newBookAddedMsg.getText();

        Assert.assertEquals("Message is not verified!", expectedMsg, actualMsg);
    }

}
