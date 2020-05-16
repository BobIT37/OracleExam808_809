package com.wealth.certificate.dumps_1z0_809_ert.question054;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class question054 {
	public static void main(String[] args) {
		List<Person> sts = Arrays.asList(
				new Person("Jack", 30), 
				new Person("Mike Hill", 21),
				new Person("Thomas Hill", 24));
		Stream<Person> resList = sts.stream().filter(s -> s.getAge() >= 25);
		long count = resList.filter(s -> s.getName().contains("Hill")).count();
		System.out.print(count);
	}
}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

/*
 * 
 * What is the result? 
 * A) An Exception is thrown at run time.
 * B) 2 
 * C) 0 
 * D) A compilation error occurs at line n1.
 * 
 * Answer: C
 */