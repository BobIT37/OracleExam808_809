package com.wealth.certificate.dumps_1z0_809.question008.methodreferences;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Person {
	String name;
    LocalDate birthday;
    
	public Person(String name,LocalDate date){
		this.name = name;
		this.birthday = date;
	}

    public static int compareByBirthday(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
    
    public static void print(Person a) {
        System.out.println(a.birthday);
    }
    
    public static void main(String... args) {
		//Person person = new Person();
		Person[] rosterAsArray = {	new Person("Test3",LocalDate.of(2017, 12, 01)),
				 					new Person("Test1",LocalDate.of(2017, 1, 01)),
				 					new Person("Test2",LocalDate.of(2017, 5, 01))};
		 
		Arrays.sort(rosterAsArray,
				    (Person a, Person b) -> {
				        return a.birthday.compareTo(b.birthday);
				    }
		);
		 
		Arrays.sort(rosterAsArray,
					(a, b) -> Person.compareByBirthday(a, b)
		);
		 
		//Method References Object::Method
		Arrays.sort(rosterAsArray, Person::compareByBirthday);
		 
		//stream()
		List<Person> personList = Arrays.asList(rosterAsArray);	
		personList.stream()
			.sorted(Person::compareByBirthday)
			.forEach(Person::print);
		
		//Ex.2 stream()
		List<String> personList2 = Arrays.asList("Test3","Test1","Test2"); 
		personList2.stream()
					.sorted(String::compareTo)
					.map(String::toUpperCase)
					.forEach(System.out::println);
	 }
}