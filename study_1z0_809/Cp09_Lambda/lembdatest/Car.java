package com.wealth.certificate.study_1z0_809.chapter09.lembdatest;

public class Car {
	private int number;
	private String type;
	private int costUSD = 20000;
	
	public Car(int number, String type){
		this.type = type;
		this.number=number;
	}
	public String getType() {
		return type;
	}
	public int getNumber() {
		return number;
	}
	public int getCostUSD() {
		return costUSD;
	}
	
}

class CarTypes{
	public static final String COMPACT="Compact";
}
