package com.wealth.certificate.study_1z0_809.chapter01.immutable;

import java.util.Arrays;

public class Immutable {
	public static void main(String[] args) {
		Test test = new Test();
		
		modify(test.getCopyValue());
		System.out.println(test.getValue());
		
		modify(test.getValue());
		System.out.println(test.getValue());
		
	}
	
	private static void modify(char value[]) {
		value[0] = 'z';
	}
}

class Test {
	private char value[] = {'a','b','c'};
	
	public char[] getValue() {
		return value;
	}
	
	public char[] getCopyValue() {
		return Arrays.copyOf(value, value.length);
	}
	
}
