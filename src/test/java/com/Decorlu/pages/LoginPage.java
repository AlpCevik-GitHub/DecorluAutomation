package com.Decorlu.pages;

import com.Decorlu.utilities.BrowserUtils;
import com.Decorlu.utilities.ConfigurationReader;
import com.Decorlu.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = " //a[.='Giriş Yap / Kayıt Ol']")
    public WebElement girisYapKayitOlButton;

    @FindBy(xpath = "//a[@id='oturumac-tab']")
    public WebElement girisYapButton;

    @FindBy(xpath = "//a[@id='uyeol-tab']")
    public WebElement uyelikOlusturButton;

    @FindBy(css = "#inputEmail4")
    public WebElement emailBox;

    @FindBy(css = "#inputPassword4")
    public WebElement passwordBox;

    @FindBy(xpath = " //button[.=' Giriş Yap ']")
    public WebElement loginButton;

    @FindBy(xpath = " //a[.='Şifrenizi mi unuttunuz?']")
    public WebElement forgotPasswordButton;

    @FindBy(xpath = " //div[.=' Başarılı bir şekilde giriş yaptınız. ']")
    public WebElement loginSuccessMessage;

    @FindBy(xpath = " //div[.=' Kullanıcı adınız veya şifreniz yanlış. ']")
    public WebElement loginFailMessage;

    @FindBy(xpath = "//div[.=' Formu göndermeden önce sistemdeki eksik alanları doldurunuz. ']")
    public WebElement loginFailMessage2;

    @FindBy(xpath = " //mat-error[.='E-posta adresinizi doğru yazdığınızdan emin olun.']")
    public WebElement typosMessageForEmail;

    @FindBy(xpath = "( //mat-error[.='Bu alanı doldurmanız gerekir.'])[1]")
    public WebElement blankMessageForEmail;

    @FindBy(xpath = "( //mat-error[.='Bu alanı doldurmanız gerekir.'])[1]")
    public WebElement blankMessageForPassword;
    @FindBy(xpath = "//input[@placeholder='Ad']")
    public WebElement nameBox;
    @FindBy(xpath = "//input[@placeholder='Soyadı']")
    public WebElement lastNameBox;
    @FindBy(xpath = "(//input[@placeholder='E-Posta'])[2]")
    public WebElement emailBox2;

    @FindBy(xpath = "//input[@placeholder='Telefon']")
    public WebElement telefonBox;

    @FindBy(xpath = "//input[@placeholder='Parola']")
    public WebElement parolaBox;
    @FindBy(xpath = "//input[@placeholder='Şifreyi Tekrarla']")
    public WebElement sifreTekrarBox;

    @FindBy(xpath = "(//span[@class='mat-radio-inner-circle'])[3]")
    public WebElement genderSelection;

    @FindBy(xpath = "(//input[@id='gridCheck'])[1]")
    public WebElement termsAndConditions1;
    @FindBy(xpath = "(//input[@id='gridCheck'])[2]")
    public WebElement termsAndConditions2;
    @FindBy(xpath = "(//input[@id='gridCheck'])[3]")
    public WebElement termsAndConditions3;

    @FindBy(xpath = "//button[.='Üyelik Oluşturma']")
    public WebElement createAccountButton;


    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        girisYapKayitOlButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(girisYapButton)).click();


        emailBox.sendKeys(ConfigurationReader.getProperty("username"));

        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));

        loginButton.click();

    }


}
