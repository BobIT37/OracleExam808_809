package com.wealth.certificate.dumps_1z0_809_ps.question086;

public class ForTest {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		
		//A. int i: array --> correct, this is for each syntax
		for ( int i: array ) {
			System.out.print(i +" ");
		}
		System.out.println();
		
		//B. int i = 0; i < 1; i++ --> correct, this is for-loop syntax
		for (int i = 0; i < 1; i++) {	
			System.out.print(i +" ");
		}
		System.out.println();
		
		//C. ;; --> correct, this is infinity loop ;; as same as true
		/*
		for (;;) {	
		}
		*/
		
		// D. ; i < 1; i++ --> wrong, not found variable i
		/*
		for (; i < 1; i++) {
		}
		*/
		// Fix D. --> D will be correct
		/*
		int j=0;
		for (; j < 1; j++) {
		}
		*/
		
		// E. ; i < 1; --> wrong, not found variable i
		/*
		for (; i < 1;) {
		}
		*/
		// Fix E. --> E will be correct but it will be infinity loop cause k is not incremented
		/*
		int k=0;
		for (; k < 1;) {
		}
		*/
	}
}
