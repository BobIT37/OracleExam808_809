package com.wealth.certificate.exam_1z0_809.question002;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question002 {
	public static final String URL = "jdbc:derby:memory:question001;create=true";

	private static void initialDatabase() {
		try(Connection conn = DriverManager.getConnection(URL);Statement st = conn.createStatement()) {
			st.executeUpdate("CREATE TABLE STUDENT(SID INT PRIMARY KEY, SNAME VARCHAR(100), SEMAIL VARCHAR(100) )");
			st.executeUpdate("INSERT INTO STUDENT VALUES (111,'James', 'james@uni.com')");
			st.executeUpdate("INSERT INTO STUDENT VALUES (112,'Jane', 'jane@uni.com')");
			st.executeUpdate("INSERT INTO STUDENT VALUES (113,'John', 'john@uni.com')");	
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
		st.setMaxRows(2); 	//****
		rs.absolute(3);		//****
		
		
		System.out.println(rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
		

	}
}

/**
 * A. print ค่าได้
 * B. เกิด Exception
 * 
 */
