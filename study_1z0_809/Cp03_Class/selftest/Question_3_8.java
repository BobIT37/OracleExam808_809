package com.wealth.certificate.study_1z0_809.chapter03.selftest;

public class Question_3_8 {
	int i = 2;

	interface A {
		int add();
	}

	public A create(int i) {
		return new A() {
			public int add() {
				return i + 4;
			}
		};
	}

	public static void main(String[] args) {
		A a = new Question_3_8().create(8);
		System.out.println(a.add());
	}
}

/*

What is the result?
A. 6
B. 12
C. Compilation fails
D. An exception occurs at runtime

The correct answer is B.
Method add of the anonymous class returned by method create uses the effectively final 
(as it's never modified) parameter i, not the instance variable of the same name.

Since all the code is valid, 12 is printed.

*/