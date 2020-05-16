package com.wealth.certificate.dumps_1z0_809.question029;

class FuelNotAvailException extends Exception { }

class Vehicle {
	void ride() throws FuelNotAvailException { 	//line n1
		System.out.println("Happy Journey!");
	}
}

class SolarVehicle extends Vehicle {
	public void ride() throws Exception{	//line n2
		super.ride();
	}
}

public class Test {
	public static void main(String[] args) {
		
	}

}
