package com.wealth.certificate.study_1z0_809.chapter12.stream04.spliterator;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MySpliterator {

	public static void printPeek(String s) {
		System.out.println("@" + Thread.currentThread().getId() + "-peek : " + s);
	}

	public static void main(String[] args) {

		List<String> words = Arrays.asList(new String[] { "hello", "hola", "hallo" });

		/*tryAdvance() and forEachRemaining()*/
		{
			
			System.out.println("----- tryAdvance() and forEachRemaining() -----");
			
			Spliterator<String> spliterator = words.stream().spliterator();
			
			System.out.println("estimateSize : "+spliterator.estimateSize());
			
			spliterator.tryAdvance(e->System.out.println("tryAdvance : "+e));
			
			System.out.println("estimateSize : "+spliterator.estimateSize());
			
			while(spliterator.tryAdvance(System.out::println));			
			//spliterator.forEachRemaining(System.out::println);
			
			System.out.println("estimateSize : "+spliterator.estimateSize());
			
		}
		
		/*Spliterator<T> trySplit()*/
		{
			
			System.out.println("----- Spliterator<T> trySplit() -----");
			
			Spliterator<String> spliterator1 = words.stream().spliterator();
			
			System.out.println("spliterator1 size : "+spliterator1.estimateSize());
			
			Spliterator<String> spliterator2 = spliterator1.trySplit();
						
			System.out.println("spliterator1 size : "+spliterator1.estimateSize());
			System.out.println("spliterator2 size : "+spliterator2.estimateSize());
			
			spliterator1.forEachRemaining(e->System.out.println("spliterator1 : "+e));
			spliterator2.forEachRemaining(e->System.out.println("spliterator2 : "+e));
						
		}
		
		/*StreamSupport*/
		{
			
			System.out.println("----- StreamSupport -----");
			
			Spliterator<String> spliterator1 = words.stream().spliterator();
			
			System.out.println("spliterator1 size : "+spliterator1.estimateSize());
			
			Spliterator<String> spliterator2 = spliterator1.trySplit();
						
			System.out.println("spliterator1 size : "+spliterator1.estimateSize());
			System.out.println("spliterator2 size : "+spliterator2.estimateSize());
			
			Stream<String> streamFromSpliterator1 = StreamSupport.stream(spliterator1, false);
			Stream<String> streamFromSpliterator2 = StreamSupport.stream(spliterator2, true);
			
			streamFromSpliterator1.forEach(e->System.out.println("streamFromSpliterator1 : "+e));
			streamFromSpliterator2.forEach(e->System.out.println("streamFromSpliterator2 : "+e));
						
		}
	}

}
