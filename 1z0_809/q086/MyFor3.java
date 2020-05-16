package com.wealth.certificate.dumps_1z0_809.question086;

public class MyFor3 {
	public static void main(String[] args) {
		int[] xx = null;
		for (int ii : xx) {
			System.out.println(ii);
		}
	}
}

/*
What is the result?
A. Null
B. Compilation fails
C. An exception is thrown at runtime
D. 0

Answer: C
	Try to access null Object
	Exception in thread "main" java.lang.NullPointerException
	at com.wealth.certificate.dumps_1z0_809.question086.MyFor3.main(MyFor3.java:6)
*/