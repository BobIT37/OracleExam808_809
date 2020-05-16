package com.wealth.certificate.study_1z0_809.chapter03.selftest;

public class Question_3_6 {
	private class A { // 1
		public int plusTwo(int n) {
			return n + 2;
		}
	}

	public static void main(String[] args) {
		Question_3_6.A a = new A(); // 2
		System.out.println(a.plusTwo(3));
	}
}

/*
What is the result?
A. Compilation fails on the line // 1
B. Compilation fails on the line // 2
C. 5
D. An exception occurs at runtime

The correct answer is B.
The inner class A can be marked as private and method main can access it because both are members of Question_3_6 class.

However, since main is a static method, nothing guarantees that there will be an instance of Question_3_6, 
so you must explicitly create one to instantiate the inner class A. 
So instead of:
	Question_3_6.A a = new A();

You have to use:
Question_3_6 q = new Question_3_6();
Question_3_6.A a = q.new A();
*/