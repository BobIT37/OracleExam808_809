package com.wealth.certificate.study_1z0_809.chapter08.functionalinterface3;

public interface D {
   int sum(int a, int b);
   default int subtract(int a, int b) {
       return a - b;
   }
}

/*
	Which of the following statements are true?
	xA. This code compiles successfully
	B. This code doesn't compile
	xC. This is an example of a functional interface
	D. Removing the sum method would make this interface functional
*/