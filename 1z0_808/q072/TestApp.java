package com.wealth.certificate.dumps_1z0_808.question072;
//import java.io.Error; //don't have this package, java.io.IOError is exist

public class TestApp {
	public static void main(String[] args) {
		TestApp t = new TestApp();
		try {
			t.doPrint();
			t.doList();
		} catch(Exception e2) {
			System.out.println("Caught " + e2);
			
//			System.out.println("Caught " + e2.toString());
//			System.out.println("Caught " + e2.getMessage());
//			e2.printStackTrace();
		}
	}
	
	public void doList() throws Exception {
		throw new Error("Error");
	}
	
	public void doPrint() throws Exception {
		throw new RuntimeException("Exception");
	}
}

/*
What is the result?

A. Caught java.lang.RuntimeException : Exception
	Exception in thread "main" java.lang.Error: Error
		at TestApp.doList(TestApp.java: 14)
		at TestApp.main(TestApp.java: 6)
B. Exception in thread "main" java.lang.Error: Error
		at TestApp.doList(TestApp.java: 14)
		at TestApp.main(TestApp.java: 6)
C. 	Caught java.lang.RuntimeException: Exception
	Caught java.lang.Error: Error
D.	Caught java.lang.RuntimeException: Exception	

Explanation:
	print e2 will call e2.toString() will show
	• the name of the class of this object 
	• ": " (a colon and a space) 
	• the result of invoking this object's getLocalizedMessage method

*/

//Answer: D