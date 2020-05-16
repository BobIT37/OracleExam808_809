package com.wealth.certificate.dumps_1z0_809.question081;

import java.util.Map;
import java.util.TreeMap;

public class Question081 {
	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>(); 	// using the natural ordering of its keys. Comparable: k1.compareTo(k2)
		books.put (1007, "A");
		books.put (1002, "C");
		books.put (1001, "B");
		books.put (1003, "B");
		System.out.println (books);
	}
}
