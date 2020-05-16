package com.wealth.certificate.dumps_1z0_809_ert.question042;

import java.util.Arrays;
import java.util.List;

class Person {
	private String firstName;
	private int salary;
	
	public Person(String fN, int sal){
		this.firstName = fN;
		this.salary = sal;
	}
	public int getSalary() { return salary;}
	
	public String getFirstName() {return firstName;}
	
}

public class Question042 {
	public static void main(String[] args) {
		List<Person> prog = Arrays.asList(
			new Person("Smith", 1500),
			new Person("John", 2000),
			new Person("Joe", 1000));
			double dVal = prog.stream()
			.filter(s -> s.getFirstName().startsWith("J") )
			.mapToInt(Person :: getSalary)
			.average()
			.getAsDouble();
			
			System.out.print(dVal);
			
//			System.out.println(prog.stream()
//			.filter(s -> s.getFirstName().startsWith("J") )
//			.mapToInt(Person :: getSalary)
//			.average());
			
	}
}
