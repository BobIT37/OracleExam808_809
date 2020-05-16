package com.wealth.certificate.dumps_1z0_808.question031;

public class Question031 implements IQuestion031 {
	private Question031() {
		System.out.println("no para");
	}
	
	private Question031(int para1) {
		System.out.println("int para1");
	}
	
	public static void main(String[] args) {
		new Question031();
		Question031 q = new Question031();
		System.out.println(q.cake());
	}
	
	int cake() {
		int cake=0;
		return (1);
	}
	
	public static void overload1() {	
		
	}
	public static void overload1(int a) {	
		
	}
	public static void iq3(int a) {
		Question031 q = new Question031();
		System.out.println(q.cake());
	}
}

interface IQuestion031 {
	public static void overload1() {
		
	}
	public static void overload1(int a) {
		
	}
	public default   void iq3r4(int a) {
		
	}
}
