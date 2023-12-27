package com.Decorlu.step_definitions;

import com.Decorlu.pages.BasePage;
import com.Decorlu.pages.CategoryProducts;
import com.Decorlu.pages.Practice;
import com.Decorlu.pages.Sepet;
import com.Decorlu.utilities.BrowserUtils;
import com.Decorlu.utilities.ConfigurationReader;
import com.Decorlu.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseSteps {
Practice practice=new Practice();
    Sepet sepet = new Sepet();
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
    @When("User click yapı market button")
    public void yapi() {
        this.sepet.yapimarket.click();
    }

    @When("User click bahce button")
    public void bahce() {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        this.sepet.bahceMobilyalari.click();
        Sepet var10000 = this.sepet;

        for(List<WebElement> temp = Sepet.products; temp.size() < Integer.parseInt(this.sepet.toplamUrunSayisi.getText()); temp = Sepet.products) {
            executor.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'instant' })", new Object[0]);
            var10000 = this.sepet;
        }

        Sepet var10001 = this.sepet;
        System.out.println(Sepet.products.size());
        var10001 = this.sepet;
        System.out.println(((WebElement)Sepet.products.get(0)).getText());
        CategoryProducts firstProduct = new CategoryProducts();
        System.out.println("((Category) firstProduct).getName(0) = " + firstProduct.getName(0));
        System.out.println("((Category) firstProduct).getBrand(0) = " + firstProduct.getBrand(0));
        System.out.println("((Category) firstProduct).getPrice(0) = " + firstProduct.getPrice(0));
    }
}
