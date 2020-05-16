package com.wealth.certificate.dumps_1z0_808.question097;

public class Natural {

	private int i;
	
	void disp() {
		
		while (i <= 5) { // this is private variable i as global scope
			for (int i=1; i <= 5;) { // this is local variable scope in for loop
				System.out.print(i + " ");
				i++;
			}
			i++;
		}
	
	}
	
	public static void main(String[] args) {
		new Natural().disp();
	}
	
}