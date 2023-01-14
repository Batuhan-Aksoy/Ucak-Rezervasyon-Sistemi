import static org.junit.Assert.*;

import org.junit.Test;

public class Test_giris_kontrol {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees() {

        String name="batu";
        String pass="1234";
        giris_kontrol testobj = new giris_kontrol();
        testobj.giris(name, pass);
    }
}
