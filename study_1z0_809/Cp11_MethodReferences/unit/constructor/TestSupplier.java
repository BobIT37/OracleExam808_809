package com.wealth.certificate.study_1z0_809.chapter11.unit.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class TestSupplier {
	public static void main(String[] args) {
		// Using an anonymous class
		Supplier<List<String>> s1 = new Supplier() {
		     public List<String> get() {
		         return new ArrayList<String>();
		     }
		};
		List<String> l1 = s1.get();

		// Using a lambda expression
		Supplier<List<String>> s2 = () -> new ArrayList<String>();
		List<String> l2 = s2.get();

		// Using a method reference
		Supplier<List<String>> s3 = ArrayList::new;
		List<String> l3 = s3.get();
	}
}
