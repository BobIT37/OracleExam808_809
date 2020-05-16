package com.wealth.certificate.study_1z0_809.chapter03.selftest;

public class Question_3_1 {
	interface ITest { // 1
		void m();
	}

	public static void main(String args[]) {
        ITest t = new ITest() { // 2
            public void m() {
                System.out.println("m()");
            }
        }
        t.m();
    }
}
/*
What is the result?
A. m()
B. Compilation fails on the declaration marked as // 1
C. Compilation fails on the declaration marked as // 2
D. An exception occurs at runtime

The correct answer is C.
There's nothing wrong with the ITest interface; you can declare inner interfaces without problems. 
What is wrong is that the declaration of the anonymous class is missing the closing semicolon.

Remember, the declaration of an anonymous class is a Java expression, 
like declaring an int variable, so it has to end with a semicolon after the curly brace.
*/