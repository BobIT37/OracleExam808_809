package com.wealth.certificate.dumps_1z0_809.question103;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) throws SQLException {
		
		DBInitializer.init();
		String dbURL = DBInitializer.URL, userName = null, passWord = null;
		
/* 9:*/	Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
/*10*/	String query = "SELECT id from Employee";
/*11*/	try(Statement stmt = conn.createStatement()) {
/*12*/		ResultSet rs = stmt.executeQuery(query);
/*13*/		stmt.executeQuery("SELECT id from Customer");
/*14*/		while(rs.next()) {
/*15*/			// process the result
/*16*/			System.out.println("Employee ID: "+ rs.getInt("id"));
/*17*/		}
/*18*/	} catch( Exception e ) {
/*19*/		System.out.println("Error");
/*20*/	}

	}
}
