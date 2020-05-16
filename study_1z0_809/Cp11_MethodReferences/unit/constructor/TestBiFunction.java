package com.wealth.certificate.study_1z0_809.chapter11.unit.constructor;

import java.util.Locale;
import java.util.function.BiFunction;

public class TestBiFunction {
	public static void main(String[] args) {
		// Using a anonymous class
		BiFunction<String, String, Locale> f1 = new BiFunction<String, String, Locale>() {
		     public Locale apply(String lang, String country) {
		         return new Locale(lang, country);
		     }
		};
		Locale loc1 = f1.apply("en","UK");

		// Using a lambda expression
		BiFunction<String, String, Locale> f2 = (lang, country) -> new Locale(lang, country);
		Locale loc2 = f2.apply("en","UK");

		// Using a method reference
		BiFunction<String, String, Locale> f3 = Locale::new;
		Locale loc3 = f3.apply("en","UK");
	}
}
