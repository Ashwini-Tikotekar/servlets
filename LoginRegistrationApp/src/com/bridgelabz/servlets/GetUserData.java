package com.bridgelabz.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import model.UserDetails;

public  class GetUserData {
	// JDBC driver name and database URL
		static final String JDBC_DRIVER="com.mysql.jdbc.Driver"; 
		static final String DB_URL="jdbc:mysql://localhost/servletproject";
		static java.sql.Statement stmt =null;
		static Connection conn =null;
		//  Database credentials
		static final String USER = "root";
		static final String PASS = "root";
		static int flag=0;
		static  UserDetails user=null;
		
		public static  UserDetails getUserDetails( UserDetails userinfo) throws ClassNotFoundException, SQLException
		{
			try {
				// Register JDBC driver
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
				// Execute SQL query
				String sql,userName;
				userName=userinfo.getUsername();
				sql = "SELECT * FROM loginDB Where username=? and password=?";
				PreparedStatement preStatement=conn.prepareStatement(sql);
				preStatement.setString(1,userinfo.getUsername());
				System.out.println("User nam == "+userinfo.getUsername());
				preStatement.setString(2,userinfo.getPassword() );
				System.out.println(" Password == "+userinfo.getPassword());
				ResultSet rs = preStatement.executeQuery();
				while(rs.next()){
	                flag=1;
	                user=new UserDetails();
	                user.setEmail(rs.getString(4));
	                user.setLastname(rs.getString(3));
	                user.setUsername(rs.getString(2));
	                user.setMobileno(rs.getString(6));
	                user.setPassword(rs.getString(5));
	                System.out.println("password = "+rs.findColumn("password"));
	            }
	            System.out.println("flaggg=== "+flag);
	            rs.close();
	        //    stmt.close();
	            conn.close();
	            // Clean-up environment
	           
	        }catch(SQLException se){
	            //Handle errors for JDBC
	            se.printStackTrace();
	        }
			finally{
	            //finally block used to close resources
	            try{
	                if(stmt!=null)
	                    stmt.close();
	            }catch(SQLException se2){
	            }// nothing we can do
	            try{
	                if(conn!=null)
	                    conn.close();
	            }catch(SQLException se){
	                se.printStackTrace();
	            }//end finally try
	        } //end try
	        
	        return user;
	    }
	}


