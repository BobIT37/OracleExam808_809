package com.wealth.certificate.study_1z0_809.chapter12.stream04.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;


public class IteratorTest {
	
	public static void printPeek(String s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}
	public static void printPeek(Person s) {
		System.out.println("@"+Thread.currentThread().getId()+"-peek : "+s);
	}

	public static void main(String[] args) {
		
		// ======== Iterator<T> iterator() =================================
		/*Returns an iterator for the elements of the stream.*/
		
		List<String> nameList = Arrays.asList("Ram", "Sheila", "Mukesh", "Rani", "Nick", "Amy", "Desi", "Margo");
		Iterator<String> itr = nameList
//				.stream()
				.parallelStream()
				.peek(IteratorTest::printPeek)
				.iterator();
		
		while (itr.hasNext()) {
			System.out.println("name iterator - " + itr.next());
		}
		System.out.println("------------------------------------");
		
		
		// ======== Spliterator<T> spliterator() ===========================
		/*Returns a spliterator for the elements of the stream.*/

		List<String> nameList2 = Arrays.asList("Ram", "Sheila", "Mukesh", "Rani", "Nick", "Amy", "Desi", "Margo");
		Spliterator<String> splitStr = nameList2
				.stream()
//				.parallelStream()
				.peek(IteratorTest::printPeek)
				.spliterator();
		
		while (splitStr.tryAdvance((n) -> System.out.println("name spliterator - " + n)))
			;
		System.out.println("------------------------------------");
		
		
		List<Person> persons3 = Arrays.asList(
		        new Person("Max", 18),
		        new Person("Peter", 23),
		        new Person("Pamela", 23),
		        new Person("Ed", 24),
		        new Person("David", 12)
		        );
		Spliterator<Person> peopleSpliterator = persons3
				.stream()
				.peek(IteratorTest::printPeek)
				.spliterator();

		while (peopleSpliterator.tryAdvance((s) -> System.out.println("Person name: "+s)))
			;
		System.out.println("------------------------------------");
		
		
		List<String> name_List = Arrays.asList("Ram", "Sheila", "Mukesh", "Rani", "Nick", "Amy", "Desi", "Margo", "Margo2");
		Spliterator<String> splitName_1 = name_List.stream().spliterator();
		System.out.println("Size: " + splitName_1.estimateSize());
		
		Spliterator<String> splitName_2 = splitName_1.trySplit();
		System.out.println("Size: " + splitName_2.estimateSize());

		Spliterator<String> splitName_3 = splitName_2.trySplit();
		System.out.println("Size: " + splitName_3.estimateSize());

		Spliterator<String> splitName_4 = splitName_3.trySplit();
		System.out.println("Size: " + splitName_4.estimateSize());
		
//		Spliterator<String> splitName_5 = splitName_1.trySplit();
//		System.out.println(splitName_5+ ", Size: " + splitName_4.estimateSize());
		 		
		/*Spliterator<T> spliterator()
		Returns a spliterator for the elements of the stream.*/
		System.out.println("Spliterator_1");
		while (splitName_1.tryAdvance((n) -> System.out.println("name_1 - " + n)))
			;

		System.out.println("Spliterator_2");
		while (splitName_2.tryAdvance((n) -> System.out.println("name_2 - " + n)))
			;
		
		System.out.println("Spliterator_3");
		while (splitName_3.tryAdvance((n) -> System.out.println("name_3 - " + n)))
			;

		System.out.println("Spliterator_4");
		while (splitName_4.tryAdvance((n) -> System.out.println("name_4 - " + n)))
			;
		
		splitName_4.forEachRemaining((n) -> System.out.println("name_4 - " + n));
		
		
		Stream<String> backToStream = StreamSupport.stream(splitName_1, false);
		backToStream.forEach(p -> System.out.println("name_"));
		 
//		System.out.println("Spliterator_5");
//		while (splitName_5.tryAdvance((n) -> System.out.println("name_5 - " + n)))
//			;
		
		
		
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




