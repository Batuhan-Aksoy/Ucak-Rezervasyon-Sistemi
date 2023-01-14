import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class bilet_al {

	public void biletal(String userid,String bulunulanyer,String gidilecekyer, String tarih,String sirket,int koltukno) {
		try {
			baglanti conn = new baglanti();
			String sql  = "UPDATE bsm_208.a_sirket SET userid='"+userid+"' WHERE A_sirket_koltukno ='"+koltukno+"'";
			String sql2 = "UPDATE bsm_208.b_sirket SET userid='"+userid+"' WHERE B_sirket_koltukno ='"+koltukno+"'";
			String sql3 = "UPDATE bsm_208.c_sirket SET userid='"+userid+"' WHERE C_sirket_koltukno ='"+koltukno+"'";
			String sql4 = "INSERT INTO rezervasyon (userid,rez_byer,rez_gyer,rez_tarih,rez_sirket,rez_koltukno) "+
					 "  VALUES ('"+userid+"','"+bulunulanyer+"','"+gidilecekyer+"','"+tarih+"','"+sirket+"','"+koltukno+"')";
			String sql5 = "INSERT INTO bildirim(userid,sirket,koltukno) VALUES ('"+userid+"','"+sirket+"','"+koltukno+"')";
			Statement mystat = conn.baglan.createStatement();
			int sonuc = mystat.executeUpdate(sql);
			int sonuc2 = mystat.executeUpdate(sql2);
			int sonuc3 = mystat.executeUpdate(sql3);
			int sonuc4 = mystat.executeUpdate(sql4);
			int sonuc5 = mystat.executeUpdate(sql5);
			
			if(sonuc==1 && sonuc2 == 1 && sonuc3 == 1 && sonuc4 == 1 && sonuc5==1)
			{
						
				JOptionPane.showMessageDialog(null, "Bilet Baþarýyla Alýndý");
				kullanici frm = new kullanici(userid);
				frm.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Bilet Alýrken Hata Oluþtu Lütfen Daha sonra tekrar deneyiniz");
				kullanici frm = new kullanici(userid);
				frm.setVisible(true);
			}
			
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
}
