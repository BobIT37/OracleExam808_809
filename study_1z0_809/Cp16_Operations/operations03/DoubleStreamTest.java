package com.wealth.certificate.study_1z0_809.chapter16.operations03;

import java.util.OptionalDouble;
import java.util.stream.*;

import org.apache.derby.impl.sql.catalog.SYSROUTINEPERMSRowFactory;
import org.apache.derby.tools.sysinfo;

public class DoubleStreamTest {

	public static void main(String[] args) {
		
		/* ------ DoubleStream ------ */
		/*
		 * 1. OptionalDouble average()
		 * 2. long count()
		 * 3. OptionalDobule max()
		 * 4. OptionalDobule min()
		 * 5. double sum()
		 */
		
		
		/* 1. OptionalDouble average() */
		DoubleStream averageDoubleStream = DoubleStream.of(new Double(1), new Double(2), 3, 4, 5);
		System.out.print("averageDoubleStream : ");
		averageDoubleStream.average().ifPresent(System.out::println); // 5.5
		
		
		/* 2. long count() */
		DoubleStream countDoubleStream = DoubleStream.of(1, 2, 3, 4, 5);
		long count = countDoubleStream.count(); // 3.0
		System.out.println("countDoubleStream : " + count);
		
		DoubleStream countEmptyDoubleStream = DoubleStream.empty();
		count = countEmptyDoubleStream.count(); // 0
		System.out.println("countEmptyDoubleStream : " + count);
		
		
		/* 3. OptionalDobule max() */
		DoubleStream maxDoubleStream = DoubleStream.of(1, 2, 3, 4, 5);
		OptionalDouble max = maxDoubleStream.max(); // 5.0
		System.out.println("maxDoubleStream : " + max);
		
		
		/* 4. OptionalDobule min() */
		DoubleStream minDoubleStream = DoubleStream.of(1, 2, 3, 4, 5);
		System.out.print("minDoubleStream : ");
		minDoubleStream.min() // 1.0
			.ifPresent(System.out::println);
		
		
		/* 5. double sum() */
		DoubleStream sumDoubleStream = DoubleStream.of(1, 2, 3, 4, 5);
		double sum = sumDoubleStream.sum(); // 15.0
		System.out.print("sumDoubleStream : " + sum);

	}

}
