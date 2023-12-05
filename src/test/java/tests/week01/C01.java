package tests.week01;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.Driver;

import java.util.List;

public class C01 {


    @Test
    public void test01(){

        //testotomasyona gidin
        Driver.getDriver().get("https://testotomasyonu.com");

    //doğru sayfaya gittiğinizi dogrulaın
        TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://testotomasyonu.com/");

    //aramakutusuna shoes yazdırın
        testOtomasyonuPage.aramaKutusu.sendKeys("shoes"+ Keys.ENTER);

    //sonucu kaç tane old yazdırın
        System.out.println("Sonuc : " + testOtomasyonuPage.bulunanUrunSonucList.size());

        //ikinci urune tıklayın

    testOtomasyonuPage.bulunanUrunSonucList.get(1).click();

    // çıkan yazıda Shoes gectiğini doğrulayın

         Assert.assertTrue(testOtomasyonuPage.cikanUrununYazisi.getText().contains("Shoes"));

        Driver.quitDriver();

}

}
