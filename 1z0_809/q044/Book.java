package com.wealth.certificate.dumps_1z0_809.question044;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Book implements Comparator<Book> {
	String name;
	double price;

	public Book() {
	}

	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public int compare(Book b1, Book b2) {
		return b1.name.compareTo(b2.name);
	}

	public String toString() {
		return name + ":" + price;
	}

	public static void main(String[] args) {
		List<Book> books = Arrays.asList(new Book("Beginning with Java", 2), new Book("A Guide to Java Tour", 3));
		Collections.sort(books, new Book());
		System.out.print(books);
	}
}

/*
What is the result?
A. [A Guide to Java Tour:3, Beginning with Java:2]
B. [Beginning with Java:2, A Guide to Java Tour:3]
C. A compilation error occurs because the Book class does not override the abstract
method compareTo().
D. An Exception is thrown at run time.

Answer: A is almost right.
The correct answer is [A Guide to Java Tour:3.0, Beginning with Java:2.0] 

*/

/*
1.Comparator
All elements in the list must be mutually comparable using the specified comparator 
Collections.sort(List<T> list, Comparator<? super T> c)

2.Comparable
All elements in the list must implement the Comparable interface. 

Collections.sort(List<T> list)
 */

