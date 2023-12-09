package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityPage {

    public QualityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@class='btn btn-sign-in-simple']")
    public WebElement loginKutusu;

    @FindBy(id = "login-email")
    public WebElement emailKutusu;

    @FindBy(id = "login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
    public WebElement loginButton;

    @FindBy(xpath = "//h1[@class='fw-700']")
    public WebElement LOGINYazisi;

    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement Cookies;



}
