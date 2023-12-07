package tests.week01;

import org.testng.annotations.Test;
import pages.YoutubePage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_youtTest_POM {


//      Bir class oluşturun: YoutubeAssertions

//              2) Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
//  ○ titleTest => Sayfa başlığının “YouTube” oldugunu test edin
//  ○ imageTest => YouTube resminin görüntülendiğini (isDisplayed()) test edin
//  ○ Search Box 'in erisilebilir oldugunu test edin (isEnabled())
//              ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
    @Test
    public void youtubeTest(){



        //  1) https://www.youtube.com adresine gidin

        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
        YoutubePage youtubePage = new YoutubePage();



}
  }