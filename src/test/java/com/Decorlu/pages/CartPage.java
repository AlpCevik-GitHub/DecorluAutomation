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


    @FindBy(xpath = "//div[contains(@class,'ngx-toastr toast-success')]//button")
    public WebElement successfullyAddedMessageCloseButton;

    @FindBy(xpath = "//div[contains(@class,'ngx-toastr toast-success')]//div")
    public WebElement successfullyAddedMessage;
@FindBy(xpath = "//span[.='Sepetim']")
public WebElement myCart;
    @FindBy(xpath = "//button[@class='btn btn-secondary btn-sm w-100 pl-0 ml-0']")
    public WebElement goToBasketButton;
    @FindBy(xpath = "//button[@class='btn btn-warning btn-sm w-100 pl-0 ml-0']")
    public WebElement completeOrderButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-warning w-100 checkBasket']")
    public WebElement confirmCartButton;

    @FindBy(xpath = "//h5[.='Adres Bilgileri']")
    public WebElement addressInformation;
    @FindBy(xpath = "//div[@class='addressList']//span[@class='mat-radio-outer-circle']")
    public WebElement selectAddress;

    @FindBy(xpath = "//a[@class='nav-link']//h5[.='Ödeme Bilgileri']")
    public WebElement paymentInformation;

    @FindBy(xpath = "//div[@class='col-lg-6 border-right ng-star-inserted']//a")
    public WebElement useSavedCards;

    @FindBy(xpath = "//div[@class='col-lg-6 border-right ng-star-inserted']")
    public WebElement allCarts;
    @FindBy(xpath = "(//div[@class='col-lg-6 border-right ng-star-inserted']//user-cart)[1]")
    public WebElement firstCart;
    @FindBy(xpath = "//table//tr//span[@class='mat-radio-inner-circle']")
    public List<WebElement> allOptionsForInstallment;
    @FindBy(xpath = "(//table//tr//span[@class='mat-radio-inner-circle'])[1]")
    public WebElement firstOptionForInstallment;

    @FindBy(xpath = "//input[@id = 'mat-checkbox-1-input']")
    public WebElement termsAndConditions;
    @FindBy(xpath = "//button[@class = 'btn btn-sm btn-warning w-100 checkBasket']")
    public WebElement makeThePayment;
    @FindBy(xpath = "//iframe[@id='iframe']")
    public WebElement iframe;
    @FindBy(xpath = "//input[@id='smsCode']")
    public WebElement smsCode;
    @FindBy(xpath = "//button[@id='submitBtn']")
    public WebElement submitButton;

    @FindBy(xpath = "//main[@class='ng-star-inserted']//span")
    public WebElement paymentSuccessMessage;

    @FindBy(xpath = "(//main[@class='ng-star-inserted']//button)[1]")
    public WebElement continueShoppingButton;

    @FindBy(xpath = "(//main[@class='ng-star-inserted']//button)[2]")
    public WebElement goToMyOrdersButton;

    @FindBy(xpath = "//button[.='Hayır']")
    public WebElement noButton;

    @FindBy(xpath = "(//div[@class='changed-bg-element basketProduct hoveredElement']//li)[2]//div[@class='basket-price']")
    public WebElement basketLastProductPrice;
}
