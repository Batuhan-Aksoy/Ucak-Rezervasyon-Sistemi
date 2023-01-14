import static org.junit.Assert.*;

import org.junit.Test;

public class Test_bildirim_sil {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees() {

        bildirim_sil testobj = new bildirim_sil();
        String userid="1";
        int bildirimid=5;
        testobj.bildirimi_sil(bildirimid, userid);
    }
}
