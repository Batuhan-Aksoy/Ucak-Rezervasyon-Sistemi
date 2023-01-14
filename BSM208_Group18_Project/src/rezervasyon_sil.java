import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class rezervasyon_sil {
	
	public void rezervasyonu_sil(int id,String userid,String rezervasyon) {
		
		 
		    int uzunluk = rezervasyon.length();
		    int koltukno=0;
		    if(rezervasyon.charAt(uzunluk-2)==' ')
		    {
		    	char koltuk=rezervasyon.charAt(uzunluk-1);
		        String tmp = Character.toString(koltuk);
	    	    koltukno =Integer.parseInt(tmp);
		    }
		    else {
		    	char koltuk1=rezervasyon.charAt(uzunluk-1);
		    	char koltuk2=rezervasyon.charAt(uzunluk-2);
		        String tmp2 = Character.toString(koltuk1);
		        tmp2 = tmp2+Character.toString(koltuk2);
	    	    koltukno =Integer.parseInt(tmp2);
		    }
		     
		
		try {
			baglanti conn = new baglanti();
			String sql = "DELETE FROM bsm_208.rezervasyon WHERE rezid='"+id+"'";
			String sql2  = "UPDATE bsm_208.a_sirket SET userid='0' WHERE A_sirket_koltukno ='"+koltukno+"'";
			String sql3 = "UPDATE bsm_208.b_sirket SET userid='0' WHERE B_sirket_koltukno ='"+koltukno+"'";
			String sql4 = "UPDATE bsm_208.c_sirket SET userid='0' WHERE C_sirket_koltukno ='"+koltukno+"'";
			
			Statement mystat = conn.baglan.createStatement();
			int sonuc = mystat.executeUpdate(sql);
			if(sonuc==1)
			{
				JOptionPane.showMessageDialog(null, "Seçtiðiniz Rezervasyonunuz Baþarýyla Silindi");
				mystat.executeUpdate(sql2);
				mystat.executeUpdate(sql3);
				mystat.executeUpdate(sql4);
				kullanici bfrm= new kullanici(userid);
				bfrm.setVisible(true);
			}else
			{
				JOptionPane.showMessageDialog(null, "Rezervasyon Silinemedi");
				kullanici bfrm= new kullanici(userid);
				bfrm.setVisible(true);
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
