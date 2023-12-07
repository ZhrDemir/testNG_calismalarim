package tests.week01;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.PazaramaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusebleMethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.testng.AssertJUnit.assertTrue;

public class C03_pazaramaTest {

    @Test
    public void testName() {


        Actions actions = new Actions(Driver.getDriver());


        // kullanıcı "https://www.pazarama.com/" sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("pazaramaUrl"));


        // karşına çıkan reklamları handle et
        PazaramaPage pazaramaPage = new PazaramaPage();

        ReusebleMethods.bekle(2);
        pazaramaPage.cookies.click();

        ReusebleMethods.bekle(10);
        pazaramaPage.reklamKutusu.click();

        ReusebleMethods.bekle(3);
        //Driver.getDriver().switchTo().alert().dismiss();

        //ilk urunun üstüne gidince "sepete ekle" butonunun aktif old doğrula

        actions.scrollToElement(pazaramaPage.ilkUrunProduct).perform();
        ReusebleMethods.bekle(2);
        actions.moveToElement(pazaramaPage.ilkUrunProduct).perform();
        assertTrue(pazaramaPage.ilkUrunProduct.isDisplayed());
        assertTrue(pazaramaPage.ilkUrunProduct.isEnabled());

        //arama cubuguna KEDİ kumu yazarak aratın

        actions.sendKeys(Keys.PAGE_UP)
                .moveToElement(pazaramaPage.aramaKutusu)
                .click()
                .sendKeys("KEDİ kumu" + Keys.ENTER)
                .perform();


        //kullanıcı sf altındaki pazarama logosunu görür
        actions.scrollToElement(pazaramaPage.alttakiPazaramaLogosu).
                moveToElement(pazaramaPage.alttakiPazaramaLogosu).
                perform();
        assertTrue(pazaramaPage.alttakiPazaramaLogosu.isDisplayed());

        //kullanıcı sf basındaki "Bize Ulaşın" linkini tıkla

        ReusebleMethods.bekle(2);
        actions.sendKeys(Keys.PAGE_UP).moveToElement(pazaramaPage.BizeUlasinYazisi).click().perform();

        ReusebleMethods.istenenWebelementScreenshot(pazaramaPage.BizeUlasinYazisi);
        ReusebleMethods.tumSayfaScreenShoot();

        ReusebleMethods.bekle(3);
        Driver.quitDriver();


    }


}