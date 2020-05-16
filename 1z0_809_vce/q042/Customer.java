package com.wealth.certificate.dumps_1z0_809_vce.question042;

public class Customer {
	private String fName;
	private String lName;
	private static int count;
	public Customer (String first, String last) {fName = first; lName = last; // Fixed comma to semi-colon
	++count;}
	static { count = 0; }
	public static int getCount() {return count; }
}