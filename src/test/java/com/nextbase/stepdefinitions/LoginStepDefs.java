package com.nextbase.stepdefinitions;

import com.nextbase.pages.LoginPage;
import com.nextbase.utilities.BrowserUtils;
import com.nextbase.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @When("the user enters {string} and {string}")
    public void the_user_enters_and(String userName, String password) {
        loginPage.login(userName,password);
    }

    @Then("the user should be on the home page")
    public void the_user_should_be_on_the_home_page() {
        String actTitle = Driver.get().getTitle();
        String expTitle = "Portal";

        Assert.assertEquals(expTitle,actTitle);
    }

    @Then("{string} warning should be displayed")
    public void warning_should_be_displayed(String expWarning) {
        String warningMsg = loginPage.warning.getText();
        Assert.assertEquals(expWarning,warningMsg);
    }

    @When("the user enters {string} and {string} {int} times")
    public void the_user_enters_and_times(String userName, String password, Integer attempt) {
        for(int i=1;i<=attempt;i++){
            loginPage.login(userName,password);
            BrowserUtils.waitForPageToLoad(2);
            BrowserUtils.waitFor(1);
        }
    }

    @Then("user should not be able to try to login")
    public void user_should_not_be_able_to_try_to_login() {
        boolean isSubmitEnabled = loginPage.submit.isEnabled();

        Assert.assertFalse(isSubmitEnabled);
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
    }

    @When("the user enters {string} username and {string} password")
    public void the_user_enters_username_and_password(String username, String password) {
        loginPage.login(username,password);

    }

}
