package com.wealth.certificate.study_1z0_809.chapter09.selftest.Lambda_selftest04;

public class LambdaTest04 {

	public static void main(String[] args) {
		//A a = () -> 7 * 12.0;
		B b = () -> 7 * 12.0;
		//C c = () -> 7 * 12.0;
		//D d = () -> 7 * 12.0;
	}

}

//A. 
interface A {
     default double m() {
         return 4.5;
     }
}

//B.
interface B {
     Number m();
}

//C.
interface C {
     int m();
}

//D.
interface D {
     double m(Integer... i);
}