package com.wealth.certificate.dumps_1z0_809.question044;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookComparable implements Comparable<BookComparable> {
	String name;
	double price;

	public BookComparable() {
	}

	public BookComparable(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return name + ":" + price;
	}

	@Override
	public int compareTo(BookComparable b2) {
		return this.name.compareTo(b2.name);
	}

	public static void main(String[] args) {
		List<BookComparable> books = Arrays.asList(new BookComparable("Beginning with Java", 2),
				new BookComparable("A Guide to Java Tour", 3));
		Collections.sort(books);
		System.out.print(books);
	}
}
