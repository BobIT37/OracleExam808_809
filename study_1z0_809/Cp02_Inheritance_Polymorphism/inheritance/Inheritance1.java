package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.inheritance;

public class Inheritance1 {

}

class Tool {
	public int size;
	public String color;
	public double weight;
	public static String name;
	
	public Tool() {
		System.out.println("Tool is Created.");
	}

	public double getWeight() {
		return weight;
	}
	protected int getSize() {
		return size;
	}
	public static String getName() {
		return name;
	}
}

class Hammer extends Tool {
	public String color;
	public boolean isHeavy;
	
	public Hammer() {
		super();
		System.out.println("Hammer is Created.");
	}

	@Override
	public int getSize() {
		return size;
	}
	public void printWeight() {
		System.out.println("Weight : " + getWeight());
	}
	public static String getName() {
		return "This is " + name;
	}
}
