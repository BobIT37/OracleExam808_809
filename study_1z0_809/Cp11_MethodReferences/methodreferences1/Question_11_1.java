package com.wealth.certificate.study_1z0_809.chapter11.methodreferences1;

public class Question_11_1 {
   public static Runnable print() {
       return () -> {
           System.out.println("Hi");
       };
   }
   public static void main(String[] args) {
       Runnable r = Question_11_1::print;
       r.run();
   }
}

/*
	What is the result?
	A. Hi
	xB. Nothing is printed
	C. Compilation fails
	D. An exception occurs at runtime
*/