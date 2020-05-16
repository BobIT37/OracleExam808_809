package com.wealth.certificate.dumps_1z0_808.question026;

public class Test26 {
	private char var;

	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';

		Test26 obj1 = new Test26();
		Test26 obj2 = obj1;
		obj1.var = 'i';
		obj2.var = 'o';

		System.out.println(var1 + "," + var2);
		System.out.println(obj1.var + "," + obj2.var);
	}

}
//Answer : B. a, e 
//			  o, o