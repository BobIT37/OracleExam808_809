package com.wealth.certificate.dumps_1z0_809_ps.question105;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static final String URL = "jdbc:derby:memory:question105;create=true";

	public static void initialDatabase(Connection conn) {
		Statement st = null;
		try {
			st = conn.createStatement();
			st.executeUpdate("CREATE TABLE ITEM(ID INT PRIMARY KEY, DESCRIP VARCHAR(100), PRICE REAL, QUANTITY INT)");
			st.executeUpdate("INSERT INTO ITEM VALUES (110,'Descript', 9, 1)");
			
	
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

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL);
			initialDatabase(conn);

			String query = "Select * FROM Item WHERE ID = 110";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("Description:" + rs.getString("Descrip"));
				System.out.println("Price:" + rs.getDouble("Price"));
				System.out.println("Quantity:" + rs.getInt("Quantity"));

			}

		} catch (SQLException se) {

			System.out.println("Error");
		}
	}
}
