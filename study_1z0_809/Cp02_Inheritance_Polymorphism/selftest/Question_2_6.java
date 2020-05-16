package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.selftest;

abstract class SuperClass3 {
	public void print() {
		System.out.println("Superclass");
	}
}

public class Question_2_6 extends SuperClass3 {
	public void print() {
        System.out.println("Subclass");
    }

public static void main(String[] args) {
        Question_2_6 q = new Question_2_6();
        ((SuperClass3)q).print();
}

/*
What is the result?
A. Superclass
B. Subclass
C. Compilation fails
D. An exception occurs at runtime

Answer: B

Even when the variable is cast to SuperClass3, Java chooses to execute the method of the subclass thanks to polymorphism. 
If we want to execute the method of the superclass, we have to instantiate an object from that class.
*/