package com.Decorlu.step_definitions;

import com.Decorlu.pages.BasePage;
import com.Decorlu.pages.Practice;
import com.Decorlu.utilities.BrowserUtils;
import com.Decorlu.utilities.ConfigurationReader;
import com.Decorlu.utilities.Driver;
import io.cucumber.java.en.*;

public class BaseSteps {
Practice practice=new Practice();
    @Given("go to url")
    public void go_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
        practice.close.click();
    }
    @When("click giris")
    public void click_giris() {
        practice.giris.click();
    }
    @When("enter username")
    public void enter_username() {
        practice.username.sendKeys("username");
        BrowserUtils.sleep(2);
    }
    @When("enter password")
    public void enter_password() {
        practice.password.sendKeys("password");
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

}
