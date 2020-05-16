package com.wealth.certificate.study_1z0_809.chapter01.selftest;

public class Question_1_6 {
	private static int a;
	private int b;
	static {
		a = 1;
		b = 2;
	}

	public static void main(String[] args) {
		Question_1_6 q1 = new Question_1_6();
		Question_1_6 q2 = new Question_1_6();
		q2.b = 1;
		System.out.println(q1.a + q2.b);
	}
}

/*

What is the result?
A. 0
B. 3
C. 2
D. Compilation fails

*/