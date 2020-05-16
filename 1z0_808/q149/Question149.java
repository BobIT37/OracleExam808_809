package com.wealth.certificate.dumps_1z0_808.question149;

public class Question149 {

	public static void main(String[] args) {
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);
	}

}
