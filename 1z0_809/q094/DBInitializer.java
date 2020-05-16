package com.wealth.certificate.dumps_1z0_809.question094;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBInitializer {

	public static final String URL = "jdbc:derby:memory:question103;create=true";

	public static void init() {

		try (Connection conn = DriverManager.getConnection(URL)) {
			try (Statement stt = conn.createStatement()) {
				// create and insert employee
				stt.execute("CREATE TABLE EMPLOYEE(ID INT PRIMARY KEY ,NAME VARCHAR(30)) ");
				stt.execute("INSERT INTO EMPLOYEE (ID,NAME) VALUES (111,'TOM')");
				stt.execute("INSERT INTO EMPLOYEE (ID,NAME) VALUES (112,'JERRY')");
				stt.execute("INSERT INTO EMPLOYEE (ID,NAME) VALUES (113,'DONALD')");


				// create and insert customer
//				stt.execute("CREATE TABLE CUSTOMER(ID INT PRIMARY KEY)");
//				stt.execute("INSERT INTO CUSTOMER (ID) VALUES (1), (2), (3)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
