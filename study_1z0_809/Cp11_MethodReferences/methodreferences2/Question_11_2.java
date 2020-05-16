package com.wealth.certificate.study_1z0_809.chapter11.methodreferences2;

import java.util.function.Consumer;

public class Question_11_2 {
   void print() {
       System.out.println("Hi");
   }
   public static void main(String[] args) {
       Consumer<Question_11_2> c =
                   Question_11_2::print;
       c.accept(new Question_11_2());
   }
}

/*
	What is the result?
	xA. Hi
	B. Nothing is printed
	C. Compilation fails
	D. An exception occurs at runtime
*/