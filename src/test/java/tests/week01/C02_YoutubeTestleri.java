package tests.week01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestOtomasyonuPage;
import utilities.Driver;
import utilities.ReusebleMethods;

public class C02_YoutubeTestleri {

    @Test
    public void youtubeTesti(){
        //    1) https://www.youtube.com adresine gidin
        Driver.getDriver().get("https://www.youtube.com");
    }
    @Test(dependsOnMethods = "youtubeTesti")
    public void titleTest(){
        //    2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        //   ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
        Assert.assertEquals(Driver.getDriver().getTitle(),"YouTube");
        Driver.quitDriver();
    }

    @Test
    public void imageTest(){
        //   ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin

        WebElement resimElementi = Driver.getDriver().findElement(By.xpath("(//*[@id='logo-icon'])[1]"));

        Assert.assertTrue( resimElementi.isDisplayed());
    }

    @Test
    public void searchBoxTesti(){
        //   ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())

        Assert.assertTrue(Driver.getDriver().findElement(By.name("search_query")).isEnabled());
    }

        @Test
    public void wrongTitleTest(){

            //   ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
            Assert.assertNotEquals(Driver.getDriver().getTitle(),"youtube");

        }




}
