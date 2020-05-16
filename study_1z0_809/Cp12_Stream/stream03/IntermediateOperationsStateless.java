package com.wealth.certificate.study_1z0_809.chapter12.stream03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationsStateless {

	public static void main(String[] args) {

		/* 1. Stream<T> filter(Predicate<? super T> predicate)	Stateless	Returns a stream of elements that match the given predicate. */		
		System.out.println("1. Stream<T> filter(Predicate<? super T> predicate)   Stateless");
		List<Integer> filterList = Arrays.asList(1,2,3,4,5,6);
		long filterListSize = filterList.stream()
				.peek(p -> System.out.println("before " + p))
				.filter(n -> n % 2 == 0)
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("filterListSize : " + filterListSize + "\n");
		
		
		/* 2. <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)	Stateless	Returns a stream with the content produced by applying the provided mapping function to each element. There are versions for int, long and double also. */
		
		/*
		Stream<String[]>		-> flatMap ->	Stream<String>
		Stream<Set<String>>		-> flatMap ->	Stream<String>
		Stream<List<String>>	-> flatMap ->	Stream<String>
		Stream<List<Object>>	-> flatMap ->	Stream<Object>
		*/
		
		System.out.println("2. <R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)   Stateless");		
		Stream<List<String>> flatMapStream = Stream.of(Arrays.asList("a","b","c"),Arrays.asList("x","y","z"));			
		long flatMapListSize = flatMapStream
				.peek(p -> System.out.println("before " + p))
				.flatMap(n -> n.stream() )
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("flatMapListSize : " + flatMapListSize + "\n");
		
		
		/* 3. <R> Stream<R> map(Function<? super T,? extends R> mapper)	Stateless	Returns a stream consisting of the results of applying the given function to the elements of this stream. There are versions for int, long and double also. */
		System.out.println("3. <R> Stream<R> map(Function<? super T,? extends R> mapper)   Stateless");
		long mapStreamSize = IntStream.rangeClosed(1, 5)
				.peek(p -> System.out.println("before " + p))
				.map(n -> n * 2)
				.peek(p -> System.out.println("after "+p))
				.count();
		System.out.println("mapStreamSize : " + mapStreamSize + "\n");
		
		
		/* 4. Stream<T> peek(Consumer<? super T> action)	Stateless	Returns a stream with the elements of this stream, performing the provided action on each element. */
		System.out.println("4. Stream<T> peek(Consumer<? super T> action)   Stateless");
		Stream.of("A", "B", "C", "D", "E")
				.peek(n -> System.out.print("-"))
				.forEach(System.out::print);
	}

}
