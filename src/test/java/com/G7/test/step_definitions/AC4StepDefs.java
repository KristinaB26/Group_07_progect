package com.G7.test.step_definitions;

import com.G7.test.Utilities.BrowserUtils;
import com.G7.test.pages.VehiclePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AC4StepDefs {

    VehiclePage vehiclePage = new VehiclePage();

    @When("the user navigates to {string} ,{string}")
    public void the_user_navigates_to(String string, String string2) {
        vehiclePage.navigateToModule(string,string2);
        BrowserUtils.waitFor(2);
    }
    @Then("User should be able click reset button")
    public void user_should_be_able_click_reset_button() {
        vehiclePage.reset.click();
    }


}
/*
@When("the user navigates to {string} ,{string}")
    public void the_user_navigates_to(String string, String string2) {


        vehiclePage.navigateToModule(string,string2);
        BrowserUtils.waitFor(2);
    }

    @Then("User should be able click reset button")
    public void user_should_be_able_click_reset_button() {

        vehiclePage.reset.click();

    }
 */