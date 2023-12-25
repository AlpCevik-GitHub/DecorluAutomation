package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sepet {


    public Sepet(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class='imageCategory']//a)[1]//span[@class='discountedPrice']")
    public static WebElement firstProductPriceInCategory;
    public  class Category{

        String name;
        String quantity;

        double price;

        public Category(String name, String quantity, double price) {

            this.name = name;
            this.quantity = quantity;
            price = Double.parseDouble(Sepet.firstProductPriceInCategory.getText());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }


    public class SepetDropDown{}

    public class SepetPage{}

    public class SepetOzeti{}


}
