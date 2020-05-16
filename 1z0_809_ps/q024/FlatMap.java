package com.wealth.certificate.dumps_1z0_809_ps.question024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

	/*
	 * flatMap() The flatMap() method takes each element in the stream and makes
	 * any elements it contains top-level elements in a single stream. This is
	 * helpful when you want to remove empty elements from a stream or you want
	 * to combine a stream of lists. We are showing you the method signature for
	 * consistency with the other methods, just so you don’t think we are hiding
	 * anything.
	 */

	public static void main(String[] args) {
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Bonobo");
		List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zero, one, two);
		animals.flatMap(l -> l.stream()).forEach(System.out::println);

	}

}
