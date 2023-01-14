import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class bildirim {

public String [][] bildirim_goruntule(String id) {
		
		String [][] dizi  = new String [15][4];
		try {
			baglanti conn = new baglanti();			
			int i=0;
			Statement mystat = conn.baglan.createStatement();
	        ResultSet myrs = mystat.executeQuery("SELECT * FROM bsm_208.bildirim");
	        while (myrs.next()) {
	        	
	        	if(myrs.getString("userid").equals(id) || myrs.getString("admin")!=null)
	        	{
	        		
	        		dizi[i][0]=myrs.getString("bildirimid");
	        		dizi[i][1]=myrs.getString("sirket");
	        		dizi[i][2]=myrs.getString("koltukno");
	        		dizi[i][3]=myrs.getString("admin");
	        		i+=1;
	        		
	        	}

	        }
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	
		
		return dizi;
	
	}
	
}
