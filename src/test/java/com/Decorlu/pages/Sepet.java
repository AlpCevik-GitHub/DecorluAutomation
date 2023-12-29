package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class Sepet {
    String name;
    String brand;
    String quantity;
    public List<WebElement> products;
    double price;

    public Sepet(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//div[@class='imageCategory']//a)[1]//span[@class='discountedPrice']")
    public static WebElement firstProductPriceInCategory;

    @FindBy(xpath = "(//div[@id='navbar']//ul//li)[10]")
    public WebElement yapimarket;
    @FindBy(
            xpath = "(//a[.='Bahçe Mobilyaları'])[1]"
    )
    public WebElement bahceMobilyalari;
    @FindBy( xpath = "//div[@class='imageCategory']/div/div")
    public  List<WebElement> productsSepet;
    @FindBy(
            xpath = "//strong[@class='color-warning']"
    )
    public WebElement toplamUrunSayisi;
    @FindBy(
            xpath = "//div[@class='container']//section//h5[.='DECORLU ELEKTRONİK HİZMETLER VE TİCARET A.Ş.']"
    )
    public WebElement bottomPartForScrollDown;

    @FindBy(xpath = "//header//span[@class='brand']/..")
    public WebElement selectedProductInfo;

    @FindBy(xpath = "//div[@class='priceAll']//div//strong")
    public WebElement selectedProductPrice;
    @FindBy(xpath = "//section[@class='p-1']//li")
    public List<WebElement> sepetDropDownProductlist;
    @FindBy(xpath = "//table[@class='table']//tr")
    public List<WebElement> sepetPageProductList;
    @FindBy(xpath = "//table[@class='table']//tr//button[@class='button asc btn-sm']")
    public List<WebElement> sepetPageArttir;
    @FindBy(xpath = "//table[@class='table']//tr//button[@class='button disc btn-sm']")
    public List<WebElement> sepetPageAzalt;
    @FindBy(xpath = "//table[@class='table']//tr//i[@class='icon-bin delete']")
    public List<WebElement> sepetPageDelete;
    @FindBy(xpath = "//table[@class='table']//tr//img")
    public List<WebElement> sepetPageProductImage;

    public abstract String getName(int index);
    public abstract String getBrand(int index);
    public abstract  String getQuantity(int index);
    public abstract double getPrice(int index);

}
