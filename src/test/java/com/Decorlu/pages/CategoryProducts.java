package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CategoryProducts extends Sepet {
    public String name;
    public String brand;
    public String quantity;
    public List<WebElement> products;
    public double price;

    public CategoryProducts(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @Override
    public String getName(int index) {
        int firstIndex = ((WebElement) productsCategoryPage.get(index)).getText().indexOf(" ");
        int lastIndex = ((WebElement) productsCategoryPage.get(index)).getText().length();

        name = ((WebElement) productsCategoryPage.get(index)).getText().substring(firstIndex, lastIndex);
        String str = name;

        char[] charArray = str.toCharArray();

        String result = "";

        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == ' ' || Character.isLetter(charArray[i]) ){
                result += charArray[i];
            } else {
                break;
            }


        }
        result = result.trim();
        return result;
    }

    @Override
    public String getBrand(int index) {
        int firstIndex = ((WebElement) productsCategoryPage.get(index)).getText().indexOf("");
        int lastIndex = ((WebElement) productsCategoryPage.get(index)).getText().indexOf(" ");
        this.brand = ((WebElement) productsCategoryPage.get(index)).getText().substring(firstIndex, lastIndex);
        return this.brand;
    }
    @Override
    public String getQuantity(int index) {
        return this.quantity;
    }
    @Override
    public double getPrice(int index) {
        String temp = ((WebElement) productsCategoryPage.get(index)).getText();
        int firstIndex = temp.lastIndexOf("₺");
        int lastIndex = temp.length();
        this.price = Double.parseDouble(temp.substring(firstIndex + 1, lastIndex).replace(",", "."));
        return this.price;
    }

}
