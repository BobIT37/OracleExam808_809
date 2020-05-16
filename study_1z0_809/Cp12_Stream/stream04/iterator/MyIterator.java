package com.wealth.certificate.study_1z0_809.chapter12.stream04.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyIterator {

	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void main(String[] args) {

		List<String> words = Arrays.asList(new String[] { "hello", "hola", "hallo", "ciao" });

		{
			Iterator<String> iterator = words.stream()
					//.parallel()
					.peek(MyIterator::printPeek)
					.iterator();
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}

	}

}
