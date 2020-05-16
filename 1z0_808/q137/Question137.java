package com.wealth.certificate.dumps_1z0_808.question137;

public class Question137 {

	public static void main(String[] args) {
		int x = 100;
		int a = x++;
		int b = ++x;
		int c = x++;
		int d = (a < b) ? (a < c) ? a : (b < c) ? b : c;
		
		System.out.println(d);
	}

}
