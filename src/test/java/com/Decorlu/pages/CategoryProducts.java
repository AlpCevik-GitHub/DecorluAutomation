package com.Decorlu.pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryProducts extends Sepet {

    String name;
    String brand;
    String quantity;
    List<WebElement> products;
    double price;

    public CategoryProducts() {
        this.products = Sepet.products;
    }

    public String getName(int index) {
        int firstIndex = ((WebElement)this.products.get(index)).getText().indexOf("A");
        int lastIndex = ((WebElement)this.products.get(index)).getText().indexOf("₺");
        this.name = ((WebElement)this.products.get(index)).getText().substring(firstIndex, lastIndex);
        return this.name;
    }

    public String getBrand(int index) {
        int firstIndex = ((WebElement)this.products.get(index)).getText().indexOf("");
        int lastIndex = ((WebElement)this.products.get(index)).getText().indexOf(" ");
        this.brand = ((WebElement)this.products.get(index)).getText().substring(firstIndex, lastIndex);
        return this.brand;
    }

    public String getQuantity(int index) {
        return this.quantity;
    }

    public double getPrice(int index) {
        String temp = ((WebElement)this.products.get(index)).getText();
        int firstIndex = temp.lastIndexOf("₺");
        int lastIndex = temp.length();
        this.price = Double.parseDouble(temp.substring(firstIndex + 1, lastIndex).replace(",", "."));
        return this.price;
    }

}
