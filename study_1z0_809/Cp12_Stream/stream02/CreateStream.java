package com.wealth.certificate.study_1z0_809.chapter12.stream02;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {

		// #### Stream Declaration ####

		/*
		 * Empty Stream Its often the case that the empty() method is used upon creation
		 * to avoid returning null for streams with no element:
		 * 
		 * public Stream<String> streamOf(List<String> list) { return list == null ||
		 * list.isEmpty() ? Stream.empty() : list.stream(); }
		 */
		Stream<String> streamEmpty = Stream.empty();
		//Stream<String> streamNull = null; // avoid
				
		
		/*
		 * 1. From an existing collection
		 */				
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		Stream<String> streamFromCollection = words.stream();
		
		
		/*
		 * 2. From individual elements
		 */
		
		/* Signatures of method
		// returns a stream of one element
		static <T> Stream<T> of(T t)
		// returns a stream whose elements are the specified values
		static <T> Stream<T> of(T... values)
		*/		
		Stream<String> streamFromIndividualElement = Stream.of("hello","hola", "hallo", "ciao");		
				
		/*
		 * 3. // From an array
		 */
		String[] arr = {"hello", "hola", "hallo", "ciao"};
		Stream<String> streamFromArray = Stream.of(arr);
		
		// you have to be careful with this last method when working with primitives.
		int[] intNum = { 1, 2, 3, 4, 5 };
		Integer[] IntegerNum = { 1, 2, 3, 4, 5 };
		System.out.println(Stream.of(intNum).count()); // It prints 1! So if want to prints all elements should be use
		System.out.println(Stream.of(IntegerNum).count()); // It prints 5!

		// See signature of method again
		System.out.println(Arrays.stream(intNum).count());
		System.out.println(IntStream.of(intNum).count());
		
		
		/*
		 * 4. Use stream generate() Static <T> Stream<T> generate(Supplier<T> s) The
		 * generate() method accepts a Supplier<T> for element generation. As the
		 * resulting stream is infinite, developer should specify the desired size or
		 * the generate() method will work until it reaches the memory limit:
		 */
		/*
		Method signature
		static <T> Stream<T> generate(Supplier<T> s)
		Stream<T> limit(long maxSize)
		*/		
		Stream<String> streamGenerate = Stream.generate(() -> "test").limit(5);
		streamGenerate.forEach(System.out::println);
		
		Stream<Double> streamDouble = Stream.generate(Math::random).limit(5);
		streamDouble.forEach(System.out::println);


		/*
		 * 5. Use Stream.iterate() Static <T> Stream<T> iterate(T seed, UnaryOperator<T>
		 * f)
		 * 
		 * The first element of the resulting stream is a first parameter of the
		 * iterate() method. For creating every following element the specified function
		 * is applied to the previous element.
		 * 
		 */
		/*
		Method Signature
		static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
		*/
		Stream<Integer> streamFromIterate = Stream.iterate(1, t -> t * 2).limit(5);
		streamFromIterate.forEach(p->System.out.println(p));
				
		Stream<BigInteger> bigIntStream = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(10);
		BigInteger[] bigIntArr = bigIntStream.toArray(BigInteger[]::new);
		System.out.println(Arrays.toString(bigIntArr));


		/*
		 * 6. Stream Builder void accept(T t) Stream.Builder<T> add(T t)
		 *
		 * When builder is used the desired type should be additionally specified in the
		 * right part of the statement, otherwise the build() method will create an
		 * instance of the Stream<Object>
		 */
		/*
		Method Signature (that follows the builder design pattern)
		void accept(T t) Stream.Builder<T> add(T t)
		*/
		
		Stream.Builder<String> builder = Stream.<String>builder().add("h").add("e").add("l");
		builder.add("l"); // call accept		
		builder.accept("o");
		builder.accept("!");
		Stream<String> StBuilder = builder.build();
		System.out.println(Arrays.toString(StBuilder.toArray(String[]::new)));					
		
		
		/*
		 * 7. From Popular APIs Stream method from APIs
		 * 
		 * Instead of splitting strings into streams for each character we can split
		 * strings for any pattern and create a stream
		 */
		String sentence = "Program creek is a Java site.";
		Stream<String> wordStream = Pattern.compile(" ").splitAsStream(sentence);
		String[] wordArr = wordStream.toArray(String[]::new);
		System.out.println(Arrays.toString(wordArr));

		
		/*
		 * 8. Stream of Primitives IntStream and LongStream
		 * 
		 * static IntStream range(long startInclusive, long endExclusive) static
		 * IntStream rangeClosed(long startInclusive, long endInclusive) static
		 * LongStream range(long startInclusive, long endExclusive) static LongStream
		 * rangeClosed(long startInclusive, long endInclusive)
		 *
		 * That returns a sequential stream for the range of int or long elements. For
		 * example:
		 */

		/*
		IntStream and LongStream define the methods:
		static IntStream range(long startInclusive, long endExclusive)
		static IntStream rangeClosed(long startInclusive, long endInclusive)
		static LongStream range(long startInclusive, long endExclusive)
		static LongStream rangeClosed(long startInclusive, long endInclusive)
		 */
		
		// stream of 1, 2, 3
		IntStream s1 = IntStream.range(1, 4);
		// stream of 1, 2, 3, 4
		IntStream s2 = IntStream.rangeClosed(1, 4);
		
		// Also, there are new methods in the Java API that generate streams
		IntStream s3 = new Random().ints(5, 1, 10); // 1.8

	}
}
