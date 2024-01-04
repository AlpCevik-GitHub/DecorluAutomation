package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SepetDropDown extends Sepet {
    public String name;
    public String brand;
    public String quantity;
    public List<WebElement> products;
    public double price;

    public SepetDropDown() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "//div[@class='basket-title']")
    public WebElement sepetDropDownProductTitle;
    @FindBy(xpath = "//section[@class='p-1']//li")
    public List<WebElement> sepetDropDownProductlist;

    @Override
    public String getName(int index) {
        int firstIndex = ((WebElement) sepetDropDownProductlist.get(index)).getText().indexOf("");
        int lastIndex = ((WebElement) sepetDropDownProductlist.get(index)).getText().length();

        name = ((WebElement) sepetDropDownProductlist.get(index)).getText().substring(firstIndex, lastIndex);
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
        int firstIndex = ((WebElement) sepetDropDownProductlist.get(index)).getText().indexOf("");
        int lastIndex = ((WebElement) sepetDropDownProductlist.get(index)).getText().indexOf(" ");
        this.brand = ((WebElement) sepetDropDownProductlist.get(index)).getText().substring(firstIndex, lastIndex);
        return this.brand;
    }
    @Override
    public String getQuantity(int index) {
        return this.quantity;
    }
    @Override
    public double getPrice(int index) {
        String temp = ((WebElement) sepetDropDownProductlist.get(index)).getText();
        System.out.println(temp);
        int firstIndex = temp.lastIndexOf("₺");
        int lastIndex = temp.length();
        this.price = Double.parseDouble(temp.substring(firstIndex + 1, lastIndex).replace(".", "").replace(",", ".").trim());
        return this.price;
    }

    public double getQuantityForSecondProduct(int index) {
        int firstIndex = ((WebElement) sepetDropDownProductlist.get(index)).getText().indexOf("");
        int lastIndex = ((WebElement) sepetDropDownProductlist.get(index)).getText().length();

        name = ((WebElement) sepetDropDownProductlist.get(index)).getText().substring(firstIndex, lastIndex);
        String str = name;

        char[] charArray = str.toCharArray();

        String result = "";

        for (int i = 0; i < charArray.length; i++) {

            if (Character.isDigit(charArray[i]) ){
                result += charArray[i];
                break;
            }


        }
        result = result.trim();
        return Double.parseDouble(result);
    }


}
