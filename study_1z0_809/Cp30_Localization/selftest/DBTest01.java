package com.wealth.certificate.study_1z0_809.chapter30.selftest;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBTest01 {
	static Connection newConnection = null;
	public static final String URL = "jdbc:derby:memory:chapter29;create=true";

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test");

		Connection conn2 = DriverManager.getConnection("jdbc:mysql://localhost/test", "db_admin", "db_pwd");

		Properties props = new Properties();
		props.put("user", "db_admin");
		props.put("password", "db_pwd");
		Connection conn3 = DriverManager.getConnection("jdbc:mysql://localhost/db", props);
		
		String url = "jdbc:mysql://localhost:3306/";
		Driver driver = DriverManager.getDriver(url);
		System.out.println(driver.getClass().getName()); // prints com.mysql.jdbc.Driver

		Connection conn4 = driver.connect(url, props);
	}

}
