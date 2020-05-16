package com.wealth.certificate.study_1z0_809.chapter03.non_static_inner_class;

import com.wealth.certificate.study_1z0_809.chapter03.non_static_inner_class.Computer.HardDrive;

//Inner Class
public class Class01 {
	public static void main(String[] args) {
		Computer computer = new Computer();
		Computer.HardDrive hardDrive = computer.new HardDrive();

		// You can also use the import trick to writing less
		Computer computer2 = new Computer();
		HardDrive hardDrive2 = computer2.new HardDrive();

		// use a method of the enclosing class to create it, avoiding that weird syntax.
		Computer computer3 = new Computer();
		HardDrive hardDrive3 = computer3.getHardDrive();

		HardDrive hardDrive4 = new Computer().new HardDrive();

		// No enclosing instance of type Computer is accessible.
		// Must qualify the allocation with an enclosing instance of type Computer
		// (e.g. x.new A() where x is an instance of Computer).
		// HardDrive hardDrive5 = new Computer.HardDrive();

	}
}

// Non-static inner classes are just called inner classes.
class Computer {
	private String brand = "XXX";
	private static String serialNumber = "1234X";

	public class HardDrive {
		// the inner class has access to the other members of the enclosing class, but
		// this time, it DOESN'T matter if they are static or not.
		void printSN() {
			System.out.println(brand + "-MOUSE-" + serialNumber);
		}
		
		//-------------------------
		// Static code is executed during class initialization,
		// but you cannot initialize a non-static inner class without having an instance
		// of the enclosing class.

		// CANNOT contain static members.
		// Compile-time error here
		// static int capacity;

		// CANNOT contain static members.
		// Compile-time error here
		// static void printInfo() {
		// }

		//-------------------------
		// The only exception is when you define a final static attribute.
		// it only works with ATTRIBUTES and when assigning an NON-NULL value.
		final static int capacity = 120; // It does compile!
		
		// Compile-time error here
//		final static String brand;

		// Compile-time error here
//		final static void printInfo() {
//		}
		
	}

	// Most of the time, since they depend on the enclosing class, they are marked
	// as private.
	private class Component {
	}

	protected class MotherBoard {
	}

	class Slot {
	}

	public HardDrive getHardDrive() {
		return new HardDrive();
	}
}