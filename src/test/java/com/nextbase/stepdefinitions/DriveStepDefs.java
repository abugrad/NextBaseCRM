package com.nextbase.stepdefinitions;
import com.nextbase.pages.DashboardPage;
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

    @When("the user navigates to {string} menu, {string} tab")
    public void the_user_navigates_to(String menu, String tab) {
        new DashboardPage().navigateToModule(menu, tab);
    }

    @Then("the user should be able to display {string}")
    public void the_user_should_be_able_to_display(String expTitle) {
        String actTitle = Driver.get().getTitle();

        Assert.assertEquals(expTitle,actTitle);
    }

}
