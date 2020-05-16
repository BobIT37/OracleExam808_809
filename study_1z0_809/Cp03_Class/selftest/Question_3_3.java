package com.wealth.certificate.study_1z0_809.chapter03.selftest;

public class Question_3_3 {
	public static void main(String[] args) {
		Question_3_3 q = new Question_3_3() {
			public int sum(int a, int b) { // 1
				return a + b;
			}
		};
		q.sum(2, 6); // 2
	}
}

/*
What is the result?
A. Compilation fails on the declaration marked as // 1
B. Compilation fails on the line marked as // 2
C. 8
D. Nothing is printed

The correct answer is B.
The method main defines an anonymous class that is a subclass of type Question_3_3. 
Since Question_3_3 doesn't define any methods, nothing is overridden and, 
although the method sum is defined inside the anonymous class, 
no methods apart from the ones inherited from Object can be called.
*/