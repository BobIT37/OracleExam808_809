package com.wealth.certificate.dumps_1z0_809.question116;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Question116 {
	public static int checkValue(String s1, String s2) {
		return s1.length() - s2.length();
	}
	public static void main(String[] args) {
		String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
		//line n1
		PersonFactory<Person> personFactory = Person::new;
		Person person = personFactory.create("Peter", "Parker");
		CheckClassFactory<CheckClass> chekcClass = CheckClass::new;
		Supplier<CheckClass> test = chekcClass::create;
		test.get();
		chekcClass.create();
		Arrays.sort(strArray, CheckClass :: checkValue); // A
		//Arrays.sort(strArray, (CheckClass::new)::checkValue); // B The target type of this expression must be a functional interface
		//Arrays.sort(strArray, (CheckClass::new).checkValue); // C The target type of this expression must be a functional interface
		//Arrays.sort(strArray, CheckClass :: new :: checkValue); // D The target type of this expression must be a functional interface
		for (String s : strArray) {
		System.out.print (s + " ");
		}
	}
		
}

class CheckClass {
	public static int checkValue (String s1, String s2) {
		return s1.length() - s2.length();
	}
}

interface CheckClassFactory<C extends CheckClass> {
	C create();
	
}


class Person {
    String firstName;
    String lastName;

    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}


interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}


