package com.wealth.certificate.dumps_1z0_808.question107;

public class Test {

	public static void main(String[] args) {
		// line n1
		// A (Pass)
		Byte x = 1;

		// B (Pass)
		// short x = 1;

		// C (Type mismatch: cannot convert from int to String)
		// String x ="1";

		// D (Type mismatch: cannot convert from int to Long)
		// Long x = 1;

		// E (Type mismatch: cannot convert from int to Double)
		// Double x = 1;

		// F (Pass)
		// Integer x = new Integer("1");

		switch (x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		}
	}

}
