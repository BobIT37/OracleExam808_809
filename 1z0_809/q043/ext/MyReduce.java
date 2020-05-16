package com.wealth.certificate.dumps_1z0_809.question043.ext;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class MyReduce {

	public static void main(String[] args) {

		BinaryOperator<Integer> accumulator = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				System.out.println("apply : " + t + "+" + u);
				return t + u;
			}
		};
		// reduce 1 arg
		System.out.println("reduce 1 arg");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list.stream().reduce(accumulator).orElse(-1));
		list = Arrays.asList();
		System.out.println(list.stream().reduce(accumulator).orElse(-1));
		list.stream().reduce(accumulator).ifPresent(System.out::println);
		list = Arrays.asList(1);
		System.out.println(list.stream().reduce(accumulator).get());
		list = Arrays.asList(1, 2);
		list.stream().reduce(accumulator).ifPresent(System.out::println);

		// reduce 2 arg
		System.out.println("reduce 2 arg");
		list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list.stream().reduce(0, accumulator).intValue());
		list = Arrays.asList();
		System.out.println(list.stream().reduce(0, accumulator).intValue());
		list = Arrays.asList(1);
		System.out.println(list.stream().reduce(0, accumulator).intValue());

		list = Arrays.asList(1, 2, 3);
		BinaryOperator<Integer> combiner = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				System.out.println("combiner : " + t + "+" + u);
				return t + u;
			}
		};
		System.out.println("reduce 3 arg");
		System.out.println("Sequential");
		System.out.println(list.stream().reduce(0, accumulator, combiner).intValue());
		System.out.println("Parallel");
		System.out.println(list.parallelStream().reduce(0, accumulator, combiner).intValue());

	}

}
