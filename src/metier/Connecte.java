package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecte {
	private static Connection con ;
	
	private static String usernm ="root";
	private static String pswd = "";
	private static String url="jdbc:mysql://localhost:3306/annance";
	static {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,usernm, pswd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public static Connection getConnect()
	{
		return con ; 
	}
	
	

}
