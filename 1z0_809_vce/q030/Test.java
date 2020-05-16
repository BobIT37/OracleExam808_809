package com.wealth.certificate.dumps_1z0_809_vce.question030;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("my", "pen", "is", "your", "pen");
		Predicate<String> test = s->{
			int i = 0;
			boolean result = s.contains("pen");
			System.out.print(i++ +":");
			return result;
		};
		
		// round 1 -> 0:, false
		// round 2 -> 0:0:, true
		
		str.stream().filter(test).findFirst().ifPresent(System.out ::print);
		
	}

}
/*
What is the result?
A. 0 : 0 : pen
B. 0 : 1 : pen
C. 0 : 0 : 0 : 0 : 0 : pen
D. 0 : 1 : 2 : 3 : 4 :
E. A compilation error occurs.

Answer: A

*/
