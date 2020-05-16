package com.wealth.certificate.dumps_1z0_808.question160;

public class Q160 {

	public static void main(String[] args) {
		int a = -10;
		int b = 17;
		int c = ++a;
		int d = b--;
		c++;
		d--;
		System.out.println(c + ", " + d); // -8,16
	}
}
