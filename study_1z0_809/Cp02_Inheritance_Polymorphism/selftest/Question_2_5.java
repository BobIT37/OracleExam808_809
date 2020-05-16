package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.selftest;

abstract class SuperClass2 {
	public static void print() {
		System.out.println("Superclass");
	}
}

class SubClass extends SuperClass2 {

}

public class Question_2_5 extends SuperClass {
	public static void main(String[] args) {
		SubClass subclass = new SubClass();
		subclass.print();
	}
}

/*
What is the result?
A. Superclass
B. Compilation fails because an abstract class cannot have static methods
C. Compilation fails because Subclass doesn't implement method print()
D. Compilation fails because Subclass doesn't have a method print()
E. An exception occurs at runtime

Answer: A

Static methods are allowed in abstract classes, the only restriction being that they cannot be abstract.
All methods that are accessible are inherited by subclasses. If an inherited method is static, 
the only difference is that the method can be hidden instead of overridden.


*/