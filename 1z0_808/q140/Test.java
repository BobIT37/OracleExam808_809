package com.wealth.certificate.dumps_1z0_808.question140;

/*public*/ class MyException extends RuntimeException {}

public class Test
{
	public static void main(String[] args) 
	{
		try {
			method1();
		}
		catch (MyException ne) { // Never catch because no error throw from method1()
			System.out.print("A");
		}
		/** Answered : B is correct **/
	}
	
	public static void method1() { // line n1
		try 
		{
			throw Math.random() > 0.5?new MyException() :new RuntimeException(); // PolyMorphism MyException extends RuntimeException
		}
		catch (RuntimeException re) { // Always catch: both MyException and RuntimeException
			System.out.print("B");
		}
	}
}
