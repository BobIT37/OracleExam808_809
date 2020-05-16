package com.wealth.certificate.dumps_1z0_808.question080;

class MarksOutOfBoundsException extends IndexOutOfBoundsException {
}

public class Question80 {

	void verify(int marks) throws IndexOutOfBoundsException {
		if (marks > 100) {
			throw new MarksOutOfBoundsException();
		}
		if (marks > 50) {
			System.out.print("Pass");
		} else {
			System.out.print("Fail");
		}
	}

	public static void main(String[] args) {
		int marks = Integer.parseInt(args[2]);
		try {
			new Question80().verify(marks);
		} catch (Exception e) {
			System.out.print(e.getClass());

		}

//		int marks = Integer.parseInt(args[2]);
//		try {
//			new Question80().verify(marks);
//		} catch (Exception e) {
//			System.out.print(e.getClass());
//
//		}
		double result = 30 - 12 / (2*5)+1;
		System.out.print("Result = " + result);
	}
}
