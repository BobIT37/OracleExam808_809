package com.wealth.certificate.study_1z0_809.chapter08.functionalinterface2;

@FunctionalInterface interface C {
   int m(int i);
   long m(long i);
}

/*
	Which of the following statements are true?
	A. This code compiles successfully
	xB. If we remove the annotation, this code will compile
	xC. If we remove one method, this code will compile
	D. The @FunctionalInterface annotation makes this interface functional
*/