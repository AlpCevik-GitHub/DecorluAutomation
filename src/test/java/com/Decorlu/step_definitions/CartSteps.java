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


    @Given("User select {string} category")
    public void user_select_category(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User select {string} subcategory")
    public void user_select_subcategory(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User select Marka")
    public void user_select_marka() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User select Fiyat Aralığı")
    public void user_select_fiyat_aralığı() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User select first product on the search result")
    public void user_select_first_product_on_the_search_result() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User add the product to the cart")
    public void user_add_the_product_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User go to the cart")
    public void user_go_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the product is added to the cart")
    public void verify_the_product_is_added_to_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the product price is correct")
    public void verify_the_product_price_is_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the product quantity is correct")
    public void verify_the_product_quantity_is_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the product total price is correct")
    public void verify_the_product_total_price_is_correct() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User increase the quantity of the product")
    public void user_increase_the_quantity_of_the_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the product quantity is increased")
    public void verify_the_product_quantity_is_increased() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User delete the product from the cart")
    public void user_delete_the_product_from_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify the product is deleted from the cart")
    public void verify_the_product_is_deleted_from_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User confirm the cart")
    public void user_confirm_the_cart() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User select delivery address")
    public void user_select_delivery_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User select terms of conditions")
    public void user_select_terms_of_conditions() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User select payment method")
    public void user_select_payment_method() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User select first payment option")
    public void user_select_first_payment_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that total amount equals order summary amount")
    public void verify_that_total_amount_equals_order_summary_amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User click make the payment button")
    public void user_click_make_the_payment_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User enter sms code {string} and click submit button")
    public void user_enter_sms_code_and_click_submit_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that order is completed successfully")
    public void verify_that_order_is_completed_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User click Return to my orders button")
    public void user_click_return_to_my_orders_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Verify that order is listed in my orders page")
    public void verify_that_order_is_listed_in_my_orders_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
