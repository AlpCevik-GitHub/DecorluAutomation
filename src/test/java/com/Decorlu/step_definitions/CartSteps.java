package com.Decorlu.step_definitions;

import com.Decorlu.pages.CartPage;
import com.Decorlu.pages.LoginPage;
import com.Decorlu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class CartSteps {

    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();


    @Given("I am logged in as a user")
    public void i_am_logged_in_as_a_user() {
        loginPage.login();
    }
    @Given("I am on the store page")
    public void i_am_on_the_store_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I click on the {string} button")
    public void i_click_on_the_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see {string}")
    public void i_should_see(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
