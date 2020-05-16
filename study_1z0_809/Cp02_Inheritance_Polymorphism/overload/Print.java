package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.overload;

public class Print {
	static void printType(short param) {
		System.out.println("short");
	}

	static void printType(long param) {
		System.out.println("long");
	}

	static void printType(Integer param) {
		System.out.println("Integer");
	}

	static void printType(CharSequence param) {
		System.out.println("CharSequence");
	}

	static void printType(float param, double param2) {
		System.out.println("float-double");
	}

	static void printType(double param, float param2) {
		System.out.println("double-float");
	}

	public static void main(String[] args) {
		byte b = 1;
		int i = 1;
		Integer integer = 1;
		String s = "1";

		printType(b);
		printType(i);
		printType(integer);
		printType(s);

		// Can't find a match
		double d = 1.0;
		printType(d);
		
		// Ambiguous call
		printType(1,1);
	}
}
