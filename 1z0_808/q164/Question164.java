package com.wealth.certificate.dumps_1z0_808.question164;

public class Question164 {

	int num;

	public static void graceMarks(Question164 obj4) {
		obj4.num += 10;
	}

	public static void main(String[] args) {
		Question164 obj1 = new Question164();
		Question164 obj4 = new Question164();

		Question164 obj2 = obj1;
		Question164 obj3 = null;
		obj2.num = 60;
		graceMarks(obj2);
	}
}
