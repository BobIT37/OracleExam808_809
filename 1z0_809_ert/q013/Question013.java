package com.wealth.certificate.dumps_1z0_809_ert.question013;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Question013 
{
	public static void main(String[] args)
	{
		IntConsumer consumer = e -> System.out.println(e);
		Integer value = 90;
		
		/* insert code fragment here */
		// A) 
		// ToIntFunction funRef = e -> e + 10; 		// The operator + is undefined for the argument type(s) Object, int
		// int result = funRef.apply(value); 			// The method apply(Integer) is undefined for the type ToIntFunction
		// B) 
		ToIntFunction<Integer> funRef = e -> e + 10; 
		int result = funRef.applyAsInt(value);
		// C)
		// Function<Integer> funRef = e -> e + 10;	// Incorrect number of arguments for type Function<T,R>; it cannot be parameterized with arguments <Integer>
		// Integer result = funRef.apply(value);
		// D) 
		// IntFunction funRef = e -> e + 10;
		// Integer result = funRef.apply(10); 			// Type mismatch: cannot convert from Object to Integer
		
		consumer.accept(result);
	}
}