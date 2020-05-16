package com.wealth.certificate.study_1z0_809.chapter16.operations03;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.stream.*;

public class LongStreamTest {

	public static void main(String[] args) {
		
		/* ------ LongStream ------ */
		/*
		 * 1. OptionalDouble average()
		 * 2. long count()
		 * 3. OptionalLong max()
		 * 4. OptionalLong min()
		 * 5. long sum()
		 */
		
		
		/* 1. OptionalDouble average() */
		LongStream averageLongStream = LongStream.rangeClosed(1, 10);
		OptionalDouble average = averageLongStream.average();
		System.out.println("averageLongStream : " + average); // 5.5
		
		
		/* 2. long count() */
		LongStream countLongStream = LongStream.rangeClosed(1, 10);
		long count = countLongStream.count(); // 10
		System.out.println("countLongStream : " + count);
		
		LongStream countEmptyLongStream = LongStream.empty();
		count = countEmptyLongStream.count(); // 0
		System.out.println("countEmptyLongStream : " + count);
		
		
		/* 3. OptionalLong max() */
		LongStream maxLongStream = LongStream.rangeClosed(1, 10);
		OptionalLong max = maxLongStream.max(); // 10
		System.out.println("maxLongStream : " + max);
		
		
		/* 4. OptionalLong min() */
		LongStream minLongStream = LongStream.rangeClosed(1, 10);
		System.out.print("minLongStream : ");
		minLongStream.min() // 1
			.ifPresent(System.out::println);
		
		
		/* 5. long sum() */
		LongStream sumLongStream = LongStream.rangeClosed(1, 10);
		long sum = sumLongStream.sum(); // 55
		System.out.print("sumLongStream : " + sum);

	}

}
