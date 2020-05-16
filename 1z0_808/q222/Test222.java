package com.wealth.certificate.dumps_1z0_808.question222;

public class Test222 {

	public static void main(String[] args) {
		try {
			Double number = Double.valueOf("120D"); // line 5
		} catch (NumberFormatException ex) {

		}
		 System.out.println(number); //line 8  out of scope, number is a local variable in try block
	}

}


//Answer : E. Compilation tails due to error at line 8.
