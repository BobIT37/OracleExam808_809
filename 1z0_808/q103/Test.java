package com.wealth.certificate.dumps_1z0_808.question103;

class Cake {
	int model;
	String flavor;

	Cake() {
		model = 0;
		flavor = "Unknown";
	}
}

public class Test {
	public static void main(String[] args) {
		Cake c = new Cake();
		bake1(c);
		System.out.println(c.model + " " + c.flavor);
		bake2(c);
		System.out.println(c.model + " " + c.flavor);
	}

	public static Cake bake1(Cake c) {
		c.flavor = "Strawberry";
		c.model = 1200;
		return c;
	}

	public static void bake2(Cake c) {
		c.flavor = "Chocolate";
		c.model = 1230;
		return;
	}
}
