package com.nextbase.stepdefinitions;

import com.nextbase.pages.BasePage;
import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.ConfigurationReader;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DriveStepDefs {

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String username = ConfigurationReader.get("help_desk_username");
        String password = ConfigurationReader.get("help_desk_password");
        new LoginPage().login(username,password);
    }

    @When("the user navigates to {string} {string}")
    public void the_user_navigates_to(String tab, String module) {
        new BasePage().navigateToModule(tab, module);
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expTitle) {
        String actTitle = Driver.get().getTitle();

        Assert.assertEquals(expTitle,actTitle);
    }

}
