package com.wealth.certificate.dumps_1z0_809.question051;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Question051 {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(1, 2, 3);
		
		// Ex0
		//Function<Integer, Function<Integer,Integer>> makeAdder = x -> y -> x + y;

		//IntFunction<Integer> inFu = x -> y -> x * y; // line n1
		// Ex1
		//IntFunction<Integer> inFu2 = x -> x * x;

		// A
		//IntFunction<UnaryOperator> inFu = x -> y -> x * y;
		// Ex2
		//IntFunction<UnaryOperator<Integer>> inFu2 = x -> y -> x * y;

		// B
		IntFunction<IntUnaryOperator> inFu = x -> y -> x * y;
		// Ex3
		//IntFunction<IntBinaryOperator> inFu2 = x -> (y,j) -> x * y * j;

		// C
		//BiFunction<IntUnaryOperator> inFu = x -> y -> x * y;
		// Ex4
		//BiFunction<Integer, Integer, IntUnaryOperator> inFu2 = (x,j) -> y -> x * y;

		IntStream newStream = stream.map(inFu.apply(10)); // line n2
		// Ex5
		//IntStream newStream2 = stream.map(inFu.apply(2));
		//IntStream newStream2 = stream.map(inFu2.apply(10, 10));

		// D
		//IntStream newStream = stream.map(inFu.applyAsInt(10));

		newStream.forEach(System.out::print);
		// Ex6
		//newStream.forEach(System.out::print);
	}

}
