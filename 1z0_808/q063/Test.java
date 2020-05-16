package com.wealth.certificate.dumps_1z0_808.question063;

public class Test {

	public static void main(String[] args) {
		double discount = 0;
		int qty = Integer.parseInt(args[0]);
		// A
		/* if (qty >= 90) { discount = 0.5;} 
		 if (qty > 80 && qty < 90) {discount = 0.2;}*/
		 

		// B
		/*
		 * discount = (qty >= 90) ? 0.5 : 0; 
		 * discount = (qty > 80) ? 0.2 : 0;
		 */

		// C
		/* discount = (qty >= 90) ? 0.5 : (qty > 00)? 0.2 : 0; */

		// D
		if (qty > 80 && qty < 90) {
			discount = 0.2;
		} else {
			discount = 0;

		if (qty >= 90) {
			discount = 0.5;
		} else
			discount = 0;
		}
		
		//E
		/*discount = (qty > 80) ? 0.2 : (qty >= 90) ? 0.5 : 0;*/
		 
		 System.out.println(discount);
	}

}
