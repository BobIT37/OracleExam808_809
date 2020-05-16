package com.wealth.certificate.dumps_1z0_809.question085;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		List<String> nL = Arrays.asList("Jim", "John", "Jeff");

		Function<String, String> funVal = s -> "Hello : ".concat(s);

		nL.stream().map(funVal).peek(System.out::print);
		
		// nL.stream().map(funVal).peek((p)->{System.out.println("Peek : "+p);}).collect(Collectors.toList());
		// nL.stream().map(funVal).peek((p)->{System.out.println("Peek : "+p);}).forEach( (p)->System.out.println(p));
		
	}

}
