package com.wealth.certificate.study_1z0_809.chapter02_Inheritance_and_Polymorphism.polymorshism;

public class Polymorshism {
	public static void main(String[] args) {
		HumanBeing[] someHumans = new HumanBeing[3];
		someHumans[0] = new Man();
		someHumans[1] = new Woman();
		someHumans[2] = new Baby();
		for (int i = 0; i < someHumans.length; i++) {
			someHumans[i].dress();
			System.out.println();
		}
	}
}

class HumanBeing {
	public void dress() {
		System.out.println("Dressing a human being");
	}
}

class Man extends HumanBeing {
	public void dress() {
		System.out.println("Put on a shirt");
		System.out.println("Put on some jeans");
	}
}

class Woman extends HumanBeing {
	public void dress() {
		System.out.println("Put on a dress");
	}
}

class Baby extends HumanBeing {
	public void dress() {
		System.out.println("I don't know how to dress!");
	}
}