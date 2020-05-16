package com.wealth.certificate.dumps_1z0_809_ert.question032;

import java.util.stream.Stream;

public class question032 {
	public static void main(String [] args){
		Stream.of("Java", "Unix", "Linux")
		.filter(s -> s.contains("n"))
		.peek(s -> System.out.println("PEEK: " + s));
		// line n1
		}
}

//A) .findAny(); terminal operation
//B) .findFirst(); terminal operation
//C) .allMatch(); รับ predicate
//D) .anyMatch(); รับ predicate
//E) .noneMatch(); รับ predicate
