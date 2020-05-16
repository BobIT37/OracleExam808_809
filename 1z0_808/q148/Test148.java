package com.wealth.certificate.dumps_1z0_808.question148;

public class Test148 {
	public static void main (String[] args) { 
		Short s1 = 200; 
		Integer s2 = 400; 
		Long s3 = (long) s1 + s2; 		//line n1 
		//String s4 = (String) (s3 * s2); //line n2 
		String s4 = ""+(s3 * s2); //edit line n2 
		System.out.println("Sum is " + s4) ;
	}
}
