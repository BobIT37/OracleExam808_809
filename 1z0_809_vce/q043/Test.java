package com.wealth.certificate.dumps_1z0_809_vce.question043;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static final String URL = "jdbc:derby:memory:question043;create=true";
	
	public static void initialDatabase() {		
		try(Connection con=DriverManager.getConnection(URL);Statement st = con.createStatement()){			
			st.executeUpdate("CREATE TABLE ITEM(ID INT PRIMARY KEY,DESCRIP VARCHAR(100),PRICE REAL,QUANTITY INT)");
			st.executeUpdate("INSERT INTO ITEM VALUES (110,'A',100.00,1), (111,'B',100.50,1), (112,'C',101.00,1)");			
		} catch (SQLException e) {
			e.printStackTrace();
		}			
	}
	
	public static void main(String[] args) {
		
		initialDatabase();
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL);						
			String query = "Select * FROM Item WHERE ID = 110";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("ID: " + rs.getInt("Id"));
				System.out.println("Description: " + rs.getString("Descrip"));
				System.out.println("Price: " + rs.getDouble("Price"));
				System.out.println("Quantity: " + rs.getInt("Quantity"));
			}			
			
		} catch (SQLException e) {
			System.out.println("Error");
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
