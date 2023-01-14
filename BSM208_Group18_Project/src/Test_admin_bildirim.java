import static org.junit.Assert.*;

import org.junit.Test;

public class Test_admin_bildirim {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees() {

        admin_bildirim testobj= new admin_bildirim();
        testobj.bildirim_ekle("Mesaj", "Fatih");
    }
}
