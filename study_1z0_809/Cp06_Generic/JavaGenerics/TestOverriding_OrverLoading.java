package com.wealth.certificate.study_1z0_809.chapter06.JavaGenerics;

class Score<T> {
	boolean isPass;
	public boolean checkScore(T s) { return true; }
	public boolean checkRanking(T s) { return true; }
}

class JavaCer1Z0_809 extends Score<Integer> {	
	// Test override
	public boolean checkScore(Integer s) { 
		return  (s > 65) ? true : false;
	}
//	public boolean checkScore(Number s) { return true; }
	
	// Test overload
	public boolean checkRanking(Integer s1) { return true; }
	public boolean checkRanking(String s1) { return true; }
	public boolean checkRanking(Integer s1, Integer s2) { return true; }
/*	public boolean checkRanking(Number s1) { return true; }
	public boolean checkRanking(Number s1, Number s2) { return true; }*/
	
}

public class TestOverriding_OrverLoading {
	public static void main(String[] args) {
		new JavaCer1Z0_809().checkScore(5);
	}	
}


