package com.wealth.certificate.dumps_1z0_808.question187;

class DBConfiguration {
	String username;
	String password;
}

public class DBHandler {

	DBConfiguration configureDB(String uname, String password) {
		// insert code here
	}

	public static void main(String[] args) {
		DBHandler r = new DBHandler();
		DBConfiguration dbConf = r.configureDB("manager", "manager");
	}

}
