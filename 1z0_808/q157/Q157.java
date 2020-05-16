package com.wealth.certificate.dumps_1z0_808.question157;

public class Q157 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Duke");
		String str1 = sb1.toString();
		// insert code here
		//A. true
		//String str2 = str1;
		//B. false
		//String str2 = new String (str1);
		//C. false
		//String str2 = sb1.toString ();
		//D. false
		String str2 = "Duke";
		
		System.out.print(str1 == str2);
	}
}
