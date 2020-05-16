package com.wealth.certificate.study_1z0_809.chapter03.selftest;

public class Question_3_7 {
	public static void main(String[] args) {
		abstract class A { // 1
			public void m() {
				System.out.println("m()");
			}
		}
		public class AA extends A {
		} // 2
	}
}

/*
What change would make this code compile?
A. Remove the abstract keyword on the line // 1
B. Add the public keyword on the line // 1
C. Remove the public keyword on the line // 2
D. None. This code compiles correctly

The correct answer is C.
Local classes cannot have access modifiers. The only allowed modifiers are abstract and final.

*/