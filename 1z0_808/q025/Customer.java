package com.wealth.certificate.dumps_1z0_808.question025;

public class Customer {
	ElectricAccount acct = new ElectricAccount();
	
	public void useElectricity(double kWh) {
		acct.addKWh(kWh);
	}
}
