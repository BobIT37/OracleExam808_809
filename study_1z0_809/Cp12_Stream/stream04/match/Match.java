package com.wealth.certificate.study_1z0_809.chapter12.stream04.match;

import java.util.Arrays;
import java.util.List;

public class Match {
	
	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void main(String[] args) {

		
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		
		/*1. boolean allMatch(Predicate<? super T> predicate)	Returns whether all elements of this stream match the provided predicate.*/
		{
			boolean result = words.stream()
			.peek(Match::printPeek)
			.allMatch(p->p.contains("o"));
			System.out.println("allMatch : "+result);
		}
		{
			boolean result = words.stream()
			.peek(Match::printPeek)
			.allMatch(p->p.contains("i"));
			System.out.println("allMatch : "+result);
		}
		
		/*2. boolean anyMatch(Predicate<? super T> predicate)	Returns whether any elements of this stream match the provided predicate.*/
		{
			boolean result = words.stream()
			.peek(Match::printPeek)
			.anyMatch(p->p.contains("a"));
			System.out.println("anyMatch : "+result);
		}
		{
			boolean result = words.stream()
			.peek(Match::printPeek)
			.anyMatch(p->p.contains("b"));
			System.out.println("anyMatch : "+result);
		}
		
		/*3. boolean noneMatch(Predicate<? super T> predicate)	Returns whether no elements of this stream match the provided predicate.*/		
		{
			boolean result = words.stream()
			.peek(Match::printPeek)
			.noneMatch(p->p.contains("c"));
			System.out.println("noneMatch : "+result);
		}
		{
			boolean result = words.stream()
			.peek(Match::printPeek)
			.noneMatch(p->p.contains("a"));
			System.out.println("noneMatch : "+result);
		}
		
	}

}
