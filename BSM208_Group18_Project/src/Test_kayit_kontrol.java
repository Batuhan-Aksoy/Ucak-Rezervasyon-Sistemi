import static org.junit.Assert.*;

import org.junit.Test;

public class Test_kayit_kontrol {

	@Test
    public void TestTreeStructure_DifferentSegmentAndHeightTrees_PrintoutTrees() {

        kayit_kontrol testobj = new kayit_kontrol();
        String name="tav�an77";
        String pass="1234";
        String mail="tav�an@gmail.com";
        String tel ="02122121212";
        testobj.kayit(name, pass, mail, tel);

    }

}
