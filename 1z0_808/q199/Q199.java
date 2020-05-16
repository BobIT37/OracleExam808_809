package com.wealth.certificate.dumps_1z0_808.question199;

public class Q199 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder ( ) ;
		sb.append("World");
		
		//A.	Hello World
		sb.insert(0,"Hello ");	
		//But sb.insert(6,"Hello "); //Exception java.lang.StringIndexOutOfBoundsException: String index out of range: 6
		
		//B. 	Error arguments
		//sb.append(0,"Hello ");
		
		//C. 	StringBuilder no add method
		//sb.add(0,"Hello ");
		
		//D. 	StringBuilder no set method
		//sb.set(0,"Hello ");
		
		System.out.println(sb);
	}
}
