package com.wealth.certificate.study_1z0_809.chapter01.encapsulation.street21;

public class House {
	protected int number;
	private String reference;

	void printNumber() {
		System.out.println("Num: " + number);
	}

	public void printInformation() {
		System.out.println("Num: " + number);
		System.out.println("Ref: " + reference);
	}
}

class BlueHouse extends House {
	public String getColor() {
		return "BLUE";
	}
}