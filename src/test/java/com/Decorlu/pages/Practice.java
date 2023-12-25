package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Practice extends BasePage{

    public Practice() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='account-navigation-container']//div//p[.='Giriş Yap']")
  public WebElement giris;
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement username;
    @FindBy(xpath = "//input[@id='login-password-input']")
    public WebElement password;

    @FindBy(xpath = "//div[@id='gender-popup-app']//div[@class='modal-close']")
public WebElement close;


}
