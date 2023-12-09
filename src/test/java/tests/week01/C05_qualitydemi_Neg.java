package tests.week01;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.QualityPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_qualitydemi_Neg {

    QualityPage qualityPage = new QualityPage();

    @Test
    public void qalitydemyNegTest(){

        //  NegativeTest
        //  1- https://www.qualitydemy.com/ anasayfasina gidin
        //  2- login linkine basin

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualityPage.loginKutusu.click();

        //  3- 3 farkli test method’u olusturun.
    }
        @Test(dependsOnMethods = "qalitydemyNegTest")
        public void gecerligecersizTest(){
            //          - gecerli username, gecersiz password
            //  4- Login butonuna basarak login olun
            //  5- Basarili olarak giris yapilamadigini test edin

            qualityPage.Cookies.click();
            qualityPage.emailKutusu.clear();
            qualityPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliEmail"));
            qualityPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
            qualityPage.loginButton.click();

            Assert.assertTrue(qualityPage.LOGINYazisi.isDisplayed());

        }
    @Test(dependsOnMethods = "qalitydemyNegTest")
    public void gecersizgecerliTest(){
        //          - gecersiz username, gecerli password
        //  4- Login butonuna basarak login olun
        //  5- Basarili olarak giris yapilamadigini test edin

        qualityPage.emailKutusu.clear();
        qualityPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizEmail"));
        qualityPage.passwordKutusu.clear();
        qualityPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualityPage.loginButton.click();

        Assert.assertTrue(qualityPage.LOGINYazisi.isDisplayed());
    }
    @Test(dependsOnMethods = "qalitydemyNegTest")
    public void gecersizgecersizTest(){
        //          - gecersiz username, gecersiz password.
        //  4- Login butonuna basarak login olun
        //  5- Basarili olarak giris yapilamadigini test edin

        qualityPage.emailKutusu.clear();
        qualityPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizEmail"));
        qualityPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualityPage.loginButton.click();

        Assert.assertTrue(qualityPage.LOGINYazisi.isDisplayed());
    }

@AfterTest
    public void test(){
        Driver.quitDriver();
}

}
