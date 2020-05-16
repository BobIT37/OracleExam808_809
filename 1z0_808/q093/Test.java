package com.wealth.certificate.dumps_1z0_808.question093;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void checkAge(List<Person> list, Predicate<Person> predicate) {
		for (Person p : list) {
			if (predicate.test(p)) {
				System.out.println(p.name + " ");
			}
		}
	}

	public static void main(String[] args) {
		List<Person> iList = Arrays.asList(new Person("Hank", 45), new Person("Charlie", 40), new Person("Smith", 38));

		// A (Lambda expression's signature does not match the signature of the functional interface method)
		// checkAge(iList, () -> p.getAge() > 40);

		// B
		// checkAge(iList, Person p -> p.getAge() > 40);

		// C
		checkAge(iList, p -> p.getAge() > 40);

		// D
		// checkAge(iList, (Person p) -> {p.getAge() > 40});
	}

}
