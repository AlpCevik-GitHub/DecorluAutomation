package com.Decorlu.step_definitions;

import com.Decorlu.pages.LoginPage;
import com.Decorlu.utilities.BrowserUtils;
import com.Decorlu.utilities.ConfigurationReader;
import com.Decorlu.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class LoginSteps {


    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

    @When("Go to login page")
    public void go_to_login_page() {
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.girisYapKayitOlButton));
        executor.executeScript("arguments[0].click();",loginPage.girisYapKayitOlButton);
       // BrowserUtils.sleep(4);
        wait.until(ExpectedConditions.elementToBeClickable(loginPage.girisYapButton));
        executor.executeScript("arguments[0].click();",loginPage.girisYapButton);

    }
    @When("Enter valid username in username field")
    public void enter_valid_username_in_username_field() {
        loginPage.emailBox.sendKeys(ConfigurationReader.getProperty("username"));


    }
    @When("Enter valid password in password field")
    public void enter_valid_password_in_password_field() {

        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));


    }
    @When("Click on the login button")
    public void click_on_the_login_button() {

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginButton));


        executor.executeScript("arguments[0].click();",loginPage.loginButton);

    }
    @Then("Verify that user can login")
    public void verify_that_user_can_login() {

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginSuccessMessageCloseButton));

        Assert.assertTrue(loginPage.loginSuccessMessage.getText().contains("Başarılı bir şekilde giriş yaptınız."));
        System.out.println(loginPage.loginSuccessMessage.getText());
        executor.executeScript("arguments[0].click();", loginPage.loginSuccessMessageCloseButton);
        //loginPage.closePopUpLogin.click();
    }


    @When("Enter valid username in username field and password in password field")
    public void enter_valid_username_in_username_field_and_password_in_password_field(Map<String,String> credentials) {

        loginPage.emailBox.sendKeys(credentials.get("username"));
        loginPage.passwordBox.sendKeys(credentials.get("password"));


    }
    @When("hit enter key word")
    public void hit_enter_key_word() {

        loginPage.passwordBox.sendKeys(Keys.ENTER);

    }

    @When("Enter referred credentials {string} {string}")
    public void enter_referred_credentials(String string, String string2) {

        loginPage.emailBox.sendKeys(string);

        loginPage.passwordBox.sendKeys(string2);

        loginPage.loginButton.click();

    }
    @Then("user should not be login and  see the message {string}")
    public void user_should_not_be_login_and_see_the_message(String string) {

        wait.until(ExpectedConditions.elementToBeClickable(loginPage.loginFailMessageCloseButton));

        Assert.assertTrue(loginPage.loginFailMessage.getText().contains(string));
        System.out.println(loginPage.loginFailMessage.getText());
        executor.executeScript("arguments[0].click();", loginPage.loginFailMessageCloseButton);


    }
    @When("User enter credentials {string} {string}")
    public void user_enter_credentials(String string, String string2) {
        loginPage.emailBox.clear();
        loginPage.emailBox.sendKeys(string);
//        if (loginPage.emailBox.getText().equals("")) {
//            loginPage.emailBox.sendKeys("a");
//            loginPage.emailBox.clear();
//        }

        loginPage.passwordBox.clear();
        loginPage.passwordBox.sendKeys(string2);
        loginPage.passwordBox.sendKeys(Keys.BACK_SPACE);
//        if (loginPage.passwordBox.getText().isEmpty()) {
//            loginPage.passwordBox.sendKeys("a");
//            loginPage.passwordBox.clear();
//        }

    }
    @Then("User should see message for typosMessageForEmail{string}")
    public void user_should_see_message_for_typosMessageForEmail(String string) {
        Assert.assertTrue(loginPage.typosMessageForEmail.isDisplayed());
        Assert.assertEquals(string,loginPage.typosMessageForEmail.getText());
    }

    @Then("User should see message for blankMessageForEmail{string}")
    public void user_should_see_message_for_blankMessageForEmail(String string) {
        Assert.assertTrue(loginPage.blankMessageForEmail.isDisplayed());
        Assert.assertEquals(string,loginPage.blankMessageForEmail.getText());
    }

    @Then("User should see message for blankMessageForPassword{string}")
    public void user_should_see_message_for_blankMessageForPassword(String string) {
        Assert.assertTrue(loginPage.blankMessageForPassword.isDisplayed());
        Assert.assertEquals(string,loginPage.blankMessageForPassword.getText());
    }

    @Then("User should see message for blank{string}")
    public void user_should_see_message_for_blank(String string) {
        Assert.assertTrue(loginPage.blankMessageForPassword.isDisplayed());
        Assert.assertEquals(string,loginPage.blankMessageForPassword.getText());
    }

    @Then("User should not be login and  see the pop-up message {string}")
    public void User_should_not_be_login_and_see_the_pop_up_message(String string) {

        loginPage.loginButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        String actual = wait.until(ExpectedConditions.visibilityOf(loginPage.loginFailMessage2)).getText();

        Assert.assertEquals(string,actual);

    }

    @When("Click on the create an account button")
    public void click_on_the_create_an_account_button() {
       loginPage.uyelikOlusturButton.click();

    }
    @When("Enter valid name in name field")
    public void enter_valid_name_in_name_field() {
        loginPage.nameBox.sendKeys(faker.name().firstName());

    }
    @When("Enter valid surname in surname field")
    public void enter_valid_surname_in_surname_field() {
       loginPage.lastNameBox.sendKeys(faker.name().lastName());

    }
    @When("Enter valid email address in email field")
    public void enter_valid_email_address_in_email_field() {
        loginPage.emailBox2.sendKeys("sjtbl.test@inbox.testmail.app");

    }

    @When("Enter valid telephone number in telephone field")
    public void Enter_valid_telephone_number_in_telephone_field() {
        loginPage.telefonBox.sendKeys(faker.phoneNumber().cellPhone());

    }
    @When("Enter valid password in parola field")
    public void enter_valid_password_in_parola_field() {
        loginPage.parolaBox.sendKeys("Ab123456,");

    }
    @When("Enter valid password in parola tekrar field")
    public void enter_valid_password_in_parola_tekrar_field() {
        loginPage.sifreTekrarBox.sendKeys("Ab123456,");

    }
    @When("Select the checkbox of Gender")
    public void select_the_checkbox_of_gender() {
        loginPage.genderSelection.click();

    }
    @When("Select the checkbox of Terms of Use")
    public void select_the_checkbox_of_terms_of_use() {
        loginPage.termsAndConditions1.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //JavaScripts method to use : arguments[0].scrollIntoView(true)

        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", loginPage.termsAndConditions2);

        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", loginPage.termsAndConditions3);


    }
    @Then("Verify that user can create an account")
    public void verify_that_user_can_create_an_account() {

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //JavaScripts method to use : arguments[0].scrollIntoView(true)

        js.executeScript("arguments[0].scrollIntoView(true);" + "arguments[0].click()", loginPage.createAccountButton);

        loginPage.verifyAccountOnEmail();


    }











}
