package com.wealth.certificate.dumps_1z0_808.question016;

public class App {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = new String("java");
		//line n1
//		A.	
//		String str3 = str2;
//		if (str1 == str3)
//		B.	
		if(str1.equalsIgnoreCase(str2))
//			
//		C.	
//		String str3 = str2;
//		if (str1.equals(str3))
//			
//		D.	
//		if (str1.toLowerCase() == str2.toLowerCase())
		{
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}

/*
16. Which code fragment, when inserted at line n1, enables the App class to print Equal?
A.	String str3 = str2;				//str3 reference to str2 object
	if (str1 == str3)				//str1 (from String Pool) not equal str3
	
B.	if(str1.equalsIgnoreCase(str2))	//this one is true

C.	String str3 = str2;				//str3 reference to str2 object
	if (str1.equals(str3))			//"java" not equal "Java", it's case-sensitive
	
D.	if (str1.toLowerCase() == str2.toLowerCase())	//it's compare address, so it's not equal
*/

//Answer: B