package tests.week01;

import org.testng.annotations.Test;
import pages.QualityPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_qualitiy_Poz {
    @Test
    public void qualitydemytest() {


//     PositiveTest
// 1- https://www.qualitydemy.com/ anasayfasina gidin
      Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

// 2- login linkine basin
        QualityPage qualityPage = new QualityPage();
        qualityPage.loginKutusu.click();

// 3- Kullanici email'i olarak valid email girin
        qualityPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));



// 4- Kullanici sifresi olarak valid sifre girin
        qualityPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

// 5- Login butonuna basarak login olun
        qualityPage.loginButton.click();

// 6- Basarili olarak giris yapilabildigini test edin
}
 }