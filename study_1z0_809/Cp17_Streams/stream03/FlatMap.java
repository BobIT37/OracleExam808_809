package com.wealth.certificate.study_1z0_809.chapter17.stream03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleSupplier;
import java.util.stream.*;

public class FlatMap {

	public static void main(String[] args) {
		
		/* flatMap() is used to "flatten" (or combine) the elements of a stream into one (new) stream: */
		
		/*
		 * Stream<String[]>		-> flatMap ->	Stream<String>
		 * Stream<Set<String>>	-> flatMap ->	Stream<String>
		 * Stream<List<String>>	-> flatMap ->	Stream<String>
		 * Stream<List<Object>>	-> flatMap ->	Stream<Object>
		*/
		
		
		/* 1. Stream<String[]>		-> flatMap ->	Stream<String> */
		Stream<String[]> stringArrayStream = Stream.of(new String[][]{{"a", "b", "c"}, {"d", "e", "f"}});
		long flatMapSize = stringArrayStream
				.peek(p -> {
					System.out.print("before");
					for (String s : p) {
						System.out.print(" " + s);
					}
					System.out.println();
				})
				.flatMap(n -> Arrays.stream(n) )
				.peek(p -> System.out.println("after "+ p + "*"))
				.count();
		System.out.println("flatMapSize : " + flatMapSize + "\n");
		
		
		/* 2. Stream<Set<String>>	-> flatMap ->	Stream<String> */
		Set<String> stringSet1 = new HashSet<String>();
		stringSet1.add("a");
		stringSet1.add("b");
		stringSet1.add("c");
		
		Set<String> stringSet2 = new HashSet<String>();
		stringSet2.add("d");
		stringSet2.add("e");
		stringSet2.add("f");
		
		Stream<Set<String>> stringSetStream = Stream.of(stringSet1, stringSet2);			
		flatMapSize = stringSetStream
				.peek(p -> System.out.println("before " + p))
				.flatMap(n -> n.stream() )
				.peek(p -> System.out.println("after " + p + "*"))
				.count();
		System.out.println("flatMapSize : " + flatMapSize + "\n");
		
		
		/* 3. Stream<List<String>>	-> flatMap ->	Stream<String> */
		Stream<List<String>> stringListStream = Stream.of(Arrays.asList("a","b","c"),Arrays.asList("d","e","f"));			
		flatMapSize = stringListStream
				.peek(p -> System.out.println("before " + p))
				.flatMap(n -> n.stream() )
				.peek(p -> System.out.println("after " + p + "*"))
				.count();
		System.out.println("flatMapSize : " + flatMapSize + "\n");
		
		
		/*
		 * 1. <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
		 * 2. IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper)
		 * 3. LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper)
		 * 4. DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper)
		 */
		
		/* 
		 * From its signature (and their primitive versions' signature) 
		 * we can see that in contrast to map() (that returns a single value), 
		 * flatMap() must return a Stream. 
		 * If flatMap() returns null, an empty stream is returned instead.
		 */
		
		
		/* 1. <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper) */
		System.out.println("1. <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)");
		Stream<List<Character>> flatMapStream = Stream.of(Arrays.asList('a','b','c'),Arrays.asList('d','e','f'));
		flatMapStream.peek(p -> System.out.println("before " + p))
				.flatMap(l -> l.stream())
//				.peek(p -> System.out.println("after " + p + "*"))
//				.map(c -> (int) c)
				.forEach(i -> System.out.println("after " + i + "**"));
		
		
		/* 2. IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper) */
		System.out.println("\n2. IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper)");
		Stream<IntStream> flatMapToIntStream = Stream.of(IntStream.rangeClosed(1, 5),IntStream.rangeClosed(6, 10));
		flatMapToIntStream.peek(i -> System.out.println("before " + i))
				.flatMapToInt(i -> i)
				.forEach(i -> System.out.println("after " + i + "*"));
		
		System.out.println("\n2.1. IntStream flatMapToInt");
		Stream<String> flatMapToIntStream1 = Stream.of("1", "2", "3", "4", "5");
		flatMapToIntStream1.peek(i -> System.out.println("before " + i))
				.flatMapToInt(i -> IntStream.of(Integer.parseInt(i)))
				.forEach(i -> System.out.println("after " + i + "*"));
		
		System.out.println("\n2.2. IntStream flatMapToInt");
		Stream<List<String>> flatMapToIntStream2 = Stream.of(Arrays.asList("1", "2", "3", "4", "5"), Arrays.asList("6", "7", "8", "9", "10"));
		flatMapToIntStream2.peek(i -> System.out.println("before " + i))
				.flatMapToInt(i -> i.stream()
										.flatMapToInt(j -> IntStream.of(Integer.parseInt(j))))
				.forEach(i -> System.out.println("after " + i + "*"));

				
		/* 3. LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper) */
		System.out.println("\n3. LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper)");
		Stream<LongStream> flatMapLongStream = Stream.of(LongStream.rangeClosed(1, 5),LongStream.rangeClosed(6, 10));
		flatMapLongStream.peek(i -> System.out.println("before " + i))
				.flatMapToLong(l -> l)
				.forEach(i -> System.out.println("after " + i + "*"));
		
		System.out.println("\n3. LongStream flatMapToLong");
		Stream<String> flatMapLongStream1 = Stream.of("1", "2", "3", "4", "5");
		flatMapLongStream1.peek(i -> System.out.println("before " + i))
				.flatMapToLong(i -> LongStream.of(Integer.parseInt(i)))
				.forEach(i -> System.out.println("after " + i + "*"));
		
		System.out.println("\n3. LongStream flatMapToLong");
		Stream<List<String>> flatMapLongStream2 = Stream.of(Arrays.asList("1", "2", "3", "4", "5"), Arrays.asList("6", "7", "8", "9", "10"));
		flatMapLongStream2.peek(i -> System.out.println("before " + i))
				.flatMapToLong(i -> i.stream()
										.mapToLong(j -> Integer.parseInt(j)))
				.forEach(i -> System.out.println("after " + i + "*"));
		
		
		/* 4. DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper) */
		System.out.println("\n4. DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper)");
		Stream<DoubleStream> flatMapDoubleStream = Stream.of(DoubleStream.of(1, 2, 3, 4, 5),DoubleStream.of(6, 7, 8, 9, 10));
		flatMapDoubleStream.peek(i -> System.out.println("before " + i))
				.flatMapToDouble(d -> d)
				.forEach(i -> System.out.println("after " + i + "*"));
		
		System.out.println("\n4.1 DoubleStream flatMapToDouble");
		Stream<String> flatMapDoubleStream1 = Stream.of("1", "2", "3", "4", "5");
		flatMapDoubleStream1.peek(i -> System.out.println("before " + i))
				.flatMapToDouble(i -> DoubleStream.of(Integer.parseInt(i)))
				.forEach(i -> System.out.println("after " + i + "*"));
		
		System.out.println("\n4.2. DoubleStream flatMapToDouble");
		Stream<Stream<String>> flatMapDoubleStream2 = Stream.of(Stream.of("1", "2", "3", "4", "5"), Stream.of("6", "7", "8", "9", "10"));
		flatMapDoubleStream2.peek(i -> System.out.println("before " + i))
				.flatMapToDouble(i -> i
										.flatMapToDouble(j -> DoubleStream.of(Integer.parseInt(j))))
				.forEach(i -> System.out.println("after " + i + "*"));
		
		/* This way, with flatMap() you can convert a Stream<List<Object>> to Stream<Object>. However, the important concept is that this method returns a stream and not a single element. */
	}

}
