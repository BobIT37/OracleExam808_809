package com.wealth.certificate.dumps_1z0_809_ert.question051;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Question051 {

	public static void main(String[] args) {
		Stream<List<String>> strs = Stream.of(
				Arrays.asList("text1", "text2"),
				Arrays.asList("text2", "text3"));
		
		Stream<String> bs2 = strs
				.filter (b -> b.contains("text1"))
				.flatMap (rs -> rs.stream());
		
		bs2.forEach(b -> System.out.print(b));
		// Answer D is correct
		// text1text2
	}
}
