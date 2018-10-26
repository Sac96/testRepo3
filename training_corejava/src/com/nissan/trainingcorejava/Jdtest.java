package com.nissan.trainingcorejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Jdtest {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//				try {
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				String url="jdbc:mysql://localhost3306/airdb";
//				String user="root";
//				String pass="mysql";
//				
//				try {
//					Connection myConn = DriverManager.getConnection(url,user,pass);
//					Statement myStmt = myConn.createStatement();
//					
//					ResultSet myRs=myStmt.executeQuery("select * from login");
////					myStmt.executeQuery("select * from airdb");
//					while(myRs.next()) {
//						System.out.println(myRs.getString("username"));
//					}
//					
//				}catch(Exception e) {
//					System.out.println("nothing");
//				}
//				}catch(Exception e) {
//					
//				}
//				
//
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			//step1 load the driver class  
//			Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/airdb?autoReconnect=true&useSSL=false","root","mysql");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from login");  
			//System.out.println("found");
			while(rs.next())  
			{
				
			System.out.println(rs.getString(1));  
			System.out.println(rs.getString(2));  
			System.out.println(rs.getString(3));  
			}
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  

	}


}
