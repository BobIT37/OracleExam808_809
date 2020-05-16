package com.wealth.certificate.study_1z0_809.chapter12.stream01;

import java.time.Duration;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WhatAreStreams {

	public static void main(String[] args) {

		/*
		 * What are streams?
		 */
		
		
		/*
		 * First, streams are NOT collections. A simple definition is that streams are
		 * WRAPPERS for collections and arrays, They wrap an EXISTING collection (or
		 * another data source) to support operations expressed with LAMBDAS
		 */
		// 1. Streams work perfectly with lambdas.
		Stream.of(1, 2, 3).filter(e -> e > 2).forEach(System.out::println); // print 3

		
		/*
		 * 2. Streams don't store its elements. The elements are stored in a collection
		 * or generated on the fly. They are only carried from the source through a
		 * pipeline of operations.
		 */

		/*
		 * 3. Streams are immutable. Streams don't mutate their underlying source of
		 * elements.
		 */

		/*
		 * 4. Streams are not reusable. Streams can be traversed only once. A stream
		 * should be operated on (invoking an intermediate or terminal stream operation)
		 * only once. A stream implementation may throw IllegalStateException if it
		 * detects that the stream is being reused.
		 */
		Stream<String> stream = Stream.of("A", "A", "I", "O", "O");
		Stream<String> distict = stream.distinct();
		// long count = stream.count(); // java.lang.IllegalStateException: stream has already been operated upon or closed

		/*
		 * 5. Streams don't support indexed access to their elements. streams are not
		 * collections or arrays. The most you can do is get their first element.
		 */

		
		// 6. Streams are easily parallelizable.
		IntStream s1 = IntStream.range(0,100_000_000);
		IntStream s2 = IntStream.range(0,100_000_000);
		
		LocalTime start = LocalTime.now();
		s1.sequential().filter( p-> p%2 == 0 ).forEach(e->{});		
		LocalTime finish = LocalTime.now();
		System.out.println("Sequential using time : "+Duration.between(start, finish).toMillis()+" ms");
		
		start = LocalTime.now();
		s2.parallel().filter( p-> p%2 == 0 ).forEach(e->{});
		finish = LocalTime.now();
		System.out.println("Parallel using time : "+Duration.between(start, finish).toMillis()+" ms");
		
		
		/*
		 * 7. Stream operations are lazy when possible. An important feature of
		 * intermediate operations is that they don't process the elements until a
		 * terminal operation is invoked, in other words, they're lazy.
		 */		
		start = LocalTime.now();
		Stream.of(1, 2, 3).filter(e -> {
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			return true;
		});
		finish = LocalTime.now();
		System.out.println("Lazy using time : "+Duration.between(start, finish).toNanos()+ " ns");
		
		start = LocalTime.now();
		Stream.of(1, 2, 3).filter(e -> {
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			return true;
		}).count();
		finish = LocalTime.now();
		System.out.println("Lazy using time : "+Duration.between(start, finish).toNanos()+" ns");
	}

}
