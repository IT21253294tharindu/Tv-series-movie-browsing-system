package nlogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;






public class loginDButil {
	
	private static Connection con=null;
	 private static Statement stmt=null;
	 private static ResultSet rs=null;
	 private static boolean issuccess;
 
	public static boolean validate(String username,String password){
		
		
		
		
		
		
		
		boolean status=false;
		//validate
		try {
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			
			String sql="select * from nuser where username='"+username+"'and password='"+password+"'";
			 rs=stmt.executeQuery(sql);
			status=rs.next();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	 
		
	}
public static List<user> validates(String username,String password){
	ArrayList<user>u=new ArrayList<>();
		
		
		
		
		
		
		
		//validate
		try {
			con=DBconnect.getConnection();
			stmt=con.createStatement();
			
			
			String sql="select * from nuser where username='"+username+"'and password='"+password+"'";
			 rs=stmt.executeQuery(sql);
			
			if(rs.next())
			{  
				int id=rs.getInt(1);
				String useru=rs.getString(2);
				String pass=rs.getString(3);
				String name=rs.getString(4);
				String phone=rs.getString(5);
				String address=rs.getString(6);
				String email=rs.getString(7);
				
				user u1=new user(id,useru,pass,name,phone,address,email);
				u.add(u1);
				
				
				
			}	
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	 return u;
		
}

public static List<user> getuserdetails(String id)
{
	int convertedID=Integer.parseInt(id);
	
	ArrayList<user> u=new ArrayList<>();
	
	
			
	try {
		
		
		 con=DBconnect.getConnection();
		 stmt=con.createStatement();
		String sql="select * from nuser where userid='"+convertedID+"'";
		 rs=stmt.executeQuery(sql);
		
	    while(rs.next())
	    {
	    	int id1=rs.getInt(1);
	    	String usernameu=rs.getString(2);
	    	String passwordu=rs.getString(3);
	    	String name=rs.getString(4);
	    	String phone=rs.getString(5);
	    	String address=rs.getString(6);
	    	String email=rs.getString(7);
	    	
	    	user u1=new user(id1,usernameu,passwordu,name,email,address,email);
	    	u.add(u1);
	    	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	return u;
}

public static boolean insertcustomer(String uname,String password,String name,String phone,String address,String email) {
	boolean issuccess=false;
	
	//create database connection
			
			
			try {
				
				con=DBconnect.getConnection();
				stmt=con.createStatement();
				String sql="insert into nuser values(0,'"+uname+"','"+password+"','"+name+"','"+phone+"','"+address+"','"+email+"')";
				int rs=stmt.executeUpdate(sql);
				
				if(rs>0)
				{
					issuccess=true;
				}
				else {
					issuccess=false;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	
	return issuccess; 
}

public static boolean updateuser(String id,String uname,String password,String name,String phone,String address,String email)
{
	try {
		con=DBconnect.getConnection();
		Statement stmt=con.createStatement();
		String sql="update nuser set username='"+uname+"',password='"+password+"',name='"+name+"',phone='"+phone+"',address='"+address+"',email='"+email+"'" + " where userid='"+id+"'";
		int rs=stmt.executeUpdate(sql);
		
		if(rs>0) {
			issuccess=true;
		}
		else {
			issuccess=false;
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	return issuccess;
}
public static boolean deleteuser(String id)
{
	int convertedID=Integer.parseInt(id);
	
	try {
		con=DBconnect.getConnection();
		stmt=con.createStatement();
		String sql="delete from nuser where userid='"+convertedID+"'";
		
		int rs=stmt.executeUpdate(sql);
		
		if(rs>0)
		{
			issuccess=true;
		}
		else {
			issuccess=false;
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
	return issuccess;
}
}


