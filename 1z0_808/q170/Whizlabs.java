package com.wealth.certificate.dumps_1z0_808.question170;

public class Whizlabs {									//line 1
	public static void main(String[] args) {			//line 2
		StringBuilder sb = new StringBuilder("1Z0");	//line 3
		sb.concat("-808");								//line 4
		System.out.println(sb);							//line 5
	}
}

/*
What is the output?
A. 1Z0
B. 1Z0-808
C. An exception will be thrown.
D. Compilation fails due to error at line 3.
E. Compilation tails due to error at line 4.

Answer: E

Explanation:
Option E is the correct answer.
Code fails to compile because there is no method called concat in StringBuilder class.
The concat method is in String class. Hence option E is correct Here we should have used
append method of StringBuilder class, in that case option B would be correct.
https://docs.oracle.com/javase/tutorial/java/data/buffers.html
*/
