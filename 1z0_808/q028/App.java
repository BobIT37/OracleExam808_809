package com.wealth.certificate.dumps_1z0_808.question028;

public class App {

	public static void main(String[] args) {
		Boolean[] bool = new Boolean[2];

		bool[0] = new Boolean(Boolean.parseBoolean("true")); // Constructor Boolean(boolean)
        //boolean = Boolean.parseBoolean("true") is true
		bool[1] = new Boolean(null); // Constructor Boolean(String) // String = null is false

		/** Answered : A is correct **/
		System.out.println(bool[0] + " " + bool[1]);  // True false
	}
}
