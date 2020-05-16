package com.wealth.certificate.dumps_1z0_808.question035;

public class X {
	static int i;
	int j;
	public static void main(String[]args){
		X x1 = new X();
		X x2 = new X();
		x1.i = 3;
		x1.j = 4;
		x1.i = 5;
		x2.j = 6;
		System.out.println(x1.i+" "+x1.j+" "+x2.i+" "+x2.j);
		
	}
	/*Answer: C because i is static*/

}