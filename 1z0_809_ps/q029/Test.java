package com.wealth.certificate.dumps_1z0_809_ps.question029;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static final String URL = "jdbc:derby:memory:question029;create=true";

	public static void initialDatabase() {		
		try(Connection con = DriverManager.getConnection(URL)){
			try(Statement st=con.createStatement()){
				st.executeUpdate("CREATE TABLE EMPLOYEE(EID INT PRIMARY KEY,ENAME VARCHAR(8))");
				st.executeUpdate("INSERT INTO EMPLOYEE VALUES (111,'Tom'), (112,'Jerry'), (113,'Donald')");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
	}

	public static void main(String[] args) {
		
		initialDatabase();
		
		try {
			Connection conn = DriverManager.getConnection(URL);
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT * FROM Employee");
			ResultSet rs = st.getResultSet();
			while (rs.next()) {
				if (rs.getInt(1) == 112) {
					rs.updateString(2, "Jack");
				}
			}
			rs.absolute(2);
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("Exception is raised");
		}
	}

}
