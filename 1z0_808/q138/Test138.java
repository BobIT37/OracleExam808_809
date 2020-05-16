package com.wealth.certificate.dumps_1z0_808.question138;

public class Test138 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		for (int e = 1; e < 5; e +=2) { // (b)
			System.out.print(a[e]);
		}
//		A. int e = 0; e <= 4; e++ // 12345
//		B. int e = 0; e < 5; e += 2 // 135
//		C. int e = 1; e <= 5; e += 1 // 2345 ArrayIndexOutofBound
//		D. int e = 1; e < 5; e +=2 // 24
	}

}

//Answer : B. int e = 0; e < 5; e + = 2 