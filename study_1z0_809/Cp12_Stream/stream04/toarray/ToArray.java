package com.wealth.certificate.study_1z0_809.chapter12.stream04.toarray;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class ToArray {

	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		
		/*Object[] toArray()*/
		{
			System.out.println("----- toArray -----");
			Object[] result = words.stream()
			//.parallel()
			.peek(ToArray::printPeek)
			.toArray();
			
			for (Object object : result) {
				System.out.println(object + " -> "+object.getClass().toGenericString());
			}
			
		}
				
		/*<A> A[] toArray(IntFunction<A[]> generator)*/
		{
			System.out.println("----- toArray with generator -----");
			String[] result = words.stream()			
			.toArray(new IntFunction<String[]>() {
				@Override
				public String[] apply(int value) {
					return new String[value];
				}
			});
			//.toArray(String[]::new);	
			
			for (String s : result) {
				System.out.println(s + " -> "+s.getClass().toGenericString());
			}
		}
	}

}
