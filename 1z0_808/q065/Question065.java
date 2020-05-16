package com.wealth.certificate.dumps_1z0_808.question065;

public class Question065 {

	static void arguments(String one, String second, String third) {
		System.out.println(one + " : " + second + " : " + third);
	}

	public static void main(String[] args) {
		// The method arguments(String, String, String) in the type Question065 is not
		// applicable for the arguments (String, String)
		arguments("arg1", "arg2");
	}

}
