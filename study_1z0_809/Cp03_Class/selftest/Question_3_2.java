package com.wealth.certificate.study_1z0_809.chapter03.selftest;

public class Question_3_2 {
	public static void main(String args[]) {
		Question_3_2 q = new Question_3_2();
		int i = 2;
		q.method(i);
		i = 4;
	}

	void method(int i) {
		class A {
			void helper() {
				System.out.println(i);
			}
		}
		new A().helper();
	}
}

/*
What is the result?
A. Compilation fails
B. 2
C. 4
D. An exception occurs at runtime

The correct answer is B.
Local classes (the ones defined inside a method) and anonymous classes 
(the ones defined without a name) can only access variables of the enclosing context that are final or effectively final 
(which means that a variable cannot be modified after its initialization).

The variable i is modified after the method call so that it won't qualify as an effectively final variable. 
However, this is not the variable used inside method(), since in Java, all parameters are passed by value. 
As the parameter is not modified inside the method, it is effectively final and can be used inside local class A.
*/
