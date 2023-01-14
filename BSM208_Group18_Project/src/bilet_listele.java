import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class bilet_listele {
	
	public String[][] listele (String sirket) {
		String tabloadi="";
		String sirketadi="";
		if(sirket=="A Þirketi")
		{
			tabloadi="a_sirket";
		}
		if(sirket=="B Þirketi")
		{
			tabloadi="b_sirket";
		}
		if(sirket=="C Þirketi")
		{
			tabloadi="c_sirket";
		}
		
		String dizi [][] = new String [15][3];
		try {
		int i = 0;
		baglanti conn = new baglanti();
		Statement mystat = conn.baglan.createStatement();
		ResultSet myrs = mystat.executeQuery("SELECT * FROM bsm_208."+tabloadi);
		while (myrs.next()) {
			
			if(myrs.getString("userid").equals("0"))
			{
				
				dizi [i][0]=myrs.getString(sirket.charAt(0)+"_sirket_koltukno");
				dizi [i][1]=myrs.getString(sirket.charAt(0)+"_sirket_koltukfiyat");
				dizi [i][2]=myrs.getString(sirket.charAt(0)+"_sirket_koltukturu");
				i+=1;		
			}
			
		    	
		 }
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
      return dizi;


		
	}

}
