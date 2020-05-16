package com.wealth.certificate.dumps_1z0_808.question156;

public class MyClass {
	public static void main(String[] args) {
		while (int ii = 0; ii < 2) {
			ii++;
			System.out.println("ii = " + ii);
		}
	}
}

/*
What is the result?
A. ii = 1
ii = 2
B. Compilation fails
C. The program prints nothing
D. The program goes into an infinite loop with no output
E. The program goes to an infinite loop outputting:
ii = 1
ii = 1
*/

// Answer: B

/*
Explanation: The while statement is incorrect. It has the syntax of a for statement.
The while statement continually executes a block of statements while a particular condition
is true. Its syntax can be expressed as:
	while (expression) {
		statement(s)
	}
The while statement evaluates expression, which must return a boolean value. If the
expression evaluates to true, the while statement executes the statement(s) in the while
block. The while statement continues testing the expression and executing its block until
the expression evaluates to false.
Reference: The while and do-while Statements
*/