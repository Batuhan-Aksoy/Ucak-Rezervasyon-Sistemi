import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class bildirim_sil {

	public void bildirimi_sil(int id,String userid) {
		
		try {
			baglanti conn = new baglanti();
			String sql = "DELETE FROM bsm_208.bildirim WHERE bildirimid='"+id+"'";
			Statement mystat = conn.baglan.createStatement();
			int sonuc = mystat.executeUpdate(sql);
			if(sonuc==1)
			{
				JOptionPane.showMessageDialog(null, "Ýlgili Bildirim Baþarýyla Silindi");
				kullanici bfrm= new kullanici(userid);
				bfrm.setVisible(true);
				
			}else
			{
				JOptionPane.showMessageDialog(null, "Bildirim Silinemedi");
				kullanici bfrm= new kullanici(userid);
				bfrm.setVisible(true);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
}
