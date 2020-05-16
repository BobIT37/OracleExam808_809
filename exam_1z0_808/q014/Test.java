package com.wealth.certificate.exam_1z0_808.question014;

class C2 { }

interface I { }

class C1 extends C2 implements I{ }

public class Test {

	public static void main(String[] args) {
		C2 obj1 = new C1();
		I obj2 = new C1();
		
		C2 obj3 = obj2;
		// ** more code here, which I forgot **
	}

}

// answer compile error
