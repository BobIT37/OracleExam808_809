package com.wealth.certificate.dumps_1z0_808.question166;

public class Test166 extends Root {
	
	public static void main(String[] args) {
		Root r = new Test166();
		System.out.println(r.method1()); // line n1  // method1 is private method (hiding information)
		System.out.println(r.method2()); // line n2
	}

}

class Root {
	private static final int MAX = 20000;

	private int method1() {
		int a = 100 + MAX; // line n3
		return a;
	}

	protected int method2() {
		int a = 200 + MAX; // line n4
		return a;
	}
}

//Answer : A. Line n1