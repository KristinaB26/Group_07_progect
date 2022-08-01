package com.cydeo.step_definitions;

import com.cydeo.pages.LibrarianBasePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.StudentBasePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidLogin {

    LoginPage loginPage = new LoginPage();
    StudentBasePage studentBasePage = new StudentBasePage();
    LibrarianBasePage librarianBasePage = new LibrarianBasePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Then("verify that the URL is {string}")
    public void verify_that_the_url_is(String expectedUrl) {

        wait.until(ExpectedConditions.urlContains(expectedUrl));

        Assert.assertEquals("Url didn't match", expectedUrl, Driver.getDriver().getCurrentUrl());

    }

    @When("student enters valid email address and password")
    public void studentEntersValidEmailAddressAndPassword() {
        loginPage.InputEmailAddress.sendKeys("student1@library");
        loginPage.InputPassword.sendKeys("d5fv9BtX");
    }

    @When("student click sign in button")
    public void student_click_sign_in_button() {
        loginPage.signInBtn.click();
    }

    @Then("verify that there are {string} models on the page")
    public void verifyThatThereAreModelsOnThePage(String num) {
        int count = 0;
        BrowserUtils.waitForVisibility(studentBasePage.booksLink, 10);
        if (studentBasePage.booksLink.isDisplayed()) {
            count++;
        }

       // Assert.assertTrue(studentBasePage.booksLink.isDisplayed());

        BrowserUtils.waitForVisibility(studentBasePage.borrowingBookLink, 10);
        if (studentBasePage.borrowingBookLink.isDisplayed()) {
            count++;
        }

        Assert.assertTrue("2 model didn't displayed", Integer.parseInt(num) == count);

    }


    @Then("verify that the title is {string}")
    public void verify_that_the_title_is(String title) {
        Assert.assertEquals("Title didn't verified", title, Driver.getDriver().getTitle());
    }

    @When("librarian enters valid email address and password")
    public void librarian_enters_valid_email_address_and_password() {
        loginPage.InputEmailAddress.sendKeys("librarian1@library");
        loginPage.InputPassword.sendKeys("qU9mrvur");
    }

    @When("librarian click sign in button")
    public void librarian_click_sign_in_button() {
        loginPage.signInBtn.click();
    }


    @Then("verify that there are {int} models on the page")
    public void verify_that_there_are_models_on_the_page(Integer num) {
        int count = 0;

        BrowserUtils.waitForVisibility(librarianBasePage.booksLink, 10);
        if (librarianBasePage.booksLink.isDisplayed()) {
            count++;
        }

        BrowserUtils.waitForVisibility(librarianBasePage.usersLink, 10);
        if (librarianBasePage.usersLink.isDisplayed()) {
            count++;
        }

        BrowserUtils.waitForVisibility(librarianBasePage.dashboardLink, 10);
        if (librarianBasePage.dashboardLink.isDisplayed()) {
            count++;
        }

        Assert.assertTrue("3 model didn't displayed", num.equals(count));


    }



}
