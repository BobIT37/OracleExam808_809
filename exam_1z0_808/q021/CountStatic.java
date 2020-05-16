package com.wealth.certificate.exam_1z0_808.question021;

public class CountStatic {
	int count;

	public static void displayMsg() {
		count++;
		System.out.println("Welcome .." + count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountStatic.displayMsg();
		CountStatic.displayMsg();
	}
}

/* 
 * A. Compile Error... 
 * B. Compile Error...
 * C. Welcome ... 1
 * 	  Welcome ... 1
 * D. Welcome ... 1
 * 	  Welcome ... 2
 * 
 */
//Answer. compile error because variable is not static cannot invoke in static method.