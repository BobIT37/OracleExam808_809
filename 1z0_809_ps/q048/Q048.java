//similar to 808
package com.wealth.certificate.dumps_1z0_809_ps.question048;

public class Q048 {

	public static void main(String[] args) {
		String [] colors = {"red" , "blue" , "green" , "yellow" , "maroon" , "cyan"};
		//A. 
		for(String c:colors){
			if(c.length() != 4) {
				continue;
			}
			System.out.print(c+", ");
		}

		//B.
/*		for(String c:colors[]){
			if(c.length() <= 4) {
				continue;
			}
			System.out.print(c+", ");
		}*/

		//C. 
/*		for(String c:String[] colors){
			if(c.length() >= 3) {
				continue;
			}
			System.out.print(c+", ");
		}*/

		//D.
/*		for(String c:colors){
			if(c.length() != 4) {
				System.out.print(c+", ");
				continue;
			}
		}*/

	}

}
/*
Which code fragment prints blue, cyan, ?
A. 
for(String c:colors){
	if(c.length() != 4) {
		continue;
	}
	System.out.print(c+", ");
}

B.
for(String c:colors[]){
	if(c.length() <= 4) {
		continue;
	}
	System.out.print(c+", ");
}

C. 
for(String c:String[] colors){
	if(c.length() >= 3) {
		continue;
	}
	System.out.print(c+", ");
}

D.
for(String c:colors){
	if(c.length() != 4) {
		System.out.print(c+", ");
		continue;
	}
}

Answer. A*/