package com.Decorlu.pages;

import com.Decorlu.utilities.BrowserUtils;
import com.Decorlu.utilities.ConfigurationReader;
import com.Decorlu.utilities.Driver;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();

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

    @FindBy(xpath = "//div[contains(@class,'ngx-toastr toast-success')]/button")
    public WebElement loginSuccessMessageCloseButton;

    @FindBy(xpath = "//div[contains(@class,'ngx-toastr toast-success')]/div")
    public WebElement loginSuccessMessage;

    @FindBy(xpath = "//div[contains(@class,'ngx-toastr toast-warning')]/button")
    public WebElement loginFailMessageCloseButton;

    @FindBy(xpath = "//div[contains(@class,'ngx-toastr toast-warning')]/div")
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



        wait.until(ExpectedConditions.elementToBeClickable(girisYapKayitOlButton));
        executor.executeScript("arguments[0].click();",girisYapKayitOlButton);
        BrowserUtils.sleep(5);
        wait.until(ExpectedConditions.elementToBeClickable(girisYapButton));
        executor.executeScript("arguments[0].click();",girisYapButton);


        emailBox.sendKeys(ConfigurationReader.getProperty("username"));

        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));


        wait.until(ExpectedConditions.elementToBeClickable(loginButton));


        executor.executeScript("arguments[0].click();",loginButton);
        wait.until(ExpectedConditions.elementToBeClickable(loginSuccessMessageCloseButton));

        Assert.assertTrue(loginSuccessMessage.getText().contains("Başarılı bir şekilde giriş yaptınız."));
        System.out.println(loginSuccessMessage.getText());
        executor.executeScript("arguments[0].click();", loginSuccessMessageCloseButton);

    }

    public void verifyAccountOnEmail() {


        Response response = RestAssured.given().accept(ContentType.JSON)
                .when().get("https://api.testmail.app/api/json?apikey=f3926131-7ce4-4e67-9cd8-b4521f5921b9&namespace=sjtbl&pretty=true").then()
                .extract().response();

        String path = response.path("emails[0].text");
        System.out.println(path);

        //int firstIndex = path.indexOf("Password\n[");
        //int lastIndex = path.lastIndexOf("]\n \n\n\n----");
        //String verificationCode = path.substring(firstIndex+"Password\n[".length(), lastIndex);
        //Driver.getDriver().get(verificationCode);
        //System.out.println(verificationCode);

    }

}
