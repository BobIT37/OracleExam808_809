package com.wealth.certificate.dumps_1z0_808.question029;

public class Calculator {

	public static void main(String[] args) {
		int num = 5;
		//int sum; // from question		
		int sum = 0;
		do {
			sum += num;
		} while ( (num--) > 1);
		
		System.out.println("The sum is "+ sum + ".");
	}

}