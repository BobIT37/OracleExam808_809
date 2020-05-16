package com.wealth.certificate.dumps_1z0_809_vce.question038;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Parallel {
	public static void main(String[] args) {
		// Sequential Stream
		Stream.of("a", "b", "c", "d", "e").forEach(System.out::print);
		System.out.println(" - Sequential");

		
		// Parallel stream
		// To create a parallel stream from another stream, use the parallel() method.
		Stream.of("a", "b", "c", "d", "e").parallel().forEach(System.out::print);
		System.out.println(" - parallel forEach");

		
		Stream.of("a", "b", "c", "d", "e").parallel().forEachOrdered(System.out::print);
		System.out.println(" - parallel forEachOrdered");

		
		// Parallel stream
		// To create a parallel stream from a Collection use the parallelStream() method.
		List<String> list = Arrays.asList("a", "b", "c", "d", "e");
		list.parallelStream().forEach(System.out::print);
		System.out.println(" - parallelStream forEach");

		
		System.out.println("isParallel() - " + list.parallelStream().isParallel());
		
		list.parallelStream().sequential().forEach(System.out::print);
		System.out.println(" - parallelStream to sequential");

		// -------------------------------------------------------
		double start = System.nanoTime();
		String first = Stream.of("a", "b", "c", "d", "e").parallel().findFirst().get();
		double duration = (System.nanoTime() - start) / 1000000;
		System.out.println("Parallel - " + first + " found in " + duration + " milliseconds");

		start = System.nanoTime();
		first = Stream.of("a", "b", "c", "d", "e").findFirst().get();
		duration = (System.nanoTime() - start) / 1000000;
		System.out.println("Sequential - " + first + " found in " + duration + " milliseconds");

	}
}
