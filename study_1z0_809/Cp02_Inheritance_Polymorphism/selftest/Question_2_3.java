package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.selftest;

public class Question_2_3 {
	public static void print(Integer i) {
		System.out.println("Integer");
	}

	public static void print(Object o) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		print(null);
	}
}

/*

What is the result?
A. Integer
B. Object
C. Compilation fails
D. An exception occurs at runtime

Answer: A

You could say that the overload is ambiguous, and compilation fails, since null can be assigned to any type, but in fact, 
there's a rule that says the in overloading the most SPECIFIC one is chosen. 
Since Integer is more specific than Object, the former is selected.

*/