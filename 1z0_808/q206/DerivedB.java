package com.wealth.certificate.dumps_1z0_808.question206;

public class Question206 extends DerivedA {
	public void test() {
		System.out.println("DerivedB ");
	}
	public static void main(String[] args) {
		Base bl = new Question206();
		Base b2 = new DerivedA();
		Base b3 = new Question206();
		bl = (Base) b3;
		Base b4 = (DerivedA) b3;
		bl.test();
		b4.test();
	}

}

class Base {
	public void test() {
		System.out.println("Base ");
	}
}

class DerivedA extends Base {
	public void test() {
		System.out.println("DerivedA ");
	}
}
