package com.wealth.certificate.study_1z0_809.chapter17.stream05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Collect {

	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void printCombiner(List<String> a ,List<String> b) {
		System.out.println("@"+Thread.currentThread().getId()+"-printCombiner : "+a+" <> "+b);
		a.addAll(b);
	}
	
	public static void printAccumulator(List<String> l ,String e) {
		System.out.println("@"+Thread.currentThread().getId()+"-printAccumulator : "+l+" <- "+e);
		l.add(e);
	}
	
	public static void main(String[] args) {
						
		/*
		1. .collect(supplier, accumulator, combiner)
		2. .collect(collector)
		*/
		
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
				
		/*1.1 .collect(supplier, accumulator, combiner)*/
		{
			List<String> list = words.stream()						
			.peek(Collect::printPeek)			
			.parallel()
			//.collect(()->new ArrayList<String>(), (l,e)->l.add(e) , (a,b)->a.addAll(b));
			//.collect(ArrayList<String>::new, List::add , List::addAll);
			.collect(ArrayList<String>::new, Collect::printAccumulator , Collect::printCombiner);
			System.out.println("collect : "+list);		
			System.out.println(list.getClass().toGenericString());
		}

		/*
		Reduction, concurrency, and ordering
		1. The stream is parallel;
		2. The collector has the Collector.Characteristics.CONCURRENT characteristic, and;
		3. Either the stream is unordered, or the collector has the Collector.Characteristics.UNORDERED characteristic.
		*/	
		
		{
			words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao","witam","hej","helo","alo"});
			
			Map<Integer,List<String>> list = words.stream()		
			.parallel()
			.peek(Collect::printPeek)
			.collect(Collectors.groupingBy(String::length));
			
			System.out.println("collect : "+list);		
			System.out.println(list.getClass().toGenericString());
		}
		
		{
			
			words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao","witam","hej","helo","alo"});
			
			Map<Integer,List<String>> list = words.stream()
			.parallel()
			.peek(Collect::printPeek)
			.collect(Collectors.groupingByConcurrent(String::length));
			
			System.out.println("collect : "+list);		
			System.out.println(list.getClass().toGenericString());
		}
		
		
		/*
		Some common collectors of the Collectors class are
		
		Method			Returned value from collect()	Description
		
		toList			List							Accumulates elements into a List.
		toSet			Set								Accumulates elements into a Set.		
		toCollection	Collection						Accumulates elements into a Collection implementation.
		
		toMap			Map								Accumulates elements into a Map.
		
		
		joining*		String							Concatenates elements into a String.
		groupingBy*		Map<K, List<T>>					Groups elements of type T in lists according to a classification function, into a map with keys of type K.
		partitioningBy*	Map<Boolean, List<T>>			Partitions elements of type T in lists according to a predicate, into a map.
		*/
				
		/*1.2 .collect(collector)*/
		/*toList*/
		{
			List<String> list = words.stream()
			.peek(Collect::printPeek)
			.collect(Collectors.toList());			
			System.out.println("toList : "+list);
			System.out.println(list.getClass().toGenericString());
		}
		
		/*toSet*/
		{
			Set<String> set = words.stream()
			.peek(Collect::printPeek)
			.collect(Collectors.toSet());
			System.out.println("toSet : "+set);
			System.out.println(set.getClass().toGenericString());
		}
		
		/*toCollection*/
		{
			Set<String> set = words.stream()
			.peek(Collect::printPeek)
			.collect(Collectors.toCollection(TreeSet::new));			
			System.out.println("toCollection 1 : "+set);
			System.out.println(set.getClass().toGenericString());
			
			List<String> list = words.stream()
			.peek(Collect::printPeek)			
			.collect(Collectors.toCollection(LinkedList::new));
			System.out.println("toCollection 2 : "+list);
			System.out.println(list.getClass().toGenericString());					
		}
		
		/*toMap*/
		/*
		.toMap(keyMapper, valueMapper)
		.toMap(keyMapper, valueMapper, mergeFunction)
		.toMap(keyMapper, valueMapper, mergeFunction, mapSupplier)
		*/
		
		/*.toMap(keyMapper, valueMapper)*/
		{				
			//words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao","hello"});			
			Map<String,Integer> map = words.stream()
			.peek(Collect::printPeek)
			.collect(Collectors.toMap( k->k,k->k.length()));
			//.collect(Collectors.toMap( Object::toString , String::length));
			System.out.println("toMap : "+map);
		}
		
		/*.toMap(keyMapper, valueMapper, mergeFunction)*/
		{
			words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao","hello"});
			
			BinaryOperator<Integer> mergeFunction = new BinaryOperator<Integer>() {
				@Override
				public Integer apply(Integer t, Integer u) {
					System.out.println("mergeFunction ("+t+" + "+u+")");
					return t+u;
				}
			};
						
			Map<String,Integer> map = words.stream()
			.peek(Collect::printPeek)
			.collect(Collectors.toMap(Object::toString,String::length, mergeFunction ));
			System.out.println(map);
			//System.out.println(map.getClass().toGenericString());
		}
		
		/*.toMap(keyMapper, valueMapper, mergeFunction, mapSupplier)*/
		{
			words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao","hello"});
			
			BinaryOperator<Integer> mergeFunction = new BinaryOperator<Integer>() {
				@Override
				public Integer apply(Integer t, Integer u) {
					System.out.println("mergeFunction ("+t+" + "+u+")");
					return t+u;
				}
			};
						
			Supplier<Map<String,Integer>> mapSupplier = new Supplier<Map<String,Integer>>() {
				@Override
				public Map<String,Integer> get() {
					return new LinkedHashMap<String,Integer>();				
				}
			};
			
			Map<String,Integer> map = words.stream()
			.peek(Collect::printPeek)			
			.collect(Collectors.toMap(Object::toString,String::length, mergeFunction, mapSupplier ));
			System.out.println(map);
			System.out.println(map.getClass().toGenericString());
		}
				
		
			
		
		
		
	}

}
