package com.Decorlu.pages;

import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//div[@id='navbar']//ul//following-sibling::li[5]")
    public WebElement homeLife;
    @FindBy(xpath = "//div[@id='navbar']//ul//following-sibling::li[6]")
    public WebElement decoration;
    @FindBy(xpath = "//a[.='MOBİLYA']")
    public WebElement furniture;
    @FindBy(xpath = "//*[@id=\"navbar\"]/user-navbar-link/nav/div/section/div/div[3]/a[1]")
    public WebElement gardirop;
    @FindBy(xpath = "//div[@id='navbar']//ul//following-sibling::li[8]")
    public WebElement curpet;
    @FindBy(xpath = "//div[@id='navbar']//ul//following-sibling::li[9]")
    public WebElement constructionMarket;
    @FindBy(xpath = "//div[@id='navbar']//ul//following-sibling::li[10]")
    public WebElement wallPaper;
    @FindBy(xpath = "//div[@id='navbar']//ul//following-sibling::li[11]")
    public WebElement businessLife;

    @FindBy(xpath = "//div[@id='navbar']//ul//following-sibling::li[12]")
    public WebElement handMade;

    @FindBy(xpath = "//div[@class='categoryleft']//li")
    public List<WebElement> relatedCategoriesAllProducts;
    @FindBy(xpath = "(//div[@class='categoryleft']//li)[1]")
    public WebElement firstProduct;
    @FindBy(xpath = "//mat-expansion-panel-header[@id='mat-expansion-panel-header-6']/..//div//input[@type='checkbox']")
    public WebElement allBrands;
    @FindBy(xpath = "//input[@id='var_e160f3aa-a15c-4fb0-af0c-681eaf31604a']")
    public WebElement firstBrand;
    @FindBy(xpath = "//mat-expansion-panel-header[@id='mat-expansion-panel-header-7']/..//div//input[@type='radio']")
    public List<WebElement> allPrices;

    @FindBy(xpath = "//input[@id='price_501']")
    public WebElement firstPrice;
    @FindBy(xpath = "//div[@class='productCategory']//div[@class='col-6 col-sm-6 col-md-4 col-lg-4 col-xl-3 mb-1 productListStyle ng-star-inserted']")
    public List<WebElement> allProductsInCategory;
    @FindBy(xpath = "(//div[@class='productCategory']//div[@class='col-6 col-sm-6 col-md-4 col-lg-4 col-xl-3 mb-1 productListStyle ng-star-inserted'])[1]//a")
    public WebElement firstProductInCategory;
    @FindBy(xpath = "//button[@class='btn packet']/span[.=' Sepete Ekle ']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//div[@aria-label='Sepete başarılı bir şekilde eklediniz.']")
    public WebElement successfullyAddedMessage;

    @FindBy(xpath = "//div[contains(@class,'ng-trigger-fadeIn ng-star-inserted')]")
    public WebElement loadingMessage;




}
