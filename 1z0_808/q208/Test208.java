package com.wealth.certificate.dumps_1z0_808.question208;

abstract class A1 {
	public abstract void m1();

	public void m2() {
		System.out.println("Green");
	}
}

abstract class A2 extends A1 {
	public abstract void m3();

	public void m1() {
		System.out.println("Cyan");
	}

	public void m2() {
		System.out.println("Blue");
	}
}

public class Test208 extends A2 {
	public void m1() {
		System.out.println("Yellow");
	}

	public void m2() {
		System.out.println("Pink");
	}

	public void m3() {
		System.out.println("Red");
	}

	public static void main(String[] args) {
		A2 tp = new Test208();
		tp.m1();
		tp.m2();
		tp.m3();
	}
}

//Answer : A. Yellow 
//			Pink
//			Red