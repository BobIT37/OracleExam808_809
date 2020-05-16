package com.wealth.certificate.dumps_1z0_809_ps.question021;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		List<String> str = Arrays.asList ("my", "pen", "is", "your", "pen");
				Predicate<String> test = s -> {
				int i = 0;
				boolean result = s.contains ("pen");
				System.out.print(i++) + ":");
				//System.out.print(i++ + ":");
				return result;
				};
				str.stream()
				.filter(test)
				.findFirst()
				.ifPresent(System.out ::print);

	}

}
