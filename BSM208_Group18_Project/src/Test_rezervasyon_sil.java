import static org.junit.Assert.*;

import org.junit.Test;

public class Test_rezervasyon_sil {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees(){

        rezervasyon_sil testobj = new rezervasyon_sil();
        testobj.rezervasyonu_sil(1, "1", " 1");
        //Eðer veritabanýnda ilgili kullanýcý için olan bir rezervasyon id girilirse fonksiyonun rezervasyon silme kýsmý çalýþýr
        //var olmayan bir rezervasyon id girildiði için rezervasyon silinemedi kýsmý çalýþýyor.
    }
}
