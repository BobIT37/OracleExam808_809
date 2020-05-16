package com.wealth.certificate.dumps_1z0_808.question217;

public class SuperTest {
	public static void main(String[] args) {
		// statement1
		// statement2
		// statement3
		/*A. Square square = new Square ("bar");
		square.foo ("bar");
		square.foo();*/
		
		/*B. Square square = new Square ("bar");
		square.foo ("bar");
		square.foo ("bar");*/
		
		/*C. Square square = new Square ();
		square.foo ();
		square.foo(bar);*/
		
		/*D. Square square = new Square ();
		square.foo ();
		square.foo("bar");*/
		
		/*E. Square square = new Square ();
		square.foo ();
		square.foo ();*/
		
		/*F.*/ Square square = new Square();
		square.foo("bar");
		square.foo();
		
		
	}
}

class Shape {
	public Shape() {
		System.out.println("Shape: constructor");
	}

	public void foo() {
		System.out.println("Shape: foo");
	}
}

class Square extends Shape {
	public Square() {
		super();
	}

	public Square(String label) {
		System.out.println("Square: constructor");
	}

	public void foo() {
		super.foo();
	}

	public void foo(String label) {
		System.out.println("Square: foo");
	}
}
