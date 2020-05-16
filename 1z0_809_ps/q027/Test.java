package com.wealth.certificate.dumps_1z0_809_ps.question027;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	static Connection newConnection =null;
	public static Connection getDBConnection () throws SQLException {
		try (Connection con = DriverManager.getConnection(URL)) {
			newConnection = con;
		}
		return newConnection;
	}
	
	public static void main (String [] args) throws SQLException {
		initialDatabase(DriverManager.getConnection(URL));
		getDBConnection();
		Statement st = newConnection.createStatement();
		st.executeUpdate("INSERT INTO student VALUES (102, 'Kelvin')");
	}
	
	public static final String URL = "jdbc:derby:memory:question027;create=true";

	public static void initialDatabase(Connection conn) {
		Statement st = null;
		try {
			st = conn.createStatement();
			st.executeUpdate("CREATE TABLE Student(ID INT PRIMARY KEY,NAME VARCHAR(8))");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}