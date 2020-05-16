package com.wealth.certificate.dumps_1z0_809_ps.question008;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TechName {
	String techName;
	TechName (String techName) {
		this.techName=techName;
	}

	public static void main(String[] args) {
		List<TechName> tech = Arrays.asList (
								new TechName("Java-"),
								new TechName("Oracle DB-"),
								new TechName("J2EE-"));
		Stream<TechName> stre = tech.stream();
		//line n1 //Java-Oracle DB-J2EE-
		
		//A. incorrect
		//stre.forEach(System.out::print); 		//output is address
		
		//B. correct
		//stre.map(a-> a.techName).forEach(System.out::print);
		
		//C. incorrect
		//stre.map(a-> a).forEachOrdered(System.out::print);  //output is address
		
		//D. incorrect
		stre.forEachOrdered(System.out::print); //output is address
	}	
}
