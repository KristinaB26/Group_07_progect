package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMessage {
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @Given("user is on the loginPage")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("library.url"));
    }

    @When("user enters invalid email address or password")
    public void user_enters_invalid_email_address_or_password() {
        loginPage.InputEmailAddress.sendKeys("student1@library");
        loginPage.InputPassword.sendKeys("abc");
    }

    @When("user click sign in button")
    public void user_click_sign_in_button() {
        loginPage.signInBtn.click();

    }

    @Then("verify the error message {string}")
    public void verify_the_error_message(String err) {

        wait.until(ExpectedConditions.visibilityOf(loginPage.errorMsg));
        Assert.assertEquals("Error message is not verified", err, loginPage.errorMsg.getText());
    }

}
