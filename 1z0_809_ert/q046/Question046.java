package com.wealth.certificate.dumps_1z0_809_ert.question046;

public class Question046 {
	/*Which two interfaces can you use to create lambda expressions? 
	A) T
	B) Q
	C) P
	D) R 
	E) S
	F) U*/
	public static void main(String[] args) {
		//A.
		//T t = () -> System.out.println("Hello");
		
		//B.
		Q q = () -> System.out.println("Hello");
		
		//C.
		P p = () -> System.out.println("Hello");
		
		//D.
		//R r = () -> System.out.println("Hello");
		
		//E.
		//S s = () -> System.out.println("Hello");
		
		//F.
		//U u = () -> System.out.println("Hello");
		
	}
}

//@FunctionalInterface
interface P { public void method1(); }
//@FunctionalInterface
interface Q extends P { public void method1() ; }
//@FunctionalInterface
interface R extends P {public void method2(); }
//@FunctionalInterface
interface S { public default void method(){ }}
//@FunctionalInterface
interface T { public void method1(); public void method2();}
//@FunctionalInterface
interface U {public void method1(); public abstract void method2();}