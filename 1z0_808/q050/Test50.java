package com.wealth.certificate.dumps_1z0_808.question050;

public class Test50 {
	public static void main(String[] args) { 
	 		int x = 5;
	 		while (isAvailable(x)) {
	 			System.out.print(x);
	 			
	 		}
	 		
	 		//A
//	 		while (isAvailable(x)) {
//	 			System.out.print(--x);
//	 			
//	 		}
	 		
	 		//B
//	 		while (isAvailable(x)) {
//	 			System.out.print(x);
//	 			x--;
//	 		}
	 		
	 		//C
//	 		while (isAvailable(x)) {
//	 			--x;
//	 			System.out.print(x);
//	 		}
	}
	 
	public static boolean isAvailable(int x) { 
	 	return x-- > 0 ? true : false; //D return (x > 0) ? false: true;
	}
	
}
