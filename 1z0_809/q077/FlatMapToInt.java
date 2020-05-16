package com.wealth.certificate.dumps_1z0_809.question077;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapToInt {

	public static void main(String[] args) {
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("1", "2"), Arrays.asList("5", "6"),
				Arrays.asList("3", "4"));

		/*
		 * ToIntFunction<String> toIntFunc = new ToIntFunction<String>() {
		 * 
		 * @Override public int applyAsInt(String value) { return
		 * Integer.valueOf(value); } };
		 * 
		 * IntStream intStream = listOfLists.stream().flatMapToInt(i ->
		 * i.stream().mapToInt(toIntFunc));
		 */

		IntStream intStream = listOfLists.stream().flatMapToInt(i -> i.stream().mapToInt(n -> Integer.parseInt(n)));

		// let's peek and find sum of the elements
		int sum = intStream.peek(System.out::println).sum();
		System.out.println("sum: " + sum);

	}

}
