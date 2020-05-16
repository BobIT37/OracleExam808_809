package com.wealth.certificate.dumps_1z0_809.question050;

import java.util.function.ToIntFunction;

public class Question050 {

	public static void main(String[] args) {
		String str = "Java is a programming language";
		ToIntFunction<String> indexVal = str:: indexOf; //line n1
		int x = indexVal.applyAsInt("Java");//line n2
		System.out.println(x);

		/*Ex.2
		ToIntFunction<String> i  = (e) -> Integer.parseInt(e);
		System.out.println(i.applyAsInt("2"));*/
	}

}
