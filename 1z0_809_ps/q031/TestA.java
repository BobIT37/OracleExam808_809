package com.wealth.certificate.dumps_1z0_809_ps.question031;

public class TestA extends Root {
	public static void main(String[] args) {
		Root r = new TestA();
		System.out.println(r.method1());	//line	n1
		System.out.println(r.method2());	//line 	n2
	}
}
class Root {
	private static final int MAX = 20000;
	private int method1() {
		int a = 100 + MAX;					//line 	n3
		return a;
	}
	protected int method2() {
		int a = 200 + MAX;					//line	n4
		return a;
	}
}