package com.wealth.certificate.study_1z0_809.chapter11.methodreferences5;

public class Question_11_5 {
   Question_11_5() {
       System.out.println(0);
   }
   public static void main(String[] args) {
       Runnable r = Question_11_5::new;
   }
}

/*
What is the result?
	A. 0
	xB. Nothing is printed
	C. Compilation fails
	D. An exception occurs at runtime
*/