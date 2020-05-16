package com.wealth.certificate.dumps_1z0_808.question194;

public class Test194 {
	int num;

	public static void graceMarks(Test194 obj4) {
		obj4.num += 10;
	}

	public static void main(String[] args) {
		Test194 obj1 = new Test194();
		Test194 obj2 = obj1;
		Test194 obj3 = null;

		obj2.num = 60;
		graceMarks(obj2);
	}

}


//Answer : A. 1 
// 1 instances are created in memory at runtime -> Point:: The new Keyword