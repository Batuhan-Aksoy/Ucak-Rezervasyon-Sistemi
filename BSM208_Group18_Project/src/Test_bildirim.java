import static org.junit.Assert.*;

import org.junit.Test;

public class Test_bildirim {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees() {
        String userid="1";
        bildirim  testobj = new bildirim();
        String [][] dizi  = new String [15][4];
        dizi=testobj.bildirim_goruntule(userid);

    }
}
