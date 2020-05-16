package com.wealth.certificate.dumps_1z0_809_ert.question025;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question025 {
	
	public static final String URL = "jdbc:derby:memory:question025;create=true";
	
	public static void main(String[] args) throws Exception {
		try (Connection conn = DriverManager.getConnection(URL)) {
			initialDatabase(conn);
			/* Answer D is correct
			 * The program prints Status: false and 
		 	 * two records are deleted from the Student table.
		 	 */
			getById(conn, 103);
			/*
			 * id = 103, name = Edward
			 * id = 103, name = Edwin
			 */
			deleteById(conn, 103);
			/*
			 * Status : false
			 */
			getById(conn, 103);
			/*
			 * print nothing
			 */
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void deleteById(Connection conn, int id) {
		try (Statement st = conn.createStatement()) {
			String query = "DELETE FROM Student WHERE id = "+id;
			System.out.println(" Status : " + st.execute(query )) ;	
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	} 
	
	public static void getById(Connection conn, int id) {
		try (Statement st = conn.createStatement()) {
			String query = "select * FROM Student WHERE id = "+id;
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("id = " + rs.getInt("id")+", name = " + rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
	
	public static void initialDatabase(Connection conn) {
		try (Statement st = conn.createStatement()) {
			st.executeUpdate("CREATE TABLE Student(ID INT,NAME VARCHAR(8))");
			st.executeUpdate("INSERT INTO Student VALUES (102, 'Edwin')");
			st.executeUpdate("INSERT INTO Student VALUES (103, 'Edward')");
			st.executeUpdate("INSERT INTO Student VALUES (103, 'Edwin')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
