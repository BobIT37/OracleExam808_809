package com.wealth.certificate.dumps_1z0_809.question098;

public enum USCurrency
{
	PENNY(1),
	NICKLE(5),
	DIME(10),
	QUARTER(25);
	
	private int value;
	// E. private final int value;
	
	/* B. private*/ public USCurrency(/*Int*/int value) {
		this.value = value;
	}
	
	public int getValue() {return value;}
	// D. public static int getValue() {return value;}
}