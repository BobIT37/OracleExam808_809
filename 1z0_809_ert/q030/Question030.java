package com.wealth.certificate.dumps_1z0_809_ert.question030;

import java.util.Arrays;
import java.util.List;

public class Question030 {
	public static void main(String[] args) {
		List<Integer> prices = Arrays.asList(3, 4, 5);
		prices.stream().filter(e -> e > 4)
				.peek(e -> System.out.print("Price " + e)) // line n1
				.map(n -> n - 1) // line n2
				//.peek(n -> System.out.println(" New Price " + n)); // line n3
				.forEach(n -> System.out.println(" New Price " +n));
	}
}