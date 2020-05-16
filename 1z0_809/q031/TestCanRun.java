package com.wealth.certificate.dumps_1z0_809.question031;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class TestCanRun {
	static Connection newConnection =null;
	public static Connection getDBConnection () throws SQLException {
		try (	
				Connection con = DriverManager.getConnection(URL);
				Statement st = con.createStatement();
			) {
			newConnection = con;
			System.out.println(st.executeUpdate("CREATE TABLE Student(ID INT PRIMARY KEY,NAME VARCHAR(8))"));
			System.out.println(st.executeUpdate("INSERT INTO student VALUES (102, 'Kelvin'), (103, 'Kelvins')"));
		}
		return newConnection;
	}
	
	public static void main (String [] args) throws SQLException {
		getDBConnection();
	}
	
	public static final String URL = "jdbc:derby:memory:question031;create=true";
}

