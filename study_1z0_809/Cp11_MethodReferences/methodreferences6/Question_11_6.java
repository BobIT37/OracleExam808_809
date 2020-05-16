package com.wealth.certificate.study_1z0_809.chapter11.methodreferences6;

import java.util.function.BiFunction;

class Test {
   Test() {
       System.out.println(0);
   }
   Test(String s) {
       System.out.println(1);
   }
}
public class Question_11_6 {
   public static void main(String[] args) {
       BiFunction<String, String, Test> f = Test::new; // (String s1, String s2) -> new Test(s1, s2);
       f.apply(null, null);
   }
}

/*
What is the result?
	A. 0
	B. 1
	C. Nothing is printed
	xD. Compilation fails
	E. An exception occurs at runtime
*/