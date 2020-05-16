package com.wealth.certificate.dumps_1z0_808.question055;

public class Questions55 {
	
	public static void main(String[] args) {
		
		int[] intArr = {8,16,32,64,128};
		
		// A --> wrong, it will throws ArrayIndexOutOfBoundsException 
		/*for (int i : intArr) {
			System.out.println(intArr[i] +" ");
		}*/
		
		// B --> correct cause print 8 16 32 64 128 
		for (int i : intArr) {
			System.out.print(i +" ");
		}
		System.out.println();
		// C --> wrong cause syntax error cannot initialize in for each
		/*for (int i=0 : intArr) {
			System.out.println(intArr[i] + " ");
		}*/
		
		// D --> wrong cause incorrect printing 0 1 2 3 4
		/*for (int i=0; i < intArr.length; i++) {
			System.out.print(i +" ");
		}*/
		
		// E --> correct cause print 8 16 32 64 128
		for (int i=0; i < intArr.length; i++) {
			System.out.print(intArr[i] +" ");
		}
		System.out.println();
		
		// F --> wrong cause syntax error --> the local variable i may not have been initialized
		/*for (int i; i < intArr.length; i++) {
			System.out.println(intArr[i] +" ");
		}*/
	}
	
}
