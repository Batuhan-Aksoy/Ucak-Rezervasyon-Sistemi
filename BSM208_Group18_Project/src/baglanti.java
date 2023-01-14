import java.sql.*;

public class baglanti {
	public Connection baglan;
	 public baglanti () throws SQLException {
		 
		  baglan = DriverManager.getConnection("jdbc:mysql://localhost:3306/bsm_208","root","1234");
		 
	 }
	

}
