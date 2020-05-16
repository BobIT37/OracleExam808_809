package com.wealth.certificate.study_1z0_809.chapter12.stream04.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Reduce {
	
	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	public static void printPeek(Person s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	
	public static void main(String[] args) {
		
		List<Person> personList = Arrays.asList(
				new Person("Max", 18),
				new Person("Peter", 23),
				new Person("Pamela", 23),
				new Person("Ed", 24),
				new Person("David", 12)
				);
		
		// ======== T reduce(T identity, BinaryOperator<T> accumulator)	
		/*Performs a reduction on the elements of this stream, using the provided identity value and an associative accumulation function, and returns the reduced value.*/
		personList
		    .stream()
		    .reduce((p1, p2) -> p1.age > p2.age ? p1 : p2)
		    .ifPresent((p) -> System.out.println(p + " is Max age."));	// Ed
		System.out.println("------------------------------------");
		
		
		Person result = personList
		        .stream()
		        .reduce(
			        		new Person("", 0), 
			        		(p1, p2) -> {
			        					System.out.println("p1 age : "+p1.age+" , p2 age : "+p2.age);
			        					p2.age += p1.age;
//			        					p1.name = p2.name;
			        					return p2;
		        					}
		        			);

		System.out.format("name=%s; age=%s", result.name, result.age); 	// name=David; age=100
		System.out.println();
		System.out.println("------------------------------------");
		
		
		List<Person> personList1 = Arrays.asList(
				new Person("Max", 18),
				new Person("Peter", 23),
				new Person("Pamela", 23),
				new Person("Ed", 24),
				new Person("David", 12)
				);
		
		
//		BiFunction<T, U, R> bff = new BiFunction<T, U, R>() {
//
//			@Override
//			public R apply(T t, U u) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//		
//		BinaryOperator<T> bop = new BinaryOperator<T>() {
//
//			@Override
//			public T apply(T t, T u) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
//		
//		UnaryOperator<T> uu = new UnaryOperator<T>() {
//
//			@Override
//			public T apply(T t) {
//				// TODO Auto-generated method stub
//				return null;
//			}
//		};
		
		
		Integer ageSum = personList1
			    .stream()
//			    .parallelStream()
			    .reduce(
			    			0, 
			    			(sum, p) -> { 
			    				System.out.println("sum1 + sum2 : " + (sum + p.age));
			    				return sum += p.age;
			    			},
			    			(sum1, sum2) -> {
			    				System.out.println("sum1 + sum2 : " + (sum1 + sum2));
			    				return sum1 + sum2;}
			    			);
		System.out.println("Sum of age is " + ageSum); // 100
		System.out.println("------------------------------------");
		
		
		Person person = personList
			    .stream()
//			    .parallelStream()
			    .reduce(
			    		new Person("First", 0),
			        (sum, p) -> {
//			            System.out.format("accumulator: sum=%s; person=%s\n", sum, p);
			        	System.out.println("current: " + sum + " - next: " + p);
			            return p;
			        },
			        (sum1, sum2) -> {
//			            System.out.format("combiner: sum1=%s; sum2=%s\n", sum1, sum2);
			        	System.out.println("comb current: " + sum1 + " - comb next: " + sum2);
			            return sum2;
			        });
		System.out.println("1 last person is " + person);
		System.out.println("------------------------------------");
		
		
		Person person2 = personList
//				.stream()
			    .parallelStream()
			    .reduce(
			    		new Person("First", 0),
			    		(p1, p2) -> {
			    			System.out.println("current: " + p1 + " - next: " + p2);
			    			return p2;
			    		}
			    		);
		System.out.println("2 last person is " + person2);
		System.out.println("------------------------------------");

	}

}


class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}
