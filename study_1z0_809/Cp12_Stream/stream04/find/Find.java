package com.wealth.certificate.study_1z0_809.chapter12.stream04.find;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Find {

	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList(new String[]{});
		Optional<?> x = words.stream().findFirst();	
		String ret = words.stream().findFirst().orElse("not value");
		
		System.out.println("ss :: "+x);
		
		Optional<String> cc = Optional.ofNullable(null);
		System.out.println(cc);
		//System.out.println("xx"+x.isPresent());
		/*1. Optional<T> findAny()	Returns an Optional describing some element of the stream.*/
//		{
//			OPTIONAL<STRING> RESULT = WORDS.STREAM()
//			.PEEK(FIND::PRINTPEEK)
////			.PARALLEL()
//			.FINDANY();
//			SYSTEM.OUT.PRINTLN("FINDANY : "+RESULT.ORELSE("NOT FOUND"));
//		}
//		
//		/*2. OPTIONAL<T> FINDFIRST()	RETURNS AN OPTIONAL DESCRIBING THE FIRST ELEMENT OF THIS STREAM.*/
//		{
//			OPTIONAL<STRING> RESULT = WORDS.STREAM()
//			.PEEK(FIND::PRINTPEEK)
//			.PARALLEL()
//			.FINDFIRST();
//			SYSTEM.OUT.PRINTLN("FINDFIRST : "+RESULT.ORELSE("NOT FOUND"));
//		}
		
	}

}
