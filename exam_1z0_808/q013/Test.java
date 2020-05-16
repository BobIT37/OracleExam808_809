package com.wealth.certificate.exam_1z0_808.question013;

class Animal {
	String type = "Canine";
	int maxSpeed = 60;
	
	public Animal() {
		
	}
	
	public Animal(String type , int maxSpeed) {
		this.type = type;
		this.maxSpeed = maxSpeed;
	}
}

class WildAnimal extends Animal {

	String bound = "Long";

	
	public WildAnimal(String bound) {
		// n1
	}
	
	public WildAnimal(String type,int maxSpeed, String bound) {
		//n2
	}
	
	public void print() {
		System.out.println(this.type+" "+this.maxSpeed+" "+this.bound);
	}
}

public class Test {

	public static void main(String[] args) {
		
		WildAnimal obj1 = new WildAnimal("Long");
		obj1.print();

		WildAnimal obj2 = new WildAnimal("Fedine",80,"Short");

		obj2.print();
		

	}

}

/*
Make Result
Canine,60,Short
Fedine,80,Long

Answer. 
at n1
super();
this.bound = bound;

at n2
super(type,maxSpeed);
this.bound = bound;
*/

