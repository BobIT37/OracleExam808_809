package com.wealth.certificate.dumps_1z0_809_ert.question029;

interface Interface1 {
	public default void sayHi() {
		System.out.println("Hi Interface-1");
	}
}
interface Interface2 {
	public default void sayHi() {
		System.out.println("Hi Interface-2") ;
	}
}
public class MyClass implements Interface1, Interface2 {
	public static void main(String [] args) {
		Interface1 obj = new MyClass();
		obj.sayHi() ;
	}
	public void sayHi() {
		System.out.println("Hi MyClass") ;
	}
}
