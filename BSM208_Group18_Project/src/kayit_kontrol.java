import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class kayit_kontrol {
	
    public void kayit (String name,String pass,String mail, String tel)
    {
    	
    	try {
    		
    		baglanti conn = new baglanti();
    		String sql = "INSERT INTO users (username,userpas,useremail,usertel)  VALUES ('" + name + "','"
					+ pass + "','" + mail + "','" + tel + "')";
			if (name.equals("") || pass.equals("") || mail.equals("") || tel.equals("")) {
				JOptionPane.showMessageDialog(null, "Bilgiler Boþ Geçilemez");
			} else {

				Statement mystat = conn.baglan.createStatement();
				int sonuc = mystat.executeUpdate(sql);// executeUpdate komutu ekleme yapýnca 1 yapmazsa 0 döndürür.
				if (sonuc == 1) {
					
					JOptionPane.showMessageDialog(null, "Kayýt Baþarýlý");
					login form1 = new login();
					form1.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "Kayýt Baþarýsýz");
				}
			}
			
		} catch (SQLException e) {
			 e.printStackTrace();
		}
    	
    }

}
