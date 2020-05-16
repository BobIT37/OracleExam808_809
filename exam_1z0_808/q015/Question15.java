package com.wealth.certificate.exam_1z0_808.question015;

public class Question15 {
	public int numA;

	public void A(int a) {
		a = a * a;
	}

	public void B(StringBuilder s) {
		s.append(" " + s);
	}

	public void C(int numA) {
		numA = numA * numA;
	}

	public static void main(String[] args) {
		Question15 obj = new Question15();
		int i = 10;
		StringBuilder sb = new StringBuilder("Hello");
		obj.numA = 2;

		obj.A(i);
		obj.B(sb);
		obj.C(obj.numA);
		System.out.println(i + " " + sb + " " + obj.numA);
	}
}
