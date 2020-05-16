package com.wealth.certificate.dumps_1z0_809_vce.question048;

public interface Moveable<Integer> {
	public default void walk(Integer distance) {
		System.out.println("Walking");
	}

	public void run(Integer distance);
}

class Test implements Moveable<Integer> {
	public static void main(String[] arg) {
		
		//A
		/*Moveable<Integer> animal = n -> System.out.println("Running" + n);
		animal.run(100);
		animal.walk(20);*/
		
		//B
		/*Moveable<Integer> animal = n -> n + 10;
		animal.run(100);
		animal.walk(20);*/
		
		//C incorrect
		/*Moveable animal = (Integer n) -> System.out.println(n);
		animal.run(100);
		Moveable.walk(20);*/
		
		//D  Movable cannot be used in a lambda expression.
		
	}

	@Override
	public void run(java.lang.Integer distance) {
		// TODO Auto-generated method stub
		
	}
}
/*
Which statement is true?
A. Moveable can be used as below:
	Moveable<Integer> animal = n - > System.out.println(“Running” + n);
	animal.run(100);
	animal.walk(20);
B. Moveable can be used as below:
	Moveable<Integer> animal = n - > n + 10;
	animal.run(100);
	animal.walk(20);
C. Moveable can be used as below:
	Moveable animal = (Integer n) - > System.out.println(n);
	animal.run(100);
	Moveable.walk(20);
D. Movable cannot be used in a lambda expression.

Answer: A

Option A, correct.
Option B, run method can not have a return value.
Option C , the walk method can not call in such a way.
Option D, the Moveable interface can be implemented using the Lambda expression.
*/