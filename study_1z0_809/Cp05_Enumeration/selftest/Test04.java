package com.wealth.certificate.study_1z0_809.chapter05.selftest;

enum Level {
	HIGH(100), LOW(10);
	private int value;

	private Level(int value) {
		this.value = value;
		System.out.println(value);
	}
}

public class Test04 {

	public static void main(String[] args) {
		Level l1 = Level.HIGH;
		Level l2 = Level.HIGH;
	}

}
