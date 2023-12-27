package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import io.cucumber.java.eo.Do;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Sepet {


    public Sepet(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//div[@class='imageCategory']//a)[1]//span[@class='discountedPrice']")
    public static WebElement firstProductPriceInCategory;
    public WebElement yapimarket;
    @FindBy(
            xpath = "(//a[.='Bahçe Mobilyaları'])[1]"
    )
    public WebElement bahceMobilyalari;
    @FindBy(
            xpath = "//div[@class='imageCategory']/div/div"
    )
    public static List<WebElement> products;
    @FindBy(
            xpath = "//strong[@class='color-warning']"
    )
    public WebElement toplamUrunSayisi;
    @FindBy(
            xpath = "//div[@class='container']//section//h5[.='DECORLU ELEKTRONİK HİZMETLER VE TİCARET A.Ş.']"
    )
    public WebElement bottomPartForScrollDown;




    public class SepetDropDown{}

    public class SepetPage{}

    public class SepetOzeti{}


}
