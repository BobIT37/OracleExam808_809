package com.wealth.certificate.dumps_1z0_809.question030;
/*
 * Duplicate 1z0-808 Question 112
 */
public class ScopeTest 
{
	/** Answered : A, B is correct **/
	int j, k; // Field = Instance variable
	
	public static void main(String[] args) 
	{
		new ScopeTest().doStuff(); 
	}
	
	void doStuff() 
	{
		int x = 5; // local variable
		doStuff2();
		System.out.println("x");
	}
	
	void doStuff2() 
	{
		int y = 7; // local variable
		
		System.out.println("y");
		for (int z = 0; z < 5; z++) 
		{
			System.out.println("z");
			System.out.println("y");
		}
	}
}