package com.wealth.certificate.dumps_1z0_809.question098;

public class Coin
{
/* A.
	public enum USCurrency
	{
		PENNY(1),
		NICKLE(5),
		DIME(10),
		QUARTER(25);
		
		private int value;
		
		public USCurrency(/*Int*-/int value) {
			this.value = value;
		}
		
		public int getValue() {return value;}
	}
*/
	public static void main(String[] args)
	{
		USCurrency usCoin = new USCurrency.DIME;
		// C. USCurrency usCoin = USCurrency.DIME;

		System.out.println(usCoin.getValue());
		/** Answered : A,E is incorrect but B,C is correct **/
	}
}