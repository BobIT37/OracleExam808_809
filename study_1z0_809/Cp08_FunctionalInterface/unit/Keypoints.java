package com.wealth.certificate.study_1z0_809.chapter08.unit;

import java.util.List;

/**
 * 
 * Key Points
 * 
 * - A functional interface is any interface that has exactly one abstract method.
 * - Since default methods have an implementation, they are not abstract so a functional interface can have any number of them.
 * - If an interface declares an abstract method with the signature of one of the methods of java.lang.Object, it doesn't count toward the functional interface method count.
 * - A functional interface is valid when it inherits a method that is equivalent but not identical to another.
 * - An empty interface is not considered a functional interface.
 * - A functional interface is valid even if the @FunctionalInterface annotation would be omitted.
 * - Functional interfaces are the basis of lambda expressions.
 *
 */

/** [Conclusion] -------------------------------------------------------------------------------------- **/
@FunctionalInterface
interface Functional {
	default void description() {
		
	}
	default void optional(int choice) {
		
	}
	
	boolean equals(Object o);
	int hashCode();
	String toString();
   
	void method(List<Double> l);
	   
	// abstract void method();
   
	static void method2(){
   	
	};
}

/*
interface IdenticalFunctional {
	void method(List l);
}
*/

@FunctionalInterface
interface IdenticalFunctional {
	void method(List l);
}

@FunctionalInterface
interface MainFunctional extends Functional, IdenticalFunctional {}

@FunctionalInterface
interface EmptyInterface {
	
}

@FunctionalInterface
interface LambdaFunction {
	void call();
}

class BasisLambda {
	public static void workWithAnonymous(LambdaFunction lambdaFunction){
		lambdaFunction.call();
	}
	
	public static void main(String[] args) {
	// Anonymous Inner Class : JDK 1.1+
		workWithAnonymous(new LambdaFunction(){
			@Override
			public void call()
			{
				System.out.println("I am Anonymous Inner Class Function");
			}
		});
		
	// Lambda Expression : JDK 8+
		LambdaFunction lambdaFunction = () -> System.out.println("I am Lambda Function");
		lambdaFunction.call();
	}
}
