package tests.week01;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pages.YoutubePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusebleMethods;

import static org.testng.Assert.*;


public class C03_youtTest_POM {
    YoutubePage youtubePage = new YoutubePage();

//      Bir class oluşturun: YoutubeAssertions

  @Test(priority = 1)
    public void youtubeTest(){



        //  1) https://www.youtube.com adresine gidin

        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));




}
//  2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
//  ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin

    @Test(priority = 2)
    public void testtitle() {


        assertEquals(Driver.getDriver().getTitle(),"YouTube");

    }
//  ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin

    @Test(priority = 3)
    public void testimage() {
        assertTrue(youtubePage.resimElementi.isDisplayed());
    }
//  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())

    @Test(priority = 4)
    public void testsearchBox() {
        assertTrue(youtubePage.searchBox.isEnabled());
    }

//  o wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin

    @Test(priority = 5)
    public void testwrongTitle() {
      assertNotEquals(youtubePage.titleElementi,"youtube");

    }

    @AfterSuite
    public void test() {

    Driver.quitDriver();
}
}