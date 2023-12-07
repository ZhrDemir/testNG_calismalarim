package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YoutubePage {

    public YoutubePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//*[@id='logo-icon'])[1]")
    public WebElement resimElementi;

    @FindBy(name = "search_query")
    public WebElement searchBox;

    @FindBy(xpath = "//title")
    public WebElement titleElementi;
}
