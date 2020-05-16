package com.wealth.certificate.study_1z0_809.chapter12.stream05;

import java.util.stream.Stream;

public class LazyOperations {

	public static void main(String[] args) {
		
		/*Intermediate operations are deferred until a terminal operation is invoked. The reason is that intermediate operations can usually be merged or optimized by a terminal operation.*/
				
		Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
			.map(str -> str.length())
			.filter(i -> i > 3)
			.limit(2).forEach(System.out::println);
				
		
		/* Here's what it does:
		- It generates a stream of strings,
		- Then convert the stream to a stream of ints (representing the length of each string)
		- Then it filters the lengths greater than three,
		- Then it grabs the first two elements of the string and
		- Finally, prints those two elements.
		*/
				
		System.out.println("----------");
		Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
		    .map(str -> {
		        System.out.println("Mapping: " + str);
		        return str.length();
		    })
		    .filter(i -> {
		        System.out.println("Filtering: " + i);
		        return i > 3;
		    })
		    .limit(2)
		    .forEach(System.out::println);
		
		/*Short-circuit operations cause intermediate operations to be processed until a result can be produced*/
		
		/*
		INTERMEDIATE
		Stream<T> limit(long maxSize)
		*/
		
		/* TERMINAL
		boolean anyMatch(Predicate<? super T> predicate)
		boolean allMatch(Predicate<? super T> predicate)
		boolean noneMatch(Predicate<? super T> predicate)
		Optional<T> findFirst()
		Optional<T> findAny()
		*/
		
	}

}
