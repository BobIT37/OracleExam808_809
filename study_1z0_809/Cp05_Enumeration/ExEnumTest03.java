package com.wealth.certificate.study_1z0_809.chapter05;

public class ExEnumTest03 {

	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER); // SUMMER
		System.out.println(s == Season.SUMMER); // true

		System.out.println(Season.WINTER); // WINTER
		System.out.println(Season.valueOf("WINTER")); // WINTER
		System.out.println(Season.WINTER.name()); // WINTER
		System.out.println(Season.WINTER.toString()); // WINTER

		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}
		
		Season summer = Season.SUMMER;
		switch (summer) {
		case WINTER:
			System.out.println("Get out the sled!");
			break;
		case SUMMER:
			System.out.println("Time for the pool!"); // print
			break;
		default:
			System.out.println("Is it summer yet?");
		}
		// switch (summer) {
		// case 0: // DOES NOT COMPILE
		// System.out.println("Get out the sled!");
		// break;
		// }

	}

}
