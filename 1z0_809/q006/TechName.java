package com.wealth.certificate.dumps_1z0_809.question006;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TechName {

	String techName;

	TechName(String techName) {
		this.techName = techName;
	}

	public static void main(String[] args) {
		List<TechName> tech = Arrays.asList(new TechName("Java-"), new TechName("Oracle DB-"), new TechName("J2EE-"));

		Stream<TechName> stre = tech.stream();
		// stre.forEach(System.out::print); // A print for each object
		stre.map(a -> a.techName).forEach(System.out::print); // B print Java-Oracle DB-J2EE-  == stre.map(a -> a.techName).forEachOrdered(System.out::print);
		// stre.map(a -> a).forEachOrdered(System.out::print); // C print for each object
		// stre.forEachOrdered(System.out::print); // D print for each object
	}

}

/*
Which should be inserted at line n1 to print Java-Oracle DB-J2EE-?
A. stre.forEach(System.out::print);
B. stre.map(a-> a.techName).forEach(System.out::print);
C. stre.map(a-> a).forEachOrdered(System.out::print);
D. stre.forEachOrdered(System.out::print);
*/

//Answer. B

// forEach() method performs an action for each element of this stream. For parallel stream, this operation does not guarantee to maintain order of the stream.
// forEachOrdered() method performs an action for each element of this stream, guaranteeing that each element is processed in encounter order for streams that have a defined encounter order.