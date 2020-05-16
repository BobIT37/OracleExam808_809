package com.wealth.certificate.dumps_1z0_808.question025;

public class ElectricAccount {
	
	private double kWh;
	private double rate = 0.07;
	private double bill;
	
	//line1
//	A)  
//	public void addKWh(double kWh){	
//		this.kWh += kWh;
//		this.bill = this.kWh*this.rate;
//	}

//	B) 
	public void addKWh(double kWh){
		if(kWh > 0){
			this.kWh += kWh;
			this.bill = this.kWh * this.rate;
		}
	}

//	C) 
//	private void addKWh(double kWh){ // cannot call addKWh from Customer.java because private
//		if(kWh > 0){
//			this.kWh += kWh;
//			this.bill = this.kWh * this.rate;
//		}
//	}

//	D) 
//	public void addKWh(double kWh){
//		if(kWh > 0){
//			this.kWh += kWh;
//			setBill(this.kWh);		// Error because cannot call method with parameter
//		}
//	}
//	
//	public void setBill(){
//		bill = kWh*rate;
//	}

}
