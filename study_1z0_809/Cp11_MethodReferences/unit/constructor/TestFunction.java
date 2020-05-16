package com.wealth.certificate.study_1z0_809.chapter11.unit.constructor;

import java.util.function.Function;

public class TestFunction {
	public static void main(String[] args) {
		// Using a anonymous class
		Function<String, Integer> f1 =
		     new Function<String, Integer>() {
		         public Integer apply(String s) {
		             return new Integer(s);
		         }
		};
		Integer i1 = f1.apply("100");

		// Using a lambda expression
		Function<String, Integer> f2 = s -> new Integer(s);
		Integer i2 = f2.apply("100");

		// Using a method reference
		Function<String, Integer> f3 = Integer::new;
		Integer i3 = f3.apply("100");
	}
}
