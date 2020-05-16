package com.wealth.certificate.dumps_1z0_809_ert.question072;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Question072 {

	public static void main(String[] args) {
		List<String> qwords = Arrays.asList("why ", "what ", "when ");
		BinaryOperator<String> operator = (s1, s2) -> s1.concat(s2); //line n1
		String sen = qwords.stream()
				.reduce("Word: ", operator);
		System.out.println(sen);
	}

}
