package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        homePage.clickOnRegisterButtonOnHomePage();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        homePage.registrationDetails();
    }
    @When("I click on register button")
    public void i_click_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
       registrationPage.clickOnRegistrationButton();
    }
    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        registrationPage.clickOnRegistrationButton();
    }

}
