package com.wealth.certificate.study_1z0_809.chapter01.encapsulation.city;

import com.wealth.certificate.study_1z0_809.chapter01.encapsulation.street21.House;

class GenericHouse extends House {
	public static void main(String args[]) {
		GenericHouse h = new GenericHouse();
		h.number = 100;
		h.reference = ""; // Compile-time error
		h.printNumber(); // Compile-time error
		h.printInformation();
		BlueHouse bh = new BlueHouse(); // Compile-time error
		bh.getColor(); // Compile-time error
	}
}