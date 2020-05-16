package com.wealth.certificate.dumps_1z0_809_ert.question004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Question004 {
	public static void main(String[] args) {
			try {
				Connection con1 = DriverManager.getConnection("jdbc : xyzdata : //localhost:3306/EmployeeDB") ;
				//Connection con2 = Connection.getDriver("jdbc : xyzdata : //localhotst:3306/EmployeeDB") ;
				//Class.forName("org.xyzdata.jdbc.NetworkDriver");
				//DriverManager.loadDriver("org.xyzdaga.jdbc.NetworkDriver");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}