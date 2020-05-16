package com.wealth.certificate.study_1z0_809.chapter17.stream09;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void main(String[] args) {
		
		/*
		joining()
		joining(CharSequence delimiter)
		joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)
		*/
		
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		
		{
			String list = words.stream()			
			.peek(Joining::printPeek)
			.collect(Collectors.joining());			
			System.out.println("joining() : "+list);					
		}
		
		{
			String list = words.stream()			
			.parallel()
			.collect(Collectors.joining(","));			
			System.out.println("joining(CharSequence delimiter) : "+list);					
		}
		
		{
			String list = words.stream()			
			.parallel()
			.collect(Collectors.joining(",","[","]"));			
			System.out.println("joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix) : "+list);					
		}
		
	}

}
