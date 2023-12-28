package com.Decorlu.pages;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CategoryProducts extends Sepet {



    @Override
    public String getName(int index) {
        int firstIndex = ((WebElement)productsSepet.get(index)).getText().indexOf("A");
        int lastIndex = ((WebElement)productsSepet.get(index)).getText().indexOf("₺");
        this.name = ((WebElement)productsSepet.get(index)).getText().substring(firstIndex, lastIndex);
        return this.name;
    }
    @Override
    public String getBrand(int index) {
        int firstIndex = ((WebElement)productsSepet.get(index)).getText().indexOf("");
        int lastIndex = ((WebElement)productsSepet.get(index)).getText().indexOf(" ");
        this.brand = ((WebElement)productsSepet.get(index)).getText().substring(firstIndex, lastIndex);
        return this.brand;
    }
    @Override
    public String getQuantity(int index) {
        return this.quantity;
    }
    @Override
    public double getPrice(int index) {
        String temp = ((WebElement)productsSepet.get(index)).getText();
        int firstIndex = temp.lastIndexOf("₺");
        int lastIndex = temp.length();
        this.price = Double.parseDouble(temp.substring(firstIndex + 1, lastIndex).replace(",", "."));
        return this.price;
    }

}
