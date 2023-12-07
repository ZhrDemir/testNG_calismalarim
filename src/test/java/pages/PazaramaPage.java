package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PazaramaPage {

   public PazaramaPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
    @FindBy(xpath ="(//button[@class='dn-slide-accept-btn'])[1]" )
    public WebElement reklamKutusu;

   @FindBy(xpath = "//button[@class='btn btn-xs btn-primary !h-auto leading-snug py-1']")
    public WebElement cookies;

   @FindBy(xpath = "(//button[normalize-space()='Sepete Ekle'])[1]")
    public WebElement ilkUrunProduct;

   @FindBy(xpath = "//*[@*='form-input text-sm font-semibold border-gray-300 pr-28']")
    public WebElement aramaKutusu;


   @FindBy(xpath = "(//span[@name='pazarama-isbank-logo'])[2]")
    public WebElement alttakiPazaramaLogosu;

   @FindBy(xpath = "(//a[@class='text-gray-500 text-xxs font-semibold'])[1]")
    public WebElement BizeUlasinYazisi ;
}
