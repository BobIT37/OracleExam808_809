package com.wealth.certificate.dumps_1z0_809.question087;

class DBConfiguration {
	String user;
	String password;
}
public class DBHandler {
	DBConfiguration configureDB(String uname, String password) {
		// insert code here
		//A. 
		/*DBConfiguration f;
		return f;*/
		//B. 
		//return DBConfiguration;
		//C. 
		return new DBConfiguration();
		//D. 
		//return 0;
	} 
	public static void main(String[] args) {
		DBHandler r = new DBHandler();
		DBConfiguration dbConf = r.configureDB("manager", "manager");
	}
}
