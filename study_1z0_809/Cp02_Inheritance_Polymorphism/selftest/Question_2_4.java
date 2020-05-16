package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.selftest;

class SuperClass {
	public static void print() {
		System.out.println("Superclass");
	}
}

public class Question_2_4 extends SuperClass {
	public static void print() {
		System.out.println("Subclass");
	}

	public static void main(String[] args) {
		print();
	}
}

/*
What is the result?
A. Superclass
B. Subclass
C. Compilation fails
D. An exception occurs at runtime

Answer: B

Static methods are hidden not overridden. Since the main method is in the subclass, the subclass method is called.

The call to Question_2_4.print() yields the same result:

Subclass

The call to SuperClass.print() yields:

Superclass

*/