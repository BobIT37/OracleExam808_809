package com.wealth.certificate.dumps_1z0_808.question087;

public class Q87 {
	public static void main(String[] args) {
		int[] intArr = {15, 30, 45, 60, 75};
		System.out.println(intArr.length);
		for (int i : intArr) {
			System.out.println(i);
		}
		intArr[2] = intArr[4];
		intArr[4] = 90;
		for (int i : intArr) {
			System.out.println(i);
		}
	}
}
