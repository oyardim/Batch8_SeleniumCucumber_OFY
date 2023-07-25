package com.eurotech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I open browser and navigate to kraft login page");
    }

    @When("The user enters dd's credentials")
    public void the_user_enters_dd_s_credentials() {
        System.out.println("I enter dd's credentials");
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I can login to the web page");
    }

    @When("The user enters mike's credentials")
    public void the_user_enters_mike_s_credentials() {
        System.out.println("I enter mike's credentials");
    }

    @When("The user enters Rosa's credentials")
    public void the_user_enters_rosa_s_credentials() {
        System.out.println("I enter Rosa's credentials");
    }

    @When("The user enters Mansimmos's email")
    public void the_user_enters_mansimmos_s_email() {
        System.out.println("Enters mansimmos email");
    }

    @When("The user enters Mansimmo's password")
    public void the_user_enters_mansimmo_s_password() {
        System.out.println("Enters mansimmos password");
    }

    @When("The user clicks on login button")
    public void the_user_clicks_on_login_button() {
        System.out.println("Clicks on login button");
    }

    @Then("The user should be able to see own username")
    public void the_user_should_be_able_to_see_own_username() {
        System.out.println("Can be able to see own username");
    }
}
