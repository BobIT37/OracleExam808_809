package com.wealth.certificate.dumps_1z0_809.question119;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Test {

	public static void main(String[] args) {
		List<String> codes = Arrays.asList("DOC","MPEG", "JPEG");
		codes.forEach(c->System.out.print(c+" "));
		
		//BinaryOperator<String> operator1 = (a, b) -> a + b;
		
		String fmt = codes.stream()
				.filter(s->s.contains("PEG"))
				.reduce((s, t)->s+t).get(); // MPEG+JPEG
		System.out.println("\n" +fmt);
	}

}
