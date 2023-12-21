package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends  BasePage{


    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//input[@class='o-header__search--input']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='o-searchSuggestion__input']")
    public WebElement nextSearchBox;



    @FindBy(xpath = "//*[@id=\"addBasket\"]")
    public WebElement addCart;


    @FindBy(xpath = "(//span[@class='o-header__userInfo--text'])[3]")
    public WebElement goToCart;

    @FindBy(xpath = "//ins[@id=\"priceNew\"]")
    public  WebElement pagePrice;

    @FindBy(xpath = "//*[@id=\"sizes\"]/div/span[1]")
    public  WebElement sizeSmall;

    @FindBy(xpath = "//span[@class='m-productPrice__salePrice']")
    public  WebElement productPrice;

    @FindBy(xpath = "(//span[@class='o-productCard__content--desc'])[2]")
    public  WebElement oneProduct;

    @FindBy(xpath = "//select[@id='quantitySelect0-key-0']")
    public WebElement selectMenu;

    @FindBy(xpath = "//button[@id='removeCartItemBtn0-key-0']")
    public WebElement removeFromCart;

    @FindBy(xpath = "//div[@class='m-productDescription__infoDesc']")
    public  WebElement productInfo;

    @FindBy(xpath = "//select[@id='quantitySelect0-key-0']/option[@value = '2']")
    public  WebElement selectDropMenu;

    @FindBy(xpath = "(//strong[@class='m-empty__messageTitle'])[1]")
    public WebElement checkCartMessage;

    @FindBy(xpath = "//button[@class='o-header__search--close -hasButton']")
    public WebElement clearSearchBox;

}
