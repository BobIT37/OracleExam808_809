package com.wealth.certificate.dumps_1z0_808.question020;

class C extends B{
	public C() { // line n2
		System.out.print("C ");
	}

	public static void main(String[] args) {
		C c = new C();
	}
}

class A {
	public A() {
		System.out.print("A ");
	}
}

class B extends A {
	public B() { // line n1
		System.out.print("B ");
	}
}