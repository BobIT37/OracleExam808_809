package com.wealth.certificate.study_1z0_809.chapter16.operations03;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.*;

public class IntStreamTest {

	public static void main(String[] args) {
		
		/* ------ IntStream ------ */
		/*
		 * 1. OptionalDouble average()
		 * 2. long count()
		 * 3. OptionalInt max()
		 * 4. OptionalInt min()
		 * 5. int sum()
		 */
		
		
		/* 1. OptionalDouble average() */
		IntStream averageIntStream = IntStream.rangeClosed(1, 10);
		OptionalDouble average = averageIntStream.average();
		System.out.println("averageIntStream : " + average);
		
		
		/* 2. long count() */
		IntStream countIntStream = IntStream.rangeClosed(1, 10);
		long count = countIntStream.count(); // 10
		System.out.println("countIntStream : " + count);
		
		IntStream countEmptyIntStream = IntStream.empty();
		count = countEmptyIntStream.count(); // 0
		System.out.println("countEmptyIntStream : " + count);
		
		
		/* 3. OptionalInt max() */
		IntStream maxIntStream = IntStream.rangeClosed(1, 10);
		OptionalInt max = maxIntStream.max(); // 10
		System.out.println("maxIntStream : " + max);
		
		
		/* 4. OptionalInt min() */
		IntStream minIntStream = IntStream.rangeClosed(1, 10);
		System.out.print("minIntStream : ");
		minIntStream.min() // 1
			.ifPresent(System.out::println);
		
		
		/* 5. int sum() */
		IntStream sumIntStream = IntStream.rangeClosed(1, 10);
		int sum = sumIntStream.sum(); // 55
		System.out.print("sumIntStream : " + sum);

	}

}
