import static org.junit.Assert.*;

import org.junit.Test;

public class Test_rezervasyon {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees(){
        String userid="1";
        rezervasyon testobj = new rezervasyon();
        String [][] dizi  = new String [15][6];
        dizi=testobj.rezervasyon_goruntule(userid);
    }

}
