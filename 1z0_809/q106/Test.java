package com.wealth.certificate.dumps_1z0_809.question106;

public class Test {
	int sum = 0;
	public void doCheck(int number){
		if (number % 2 == 0) {
			break; // break use for loop , switch-case
		}else{
			for (int i = 0; i < number; i++) {
				sum += i;
			}
		}
	}
	public static void main(String[] args) {
		Test obj = new Test();
		System.out.println("Red "+obj.sum);
		obj.doCheck(2);
		System.out.println("Orange "+obj.sum);
		obj.doCheck(3);
		System.out.println("Green "+obj.sum);
	}
}
