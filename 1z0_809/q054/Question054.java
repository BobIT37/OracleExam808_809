package com.wealth.certificate.dumps_1z0_809.question054;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question054 {
	private String eName;
	private Integer eAge;

	Question054(String eN, Integer eA) {
		this.eName = eN;
		this.eAge = eA;
	}

	public Integer getEAge() {
		return eAge;
	}

	public String getEName() {
		return eName;
	}

	public static void main(String[] args) {
		List<Question054> li = Arrays.asList(new Question054("Sam", 20), new Question054("John", 60),new Question054("Jim", 51));
		Predicate<Question054> agVal = s -> s.getEAge() > 50;// line n1
		li = li.stream().filter(agVal).collect(Collectors.toList());
		Stream<String> names = li.stream().map(Question054::getEName);// line n2 
		names.forEach(n -> System.out.print(n + " "));
	}
}
