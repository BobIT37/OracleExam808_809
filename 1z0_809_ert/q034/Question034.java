package com.wealth.certificate.dumps_1z0_809_ert.question034;

// A
class ProductCode1<T, S> {
	T c1;
	S c2;
}

// B
/*class ProductCode2<T, S<Integer>> {
	T c1;
	S c2;
}*/

// C
class ProductCode3<T, S extends T> {
	T c1;
	S c2;
}

// D
/*class ProductCode4<T, S super T>{
	T c1;
	S c2;
}*/

public class Question034 {

	public static void main(String[] args) {
		// A
		ProductCode1<Number, Integer> c1_1 = new ProductCode1<Number, Integer>(); /* c1 instantiation */
		ProductCode1<Number, String> c1_2 = new ProductCode1<Number, String>(); /* c2 instantiation */

		// C
		ProductCode3<Number, Integer> c3_1 = new ProductCode3<Number, Integer>(); /* c1 instantiation */
		ProductCode3<Number, String> c3_2 = new ProductCode3<Number, String>(); /* c2 instantiation */
	}

}
