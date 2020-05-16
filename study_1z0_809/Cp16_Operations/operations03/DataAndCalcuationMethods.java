package com.wealth.certificate.study_1z0_809.chapter16.operations03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;

public class DataAndCalcuationMethods {
	public static void main(String[] args) {
		/* ------ Data and Calculation Methods ------ */
		/*
		 * The Stream interface provides the following data and calculation methods:
		 * 1. long count() 
		 * 		: returns the number of elements in the stream or zero if the stream is empty.
		 * 2. Optional<T> max(Comparator<? super T> comparator) 
		 * 		: returns the maximum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 * 3. Optional<T> min(Comparator<? super T> comparator)
		 * 		: returns the minimum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 */
		
		
		/* 1. long count() */
		Stream<Integer> countStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		long count = countStream.count(); // 10
		System.out.println("countStream : " + count);

		Stream<String> countEmptyStream = Stream.empty();
		count = countEmptyStream.count(); // 0
		System.out.println("countEmptyStream : " + count);
		
		
		/* 2. Optional<T> max(Comparator<? super T> comparator) */
		List<String> maxList = Arrays.asList("Stream","Operations","on","Collections");
		Optional<String> max = maxList.stream()
			.max(Comparator.comparing(s -> s.length())); // Collections
		System.out.println("maxList : " + max);
		
		List<String> maxEmptyList = Arrays.asList();
		max = maxEmptyList.stream()
				.min(Comparator.comparing(s -> s.length())); // Optional.empty
		System.out.println("maxEmptyList : " + max);
		
		
		/* 3. Optional<T> min(Comparator<? super T> comparator) */
		Stream<String> minStream = Stream.of("Stream","Operations","on","Collections");
		System.out.print("minStream : ");
		minStream.min(Comparator.comparing(s -> s.length())) // on
			.ifPresent(System.out::println);
		
		Stream<String> minEmptyStream = Stream.of();
		System.out.print("minEmptyStream : ");
		minEmptyStream.min(Comparator.comparing(s -> s.length())) // ""
			.ifPresent(System.out::println);

		/* ------ IntStream ------ */
		/* 
		 * 1. OptionalDouble average()
		 * 		: returns the average of the elements in the stream wrapped in an OptionalDouble or an empty one if the stream is empty.
		 * 2. long count()
		 * 		: returns the number of elements in the stream or zero if the stream is empty.
		 * 3. OptionalInt max()
		 * 		: returns the maximum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 * 4. OptionalInt min()
		 * 		: returns the minimum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 * 5. int sum()
		 * 		: returns the sum of the elements in the stream or zero if the stream is empty.
		 */

		/* ------ LongStream ------ */
		/*
		 * 1. OptionalDouble average()
		 * 		: returns the average of the elements in the stream wrapped in an OptionalDouble or an empty one if the stream is empty.
		 * 2. long count()
		 * 		: returns the number of elements in the stream or zero if the stream is empty.
		 * 3. OptionalLong max()
		 * 		: returns the maximum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 * 4. OptionalLong min()
		 * 		: returns the minimum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 * 5. long sum()
		 * 		: returns the sum of the elements in the stream or zero if the stream is empty.
		 */

		/* ------ DoubleStream ------ */
		/*
		 * 1. OptionalDouble average()
		 * 		: returns the average of the elements in the stream wrapped in an OptionalDouble or an empty one if the stream is empty.
		 * 2. long count()
		 * 		: returns the number of elements in the stream or zero if the stream is empty.
		 * 3. OptionalDobule max()
		 * 		: returns the maximum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 * 4. OptionalDobule min()
		 * 		: returns the minimum value in the stream wrapped in an Optional or an empty one if the stream is empty.
		 * 5. double sum()
		 * 		: returns the sum of the elements in the stream or zero if the stream is empty.
		 */

	}

}