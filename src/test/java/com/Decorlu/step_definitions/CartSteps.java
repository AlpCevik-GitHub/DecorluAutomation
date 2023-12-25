package com.Decorlu.step_definitions;

import com.Decorlu.pages.CartPage;
import com.Decorlu.pages.LoginPage;
import com.Decorlu.utilities.BrowserUtils;
import com.Decorlu.utilities.ConfigurationReader;
import com.Decorlu.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

import javax.swing.*;
import java.time.Duration;

public class CartSteps {

    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
    Wait<WebDriver> waitFluent = new FluentWait<>(Driver.getDriver())
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoring(Exception.class);

    // JavaScript executor ile document.readyState'yi kontrol et


    @Given("I am logged in as a user")
    public void i_am_logged_in_as_a_user() {
        loginPage.login();
        waitFluent.until((ExpectedCondition<Boolean>) webDriver ->
                executor.executeScript("return document.readyState").equals("complete"));
        wait.until(ExpectedConditions.visibilityOf(cartPage.myCart));
        BrowserUtils.sleep(3);
    }


    @Given("User select {string} category")
    public void user_select_category(String string) {

           Actions actions = new Actions(Driver.getDriver());
            actions.clickAndHold(cartPage.furniture).perform();
            actions.moveToElement(cartPage.bahceMobilyalari).click().perform();
       // }
    }
    @When("User select {string} subcategory")
    public void user_select_subcategory(String string) {
        //Driver.getDriver().navigate().refresh();
        //wait.until(ExpectedConditions.elementToBeClickable(cartPage.firstProduct));
        //executor.executeScript("arguments[0].click();", cartPage.firstProduct);

    }
    @When("User select Marka")
    public void user_select_marka() {
        //wait.until(ExpectedConditions.elementToBeClickable(cartPage.firstBrand));
        //executor.executeScript("arguments[0].click();", cartPage.firstBrand);
    }
    @When("User select Fiyat Aralığı")
    public void user_select_fiyat_aralığı() {
        //wait.until(ExpectedConditions.elementToBeClickable(cartPage.firstPrice));
        //executor.executeScript("arguments[0].click();", cartPage.firstPrice);
    }
    @When("User select first product on the search result")
    public void user_select_first_product_on_the_search_result() {
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.firstProductInCategoryBahceMobilyalari));
        executor.executeScript("arguments[0].click();", cartPage.firstProductInCategoryBahceMobilyalari);
    }
    @When("User add the product to the cart")
    public void user_add_the_product_to_the_cart() {
        //BrowserUtils.sleep(5);
        executor.executeScript("var loadingSpinner = document.querySelector('.ngx-spinner-overlay');" +
                "if (loadingSpinner) { loadingSpinner.style.display = 'none'; }");
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.addToCartButton));
        executor.executeScript("arguments[0].click();", cartPage.addToCartButton);
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.successfullyAddedMessageCloseButton));
        Assert.assertTrue(cartPage.successfullyAddedMessage.getText().contains("Sepete başarılı bir şekilde eklediniz."));
        System.out.println(cartPage.successfullyAddedMessage.getText());
        executor.executeScript("arguments[0].click();", cartPage.successfullyAddedMessageCloseButton);


    }
    @When("User go to the cart")
    public void user_go_to_the_cart() {
        //Actions actions = new Actions(Driver.getDriver());
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.myCart));
       // actions.clickAndHold(cartPage.myCart).perform();
        executor.executeScript("arguments[0].click();", cartPage.myCart);
        executor.executeScript("arguments[0].click();", cartPage.goToBasketButton);
        //actions.moveToElement(cartPage.goToBasketButton).click().perform();
        BrowserUtils.sleep(2);
       WebElement element = Driver.getDriver().findElement(By.xpath(("/html/body")));
        element.click();


       // executor.executeScript("arguments[0].click();", cartPage.goToBasketButton);

    }
    @Then("Verify the product is added to the cart")
    public void verify_the_product_is_added_to_the_cart() {
        //Assert.assertTrue(cartPage.successfullyAddedMessage.isDisplayed());
    }
    @Then("Verify the product price is correct")
    public void verify_the_product_price_is_correct() {

    }
    @Then("Verify the product quantity is correct")
    public void verify_the_product_quantity_is_correct() {

    }
    @Then("Verify the product total price is correct")
    public void verify_the_product_total_price_is_correct() {

    }
    @Then("User increase the quantity of the product")
    public void user_increase_the_quantity_of_the_product() {

    }
    @Then("User decrease the quantity of the product")
    public void user_decrease_the_quantity_of_the_product() {

    }


    @Then("Verify the product quantity is increased")
    public void verify_the_product_quantity_is_increased() {

    }
    @Then("User delete the product from the cart")
    public void user_delete_the_product_from_the_cart() {

    }
    @Then("Verify the product is deleted from the cart")
    public void verify_the_product_is_deleted_from_the_cart() {

    }
    @Then("User confirm the cart")
    public void user_confirm_the_cart() {
        wait.until(webDriver -> executor.executeScript("return document.readyState").equals("complete"));
        WebElement element = Driver.getDriver().findElement(By.xpath(("/html/body")));
        element.click();
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.confirmCartButton));
        executor.executeScript("arguments[0].click();", cartPage.confirmCartButton);

    }
    @Then("User select delivery address")
    public void user_select_delivery_address() {
        //wait.until(webDriver -> executor.executeScript("return document.readyState").equals("complete"));
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.selectAddress));
        executor.executeScript("arguments[0].click();", cartPage.selectAddress);

    }

    @Then("User select payment method")
    public void user_select_payment_method() {
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.paymentInformation));
        executor.executeScript("arguments[0].click();", cartPage.paymentInformation);




    }
    @Then("User select first payment option")
    public void user_select_first_payment_option() {
        executor.executeScript("var loadingSpinner = document.querySelector('.ngx-spinner-overlay');" +
                "if (loadingSpinner) { loadingSpinner.style.display = 'none'; }");
        //cartPage.allCarts.click();
        WebElement element = Driver.getDriver().findElement(By.xpath(("/html/body")));
        element.click();
        BrowserUtils.sleep(3);
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.useSavedCards));
        executor.executeScript("arguments[0].click();", cartPage.useSavedCards);
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.firstCart));
        executor.executeScript("arguments[0].click();", cartPage.firstCart);
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.firstOptionForInstallment));
        executor.executeScript("arguments[0].click();", cartPage.firstOptionForInstallment);

    }
    @Then("Verify that total amount equals order summary amount")
    public void verify_that_total_amount_equals_order_summary_amount() {

    }

    @Then("User select terms of conditions")
    public void user_select_terms_of_conditions() {
        wait.until(webDriver -> executor.executeScript("return document.readyState").equals("complete"));
        wait.until(ExpectedConditions.elementToBeClickable(cartPage.termsAndConditions));
        executor.executeScript("arguments[0].click();", cartPage.termsAndConditions);

    }
    @Then("User click make the payment button")
    public void user_click_make_the_payment_button() {
        wait.until(webDriver -> executor.executeScript("return document.readyState").equals("complete"));

        executor.executeScript("document.body.click();");

        wait.until(ExpectedConditions.elementToBeClickable(cartPage.makeThePayment));
        executor.executeScript("arguments[0].click();", cartPage.makeThePayment);

    }
    @Then("User enter sms code {string} and click submit button")
    public void user_enter_sms_code_and_click_submit_button(String string) {
        wait.until(webDriver -> executor.executeScript("return document.readyState").equals("complete"));
        executor.executeScript("var loadingSpinner = document.querySelector('.ngx-spinner-overlay');" +
                "if (loadingSpinner) { loadingSpinner.style.display = 'none'; }");
        Driver.getDriver().switchTo().frame(cartPage.iframe);
        cartPage.smsCode.sendKeys(string);
        //executor.executeScript("arguments[0].click();", cartPage.submitButton);
        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("Verify that order is completed successfully")
    public void verify_that_order_is_completed_successfully() {
    //Assert.assertTrue(cartPage.paymentSuccessMessage.isDisplayed());
    }
    @Then("User click continueShoppingButton button")
    public void user_click_continueShoppingButton_button() {
        wait.until(webDriver -> executor.executeScript("return document.readyState").equals("complete"));
        //executor.executeScript("arguments[0].click();", cartPage.continueShoppingButton);
    }
    @Then("Verify that user is on the main page")
    public void verify_that_user_is_on_the_main_page() {

        //Assert.assertEquals(Driver.getDriver().getTitle(),"Decorlu – Türkiye'nin Online Pazaryeri Alışveriş Platformu - Decorlu");

    }
    @Then("User enter card information")
    public void user_enter_card_information(){
        BrowserUtils.sleep(3);
        executor.executeScript("var loadingSpinner = document.querySelector('.ngx-spinner-overlay');" +
                "if (loadingSpinner) { loadingSpinner.style.display = 'none'; }");


                cartPage.cardSahibininAdi.sendKeys("Test");
                cartPage.cardNumber.sendKeys(ConfigurationReader.getProperty("cardNo"));
                Select select = new Select(cartPage.expiredDateMonth);
                select.selectByIndex(1);
                Select select1 = new Select(cartPage.year);
                select1.selectByIndex(9);

//                executor.executeScript("arguments[0].click();", cartPage.expiredDateMonth);
//                wait.until(ExpectedConditions.elementToBeClickable(cartPage.expiredDateMonthFirstOption));
//                executor.executeScript("arguments[0].click();", cartPage.expiredDateMonthFirstOption);
//                executor.executeScript("arguments[0].click();", cartPage.year);
//                wait.until(ExpectedConditions.elementToBeClickable(cartPage.yearlastOption));
//                executor.executeScript("arguments[0].click();", cartPage.yearlastOption);
                cartPage.cvv.sendKeys("019");




        }
    }

