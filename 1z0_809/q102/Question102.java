package com.wealth.certificate.dumps_1z0_809.question102;

import java.io.IOException;

public class Question102 {
	 static void doStuff() throws ArithmeticException, NumberFormatException, Exception {
		 if (Math.random() >-1) throw new IOException("IO Exception");//throw new Exception ("Try again"); // double greater than or equal to 0.0 and less than 1.0
	 }

	 public static void main(String[] args) {
		 try {
			 doStuff();
		} catch (ArithmeticException | IOException e) { // The exception ArithmeticException, NumberFormatException is already caught by the alternative Exception
			System.out.println (e.getMessage()); 
		}
		catch (Exception e) {
			 System.out.println (e.getMessage()); 
		}
		}
	}

//In code, all exceptions are subtypes of java.lang.Exception, hence the error
	 

