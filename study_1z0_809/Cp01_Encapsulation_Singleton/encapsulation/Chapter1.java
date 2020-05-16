package com.wealth.certificate.study_1z0_809.chapter01.encapsulation;

public class Chapter1 {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.myField = "James";
		myClass.myMethod();
	}
}

//No Encapsulation (Bad)
class MyClass {
	String myField = "you";

	void myMethod() {
		System.out.println("Hi " + myField);
	}
}

/*
 * Encapsulation = the ability to hide or protect an object's data.
 */
class MyClass2 {
	// Hiding the attr to the outside world with the private keyword
	private int myField = 0;

	void setMyField(String val) { // Still accepting a String
		try {
			myField = Integer.parseInt(val);
		} catch (NumberFormatException e) {
			myField = 0;
		}
	}
}

