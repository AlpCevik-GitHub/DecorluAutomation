package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CartPage extends BasePage {


    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@class='o-header__search--input']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id='o-searchSuggestion__input']")
    public WebElement nextSearchBox;


    @FindBy(xpath = "//*[@id=\"addBasket\"]")
    public WebElement addCart;


    @FindBy(xpath = "(//span[@class='o-header__userInfo--text'])[3]")
    public WebElement goToCart;

    @FindBy(xpath = "//ins[@id=\"priceNew\"]")
    public WebElement pagePrice;

    @FindBy(xpath = "//*[@id=\"sizes\"]/div/span[1]")
    public WebElement sizeSmall;

    @FindBy(xpath = "//span[@class='m-productPrice__salePrice']")
    public WebElement productPrice;

    @FindBy(xpath = "(//span[@class='o-productCard__content--desc'])[2]")
    public WebElement oneProduct;

    @FindBy(xpath = "//select[@id='quantitySelect0-key-0']")
    public WebElement selectMenu;

    @FindBy(xpath = "//button[@id='removeCartItemBtn0-key-0']")
    public WebElement removeFromCart;

    @FindBy(xpath = "//div[@class='m-productDescription__infoDesc']")
    public WebElement productInfo;

    @FindBy(xpath = "//select[@id='quantitySelect0-key-0']/option[@value = '2']")
    public WebElement selectDropMenu;

    @FindBy(xpath = "(//strong[@class='m-empty__messageTitle'])[1]")
    public WebElement checkCartMessage;

    @FindBy(xpath = "//button[@class='o-header__search--close -hasButton']")
    public WebElement clearSearchBox;

    @FindBy(xpath = "//div[@class='ng-tns-c57-11 toast-message ng-star-inserted']")
    public WebElement successfullyAddedMessage;

    @FindBy(xpath = "//button[@class='btn btn-secondary btn-sm w-100 pl-0 ml-0']")
    public WebElement goToBasketButton;
    @FindBy(xpath = "//button[@class='btn btn-warning btn-sm w-100 pl-0 ml-0']")
    public WebElement completeOrderButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-warning w-100 checkBasket']")
    public WebElement confirmCartButton;

    @FindBy(xpath = "//div[@class='addressList']//span[@class='mat-radio-outer-circle']")
    public WebElement selectAddress;

    @FindBy(xpath = "//a[@class='nav-link active']")
    public WebElement paymentInformation;

    @FindBy(xpath = "//a[.=' Use Saved Cards']")
    public WebElement useSavedCards;
    @FindBy(xpath = "(//div[@class='col-lg-6 border-right ng-star-inserted']//user-cart)[1]")
    public WebElement firstCart;
    @FindBy(xpath = "//table//tr//span[@class='mat-radio-inner-circle']")
    public List<WebElement> allOptionsForInstallment;
    @FindBy(xpath = "(//table//tr//span[@class='mat-radio-inner-circle'])[1]")
    public List<WebElement> firstOptionForInstallment;

    @FindBy(xpath = "//mat-checkbox[@id = 'mat-checkbox-1']")
    public WebElement termsAndConditions;
    @FindBy(xpath = "//button[@class = 'btn btn-sm btn-warning w-100 checkBasket']")
    public WebElement makeThePayment;
    @FindBy(xpath = "//input[@id='smsCode']")
    public WebElement smsCode;
    @FindBy(xpath = "//button[@id='submitBtn']")
    public WebElement submitButton;

}
