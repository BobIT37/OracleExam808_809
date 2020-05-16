package com.wealth.certificate.study_1z0_809.chapter03.shadowing;

//Shadowing
public class Class01 {
	public static void main(String[] args) {
		Computer.HardDrive hdd = new Computer().new HardDrive();
		hdd.printSN("XXXXXX");
	}
}

class Computer {
	private String serialNumber = "1234XXX";

	class HardDrive {
		private String serialNumber = "1234DDD";

		// the parameter serialNumber shadows the instance variable serialNumber of
		// HardDrive that in turn,
		// shadows the serialNumber of Computer.
		void printSN(String serialNumber) {
			System.out.println("SN: " + serialNumber);
			System.out.println("HardDrive SN: " + this.serialNumber); // if we use this inside an inner class, it will
																		// refer to the inner class itself.
			System.out.println("Computer SN: " + Computer.this.serialNumber); // If we need to reference the enclosing
																				// class, inside the inner class we can
																				// also use this, but in this way
																				// NameOfTheEnclosingClass.this.
		}
	}
}