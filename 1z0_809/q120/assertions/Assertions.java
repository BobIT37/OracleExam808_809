package com.wealth.certificate.dumps_1z0_809.question120.assertions;

public class Assertions {
	public static void main(String[] args) {
		
		//default Assertions
		assert false; 
		
		//Assertions with message
		assert false : "Invalid Denominator";
		
		//check if something is true or false
		int id = 0;
		assert(id >=1) : "Invalid Denominator";
		
		//sent message Object
		assert false : new Assertions();
		
		//sent message Boolean
		assert false : true;
		
		//sent message Double
		assert false : 2.5;
		
		//sent message Null
		assert false : null;
		
		//throw
		if (!(false)) {
			throw new AssertionError();
		}
	}
}
