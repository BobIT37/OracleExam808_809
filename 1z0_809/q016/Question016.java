package com.wealth.certificate.dumps_1z0_809.question016;

import java.util.ArrayList;
import java.util.List;

public class Question016 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Sam");
		names.add("Ben");

		names.stream().forEach((x) -> printNames(x));
		System.out.println("");
		
		long count = names.stream().peek((x) -> printNames(x)).filter((x) -> x.length() > 3).count();
		System.out.println("Count : " + count);
	}

	static void printNames(String str) {
		System.out.println(str);
	}
}
