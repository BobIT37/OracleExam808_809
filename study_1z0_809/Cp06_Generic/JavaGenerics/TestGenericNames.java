package com.wealth.certificate.study_1z0_809.chapter06.JavaGenerics;

public class TestGenericNames<ty> {
	
	public TestGenericNames() {
	}
	
	public TestGenericNames(ty tp) {
		System.out.println(tp.getClass().toGenericString());
		System.out.println(tp.getClass().toString());
		System.out.println(tp.toString());		
	}
	
	public static void main(String[] args) {
		System.out.println(new TestGenericNames<String>().getClass().toGenericString());
	}
	
}
