package com.wealth.certificate.dumps_1z0_809_ert.question001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question001 {

	public static final String URL = "jdbc:derby:memory:question001;create=true";

	private static void initialDatabase() {
		try(Connection conn = DriverManager.getConnection(URL);Statement st = conn.createStatement()) {
			st.executeUpdate("CREATE TABLE STUDENT(SID INT PRIMARY KEY, SNAME VARCHAR(100), SEMAIL VARCHAR(100) )");
			st.executeUpdate("INSERT INTO STUDENT VALUES (111,'James', 'james@uni.com')");
			st.executeUpdate("INSERT INTO STUDENT VALUES (112,'Jane', 'jane@uni.com')");
			st.executeUpdate("INSERT INTO STUDENT VALUES (114,'John', 'john@uni.com')");	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void printTableStudent() {
		System.out.println("----- printTableStudent -----");
		try(Connection conn = DriverManager.getConnection(URL);Statement st = conn.createStatement()) {
			ResultSet rs = st.executeQuery("SELECT * FROM student");		
			while(rs.next()) {
				System.out.println(rs.getString(1)+"|"+rs.getString(2)+"|"+rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws SQLException {
		
		initialDatabase();
		
		Connection con = DriverManager.getConnection(URL);		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);		
		st.execute("SELECT * FROM student");		
		ResultSet rs = st.getResultSet();		
		rs.absolute(3);
		rs.moveToInsertRow();
		
		rs.updateInt(1, 113);
		rs.updateString(2,"Jammet");
		rs.updateString(3,"jannet@uni.com");
		
		//rs.insertRow();
		rs.updateRow();		
		rs.refreshRow();
		
		System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		
		//rs.close();
		//st.close();
		//con.close();
		
		printTableStudent();
	}

}
