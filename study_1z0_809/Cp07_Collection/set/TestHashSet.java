package com.wealth.certificate.study_1z0_809.chapter07.set;

import java.util.HashSet;
import java.util.Set;

class Customer {
	
}

public class TestHashSet {
	public static void main(String[] args) {
		/*
		To retrieve objects and avoid duplicates, the elements have to implement the hashCode() and equals() methods.
		*/
		
		// Creating a HashSet with an initial capacity of 10
		System.out.println("\n-----------boolean add(E e)-----------");
		Set<String> set = new HashSet<>(10);
		// add() returns true if the element is not already in the set
		System.out.println(set.add("b")); // true
		System.out.println(set.add("x")); // true
		System.out.println(set.add("h")); // true
		System.out.println(set.add("b")); // false
		System.out.println(set.add(null)); // true
		System.out.println(set.add(null)); // false
		System.out.println(set); // [null, b, x, h]
		
		Customer cus1 = new Customer();
		Customer cus2 = new Customer();
		Customer cus3 = new Customer();
		Set<Customer> setCustomer = new HashSet<>(10);
		System.out.println(setCustomer.add(cus1)); // true
		System.out.println(setCustomer.add(cus2)); // true
		System.out.println(setCustomer.contains(cus1));
	}
}
