import static org.junit.Assert.*;

import org.junit.Test;

public class Test_rezervasyon_sil {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees(){

        rezervasyon_sil testobj = new rezervasyon_sil();
        testobj.rezervasyonu_sil(1, "1", " 1");
        //E�er veritaban�nda ilgili kullan�c� i�in olan bir rezervasyon id girilirse fonksiyonun rezervasyon silme k�sm� �al���r
        //var olmayan bir rezervasyon id girildi�i i�in rezervasyon silinemedi k�sm� �al���yor.
    }
}
