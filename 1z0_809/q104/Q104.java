package com.wealth.certificate.dumps_1z0_809.question104;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Q104 {
	public static final String URL = "jdbc:derby:memory:question104;create=true";

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
				System.out.println("ID:" + rs.getInt("Id"));
				System.out.println("Description:" + rs.getString("Descrip"));
				System.out.println("Price:" + rs.getDouble("Price"));
				System.out.println("Quantity:" + rs.getInt("Quantity"));
			}
		} catch (SQLException se) {
			System.out.println("Error");
		 }
	}
}


/*Given:
	Item table
	• ID, INTEGER: PK
	• DESCRIP, VARCHAR(100)
	• PRICE, REAL
	• QUANTITY< INTEGER
	
	And given the code fragment:
	9. try {
	10.Connection conn = DriveManager.getConnection(dbURL, username, password);
	11. String query = "Select * FROM Item WHERE ID = 110";
	12. Statement stmt = conn.createStatement();
	13. ResultSet rs = stmt.executeQuery(query);
	14.while(rs.next()) {
	15.System.out.println("ID:" + rs.getInt("Id"));
	16.System.out.println("Description:" + rs.getString("Descrip"));
	17.System.out.println("Price:" + rs.getDouble("Price"));
	18. System.out.println(Quantity:" + rs.getInt("Quantity"));
	19.}
	20. } catch (SQLException se) {
	21. System.out.println("Error");
	22. }
	Assume that:
	The required database driver is configured in the classpath.
	The appropriate database is accessible with the dbURL, userName, and passWord exists.
	The SQL query is valid.
	
	What is the result?
	A. An exception is thrown at runtime.
	B. Compilation fails.
	C. The code prints Error.
	D. The code prints information about Item 110.
	
	Answer: D
	*/
