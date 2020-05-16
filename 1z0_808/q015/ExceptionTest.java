package com.wealth.certificate.dumps_1z0_808.question015;
class SpecialException extends Exception {
	public SpecialException(String message) {
		super(message);
		System.out.println(message);
	}
}
public class ExceptionTest {
	public static void main(String[] args) {
		try {
			doSomething();
		}catch(SpecialException e) {
			System.out.println(e);
		}
	}	
	static void doSomething() throws SpecialException {
		int[] ages = new int[4];
		ages[4] = 17;
		doSomethingElse();
	}
	static void doSomethingElse() throws SpecialException {
		throw new SpecialException("Throw at end of doSomething() method");
	}
}
