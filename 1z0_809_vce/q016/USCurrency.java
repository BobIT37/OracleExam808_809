package com.wealth.certificate.dumps_1z0_809_vce.question016;

public enum USCurrency
{
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;

//	private USCurrency(int value) {
	public USCurrency(int value) {
		this.value = value;
	}
	
	public int getValue() {return value;}
}