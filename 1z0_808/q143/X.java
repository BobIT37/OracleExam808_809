package com.wealth.certificate.dumps_1z0_808.question143;

public class X {
	static int i;
	int j;
	public static void main(String[] args) {
		X x1 = new X();
		X x2 = new X();
		x1.i = 3;
		x1.j = 4;
		System.out.println("x1 : i " + x1.i + " j " + x1.j);
		x2.i = 5;
		x2.j = 6;
		System.out.println("x1 : i " + x1.i + " j " + x1.j);
		System.out.println(
		x1.i + " "+
		x1.j + " "+
		x2.i + " "+
		x2.j);
		//A. 3 4 5 6
		//B. 3 4 3 6
		//C. 5 4 5 6
		//D. 3 6 4 6
	}
}
