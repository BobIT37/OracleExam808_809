package com.wealth.certificate.exam_1z0_808.question024;

public class Question024 {

	public static void main(String[] args) {
		int x = 1;
		int y = 0;
		
		if (x++ < ++y) {
			System.out.println("Hello");
		} else {
			System.out.println("World");
		}
		System.out.println("Log " + x + " : " + y);
	}
}