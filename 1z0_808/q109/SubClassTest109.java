package com.wealth.certificate.dumps_1z0_808.question109;

public class SubClassTest109 extends Test109 {

	public static void main(String[] args) {
		new SubClassTest109().displayS();
	}
	
	void displayS() {
		System.out.println("Before - Sub-class Value : "+this.value);
		
		this.value = 50;
		
		System.out.println("After - Sub-class Value : "+this.value);
	}

}