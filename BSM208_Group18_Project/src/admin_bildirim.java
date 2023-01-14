import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class admin_bildirim {
	
	public void bildirim_ekle(String adminmesaj,String adminname) {

		try {
			baglanti conn = new baglanti();
			String sql = "INSERT INTO bildirim(userid,sirket,koltukno,admin) VALUES ('0','0','0','"+adminmesaj+"')";
		    Statement mystat = conn.baglan.createStatement();
		    int sonuc = mystat.executeUpdate(sql);
		    if(sonuc == 1)
		    {
		    	JOptionPane.showMessageDialog(null, "Kullanýcýlara Bildirim Baþarýyla Yollandý");
		    	admin a = new admin(adminname);
		    	a.setVisible(true);
		    }else {
		    	JOptionPane.showMessageDialog(null, "Kullanýcýlara Bildirim Yollanamadý");
		    	admin a = new admin(adminname);
		    	a.setVisible(true);
		    }
		    
		    
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
