package com.wealth.certificate.dumps_1z0_809.question124;

public class Customer {
	private String fName;
	private String lName;
	private static int count;

	public Customer(String first, String last) {

		fName = first;
		lName = last;
		++count;
	}

	static {
		count = 0;
	}

	public static int getCount() {
		return count;
	}
}