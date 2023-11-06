package nlogin;

import java.sql.Connection;
import java.sql.DriverManager;



public class DBconnect {
	private static String url="jdbc:mysql://localhost:3306/otms";
	private static String username="root";
	private static String psw="00000";
	private static Connection con;
	    
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url,username,psw);
		}
		catch(Exception e) {
		  System.out.println("database connection is not success");
		}
		return con;
	}

}
