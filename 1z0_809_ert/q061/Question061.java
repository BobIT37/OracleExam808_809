package com.wealth.certificate.dumps_1z0_809_ert.question061;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Question061 {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Connection con = null;

		// Assume that dbURL, userName, and password are valid
		// Which code fragment can be inserted at line n1 to enable the code to
		// print Connection Established?
		
		try {
			// line n1
			// A) 
//			 Properties prop = new Properties();
//			 prop.put("user", "sa");
//			 prop.put("password", "wealth");
//			 con = DriverManager.getConnection("jdbc:sqlserver://amornchai-somb:54353;instanceName=MSSQL2012;databaseName=TESTWMG", prop); 
			 
			
			// B) 
//			 con = DriverManager.getConnection("jdbc:sqlserver://amornchai-somb:54353;instanceName=MSSQL2012;databaseName=TESTWMG;user=sa;password=wealth"); 
//			 con.setClientInfo("user","sa");
//			 con.setClientInfo("password", "wealth");
			
			
			// C) con = DriverManager.getConnection(userName, password, dbURL);
			
			
			// D) Properties prop = new Properties();
			// prop.put("userid", userName);
			// prop.put("password", password);
			// con = DriverManager.getConnection(dbURL, prop);
			if (con != null) {
				System.out.print("Connection Established.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print(e);
		}
	}
}

/*
 * 
 * Answer : A
 * 
 */

