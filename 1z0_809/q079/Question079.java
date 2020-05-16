package com.wealth.certificate.dumps_1z0_809.question079;

public class Question079 {

	public static void main(String[] args) {
		
		// A. Moveable can be used as below:
		Moveable<Integer> animalA = n -> System.out.println("Running" + n);
		animalA.run(100);
		animalA.walk(20);

		// B. Moveable can be used as below:
		/*Moveable<Integer> animalB = n -> n + 10;
		animalB.run(100);
		animalB.walk(20);*/

		// C. Moveable can be used as below:
		/*Moveable animalC = (Integer n) -> System.out.println(n);
		animalC.run(100);
		Moveable.walk(20);*/

		// D. Movable cannot be used in a lambda expression.

	}

}
