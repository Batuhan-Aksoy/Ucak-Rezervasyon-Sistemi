import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class admin_rezervasyon {
	
	
	public String [][] admin_rez(){
		
		String [][] dizi  = new String [15][6];
	try {
		
		baglanti conn = new baglanti();			
		int i=0;
		Statement mystat = conn.baglan.createStatement();
        ResultSet myrs = mystat.executeQuery("SELECT * FROM bsm_208.rezervasyon");
        while (myrs.next()) {
        	      		
        		dizi[i][0]=myrs.getString("rezid");
        		dizi[i][1]=myrs.getString("rez_byer");
        		dizi[i][2]=myrs.getString("rez_gyer");
        		dizi[i][3]=myrs.getString("rez_tarih");
        		dizi[i][4]=myrs.getString("rez_sirket");
        		dizi[i][5]=myrs.getString("rez_koltukno");
        		i+=1;

        }
		
		
	} catch (SQLException e) {

		e.printStackTrace();
	}
	return dizi;
}
	

}
