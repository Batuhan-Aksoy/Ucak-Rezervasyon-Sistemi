import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class giris_kontrol {
	
	public String kullaniciid="";
	public void giris (String name, String pass) {
		
		if (name.equals("") || pass.equals("")) {

			JOptionPane.showMessageDialog(null, "Kullan�c� Ad� ve �ifre Bo� B�rak�lamaz ");
			
		} else {
			try {
				boolean flag=false;
				baglanti conn = new baglanti();
				Statement mystat = conn.baglan.createStatement();
				ResultSet myrs = mystat.executeQuery("SELECT * FROM bsm_208.users");
				while (myrs.next()) {
					
					if(name.equals("admin1-batu") && pass.equals("admin1-1234"))
					{
						String admin_name="Batuhan";
						admin form5 = new admin(admin_name);
						form5.setVisible(true);
						flag=true;
						break;
					}
					if(name.equals("admin2-emirhan") && pass.equals("admin2-1234"))
					{
						String admin_name="Emirhan";
						admin form5 = new admin(admin_name);
						form5.setVisible(true);
						flag=true;
						break;
					}
					if(name.equals("admin3-fatih") && pass.equals("admin3-1234"))
					{
						String admin_name="Fatih";
						admin form5 = new admin(admin_name);
						form5.setVisible(true);
						flag=true;
						break;
					}
					
					if (myrs.getString("username").equals(name)
							&& myrs.getString("userpas").equals(pass)) {
						flag=true;
						kullaniciid=myrs.getString("idusers");
						JOptionPane.showMessageDialog(null, "Giri� Ba�ar�l� Ho�geldiniz " + myrs.getString("username"));
						kullanici form3 = new kullanici(kullaniciid);
						form3.setVisible(true);
						break;

					} 		
				}
				if(flag!=true)
					{
						JOptionPane.showMessageDialog(null, "Kullan�c� Ad� veya �ifre Hatal�");
						login form4 = new login();
						form4.setVisible(true);
					}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
	
	

}
