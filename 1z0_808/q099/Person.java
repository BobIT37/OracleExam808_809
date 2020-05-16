package com.wealth.certificate.dumps_1z0_808.question099;

public class Person {
	String name;
	int age = 25;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this(); // line n1
		setName(name);
	}
	
	public Person(String name, int age) {
		this(name); // line n2
		setAge(age);
	}
	
	// setter and getter method go here		
	public String show() {
		//return name + " " + age + " " + number;
		return name + " " + age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Jesse");
		Person p2 = new Person("Walter",52);
		System.out.println(p1.show());
		System.out.println(p2.show());

	}

}
