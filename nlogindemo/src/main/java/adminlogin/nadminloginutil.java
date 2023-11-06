package adminlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import adminlogin.admin;

public class nadminloginutil {

	
public static boolean validate(String username,String password){
		
		
		
		
		//create database connection
		String url="jdbc:mysql://localhost:3306/otms";
		String user="root";
		String psw="00000";
		boolean status=false;
		//validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,user,psw);
			Statement stmt=con.createStatement();
			
			String sql="select * from nadmin where username='"+username+"'and password='"+password+"'";
			ResultSet rs=stmt.executeQuery(sql);
			status=rs.next();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	 
		
	}
public static List<admin> validates(String username,String password){
	ArrayList<admin>u=new ArrayList<>();
		
		
		
		
		//create database connection
		String url="jdbc:mysql://localhost:3306/otms";
		String user="root";
		String psw="00000";
		
		//validate
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection(url,user,psw);
			Statement stmt=con.createStatement();
			
			String sql="select * from nadmin where username='"+username+"'and password='"+password+"'";
			ResultSet rs=stmt.executeQuery(sql);
			
			if(rs.next())
			{  
				int id=rs.getInt(1);
				String useru=rs.getString(2);
				String pass=rs.getString(3);
				String name=rs.getString(4);
				String email=rs.getString(5);
				
				admin a1=new admin(id,useru,pass,name,email);
				u.add(a1);
				
				
				
			}	
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	 return u;
		
}
}
