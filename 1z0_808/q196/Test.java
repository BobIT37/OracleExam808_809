package com.wealth.certificate.dumps_1z0_808.question196;

public class Test
{
	public static void main(String[] args) 
	{
		int x = 10;
		
		if(x > 10) {
			System.out.println(">");
		}
		else if(x < 10) {
			System.out.println("<");
		}
		else {
			System.out.println("=");
		}
		
		/** Answered : C is correct but Question Answer is B, It is incorrect and may be get descriptions from other question. **/
		// A : Compile error because syntax is wrong
		// System.out.println(x>10?">,':"<":,'=");
		// B : Compile error because syntax is wrong
		// System.out.println(x>10?">"?"<":"=");
		// C : Compiled because syntax is true and logical is equivalent too.
		System.out.println(x>10?">":x<10?"<":"=");
		// D : Compile error because syntax is wrong
		// System.out.println(x>10?">"?,'<"?"=");
	}
}
