package com.wealth.certificate.study_1z0_809.chapter12.stream03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperationsStateful {

	public static void main(String[] args) {
		
		/* 1. Stream<T> distinct()	Stateful	Returns a stream consisting of the distinct elements. */
		System.out.println("1. Stream<T> distinct()   Stateful");
		List<String> distinctList = Arrays.asList("1", "1", "2", "3", "4");
		long distinctListSize = distinctList.stream()
				.peek(p -> System.out.println("before " + p))
				.distinct()
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("distinctListSize : " + distinctListSize + "\n");
		
		
		/* 2. Stream<T> limit(long maxSize)	Stateful	Returns a stream truncated to be no longer than maxSize in length. */		
		System.out.println("2. Stream<T> limit(long maxSize)   Stateful");
		List<String> limitList = Arrays.asList("1", "1", "2", "3", "4");
		long limitListSize = limitList.stream()
				.peek(p -> System.out.println("before " + p))
				.limit(3)
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("limitListSize : " + limitListSize + "\n");
		
		
		/* 3. Stream<T> skip(long n)	Stateful	Returns a stream with the remaining elements of this stream after discarding the first n elements. */
		System.out.println("3. Stream<T> skip(long n)   Stateful");
		List<String> skipList = Arrays.asList("1","1","2","3","4");
		long skipListSize = skipList.stream()
				.peek(p -> System.out.println("before " + p))
				.skip(2)
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("skipListSize : " + skipListSize + "\n");
	    		
		
		/* 4. Stream<T> sorted()	Stateful	Returns a stream sorted according to the natural order of its elements. */
		System.out.println("4. Stream<T> sorted()   Stateful");
		List<String> sortedList = Arrays.asList("3","5","1","4","3","2");
		long sortedListSize = sortedList.stream()
				.peek(p -> System.out.println("before " + p))
				.sorted()
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("sortedList : "+sortedListSize + "\n");
	    
	   
		
		/* 5. Stream<T> sorted(Comparator<? super T> comparator)	Stateful	Returns a stream with the sorted according to the provided Comparator. */
		System.out.println("5. Stream<T> sorted(Comparator<? super T> comparator)   Stateful");
		List<String> sortedWithComparatorList = Arrays.asList("3","5","1","4","3","2");
		long sortedWithComparatorListSize = sortedWithComparatorList.stream()
				.peek(p -> System.out.println("before " + p))
				.sorted(Comparator.reverseOrder())
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("sortedWithComparatorListSize : " + sortedWithComparatorListSize + "\n");
		
	}

}
