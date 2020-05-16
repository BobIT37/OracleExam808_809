package com.wealth.certificate.study_1z0_809.chapter03.static_inner_class;

import com.wealth.certificate.study_1z0_809.chapter03.static_inner_class.Computer.Mouse;

//Static Inner Class
public class Class01 {
	public static void main(String[] args) {
		// Static inner classes are accessed through their enclosing class
		Computer.Mouse m = new Computer.Mouse();

		// Static classes are INDEPENDENT of their enclosing class. They are like
		// ordinary classes
		Mouse m1 = new Mouse();
		
		//Illegal enclosing instance specification for type Computer.Mouse
		//Computer c = new Computer();
		//Computer.Mouse m2 = c.new Mouse(); 
	}
}

class Computer {
	private static String serialNumber = "1234X";
	private String name = "";
	
	public static void testComputer() {
		
	}
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}

	// Just remember that the inner static class must be a public member so that it
	// can be accessed from another package.
	// They can also be marked as private, protected or without a modifier,
	// so they are accessible only in the package (default accessibility).
	public static class Mouse {
		private int i = 0;
		
		void printSN() {
			// the static inner class have access to the other members of the enclosing
			// class, but only if they are STATIC.
			System.out.println("MOUSE-" + serialNumber);
			i = 1;
		}
		
	}

	private static class Component {
	}

	protected static class MotherBoard {
	}

	static class Slot {
	}
}