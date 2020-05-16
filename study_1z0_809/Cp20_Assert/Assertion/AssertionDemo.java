package com.wealth.certificate.study_1z0_809.chapter20.Assertion;

public class AssertionDemo {

	public static void main(String[] args) {
		int i; int sum = 0;
		for (i=0; i < 10; i++) {
			sum += i;
		}
		
		assert i == 10;
		assert sum > 10 && sum < 5 * 10 : "sum is " + sum;
		
		/*System.out.println("i = " + i);
		System.out.println("sum = " + sum); */
	} 
	
}
