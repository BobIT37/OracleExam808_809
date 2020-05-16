package com.wealth.certificate.dumps_1z0_809.question094;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Question94 {

	public static void main(String[] args) throws SQLException {

		try {
			DBInitializer.init();
			String dbURL = DBInitializer.URL, userName = null, passWord = null;

			Connection conn = DriverManager.getConnection(dbURL, userName, passWord);

			Statement smt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			smt.execute("SELECT * FROM employee");
			ResultSet rs = smt.getResultSet();
			while (rs.next()) {
				if (rs.getInt(1) == 112) {
					rs.updateString(2, "Jack");
				}
				//System.out.println(rs.getInt(1) + "--- " + rs.getString(2));
				//rs.updateRow();
			}
			
			rs.absolute(2);
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			
			
//			Statement smt2 = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			smt2.execute("SELECT * FROM employee");
//			ResultSet rs2 = smt2.getResultSet();
//			while (rs2.next()) {
//				System.out.println(rs2.getInt(1) + "****** " + rs2.getString(2));
//
//			}
			
		} catch (SQLException ex) {
			System.out.println("Exception is raised");
		}
	}
}

/*
 * Assume that:
The required database driver is configured in the classpath.
The appropriate database accessible with the URL, userName, and passWord exists.
What is the result?

	A. The Employee table is updated with the row:
	112 Jack
	and the program prints:
	112 Jerry
	B. The Employee table is updated with the row:
	112 Jack
	and the program prints:
	112 Jack
	C. The Employee table is not updated and the program prints:
	112 Jerry
	D. The program prints Exception is raised.
	
Answer: C
 * 
 * 
 * 
 * The sensitivity of a ResultSet object is determined by one of three different ResultSet types:

TYPE_FORWARD_ONLY: The result set cannot be scrolled; its cursor moves forward only, from before the first row to after the last row. The rows contained in the result set depend on how the underlying database generates the results. That is, it contains the rows that satisfy the query at either the time the query is executed or as the rows are retrieved.
TYPE_SCROLL_INSENSITIVE: The result can be scrolled; its cursor can move both forward and backward relative to the current position, and it can move to an absolute position. The result set is insensitive to changes made to the underlying data source while it is open. It contains the rows that satisfy the query at either the time the query is executed or as the rows are retrieved.
TYPE_SCROLL_SENSITIVE: The result can be scrolled; its cursor can move both forward and backward relative to the current position, and it can move to an absolute position. The result set reflects changes made to the underlying data source while the result set remains open.
The default ResultSet type is TYPE_FORWARD_ONLY.
 * */
