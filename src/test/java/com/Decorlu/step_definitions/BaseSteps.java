package com.Decorlu.step_definitions;

import com.Decorlu.pages.CategoryProducts;
import com.Decorlu.pages.Sepet;
import com.Decorlu.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseSteps {

    Sepet sepet = new CategoryProducts();

    @When("User click yapı market button")
    public void yapi() {
        sepet.yapimarket.click();
    }

    @When("User click bahce button")
    public void bahce() {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
       sepet.bahceMobilyalari.click();
        Sepet var10000 = sepet;

        for(List<WebElement> temp = sepet.productsCategoryPage; temp.size() < Integer.parseInt(sepet.toplamUrunSayisi.getText()); temp = sepet.productsCategoryPage) {
            executor.executeScript("window.scrollTo({ top: document.body.scrollHeight, behavior: 'instant' })", new Object[0]);
            var10000 = sepet;
        }

        Sepet var10001 = sepet;
        System.out.println(sepet.productsCategoryPage.size());
        var10001 = sepet;
        System.out.println(((WebElement)sepet.productsCategoryPage.get(0)).getText());
        CategoryProducts firstProduct = new CategoryProducts();
        System.out.println("((Category) firstProduct).getName(0) = " + firstProduct.getName(0));
        System.out.println("((Category) firstProduct).getBrand(0) = " + firstProduct.getBrand(0));
        System.out.println("((Category) firstProduct).getPrice(0) = " + firstProduct.getPrice(0));
    }
}
