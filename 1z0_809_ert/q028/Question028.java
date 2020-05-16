package com.wealth.certificate.dumps_1z0_809_ert.question028;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Question028 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("win", "try", "best", "luck");
		Predicate<String> test1 = w -> {
			System.out.println("Checking . . . ");
			return w.equals("do"); // line n1
		};
		Predicate test2 = (String w) -> w.length() > 3; // line n2
		words.stream().filter(test2).filter(test1).count();

	}
}

/*
What is the result ?
A) 	Checking . . .
	Checking . . .
B) 	Checking . . .
C) 	A compilation errer occurs at line n1. 
D) 	A compilation error occurs at line n2.

Answer D.
A compilation error occurs at line n2.

https://docs.oracle.com/javase/tutorial/java/generics/erasure.html
*/