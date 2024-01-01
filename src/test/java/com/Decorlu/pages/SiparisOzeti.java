package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SiparisOzeti extends  Sepet {


    public SiparisOzeti() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "((//div[@class='col-lg-12 order-info'])[2]//div[@class='summaryPrice'])[1]")
    public WebElement sepetOzetiUrunToplami;
    @FindBy(xpath = "((//div[@class='col-lg-12 order-info'])[2]//div[@class='summaryPrice'])[2]")
    public WebElement sepetOzetiKargoFiyati;
    @FindBy(xpath = "((//div[@class='col-lg-12 order-info'])[2]//div[@class='summaryPrice'])[3]")
    public WebElement sepetOzetiToplamTutar;
    @FindBy(xpath = "(//div[@class='col-lg-12 order-info'])[2]//div[@class='summaryPrice text-danger']")
    public WebElement sepetOzetiKargoIndirimi;
    @Override
    public String getName(int index) {
        return null;
    }

    @Override
    public String getBrand(int index) {
        return null;
    }

    @Override
    public String getQuantity(int index) {
        return null;
    }

    @Override
    public double getPrice(int index) {
        return 0;
    }





}
