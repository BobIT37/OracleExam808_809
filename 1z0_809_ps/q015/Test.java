package com.wealth.certificate.dumps_1z0_809_ps.question015;


@FunctionalInterface
interface Rideable {
	Car getCar(String name); // --> 1 arg and 1 return is Function
}

class Car {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
}

public class Test {

	public static void main(String[] args) {
		
		// Car auto = Car("MyCar")::new;				// A

		//Car auto = Car::new;
		//Car vehicle = auto::getCar("MyCar");			// B

		Rideable rider = Car::new;
		Car vehicle = rider.getCar("MyCar");			// C

		//Car vehicle = Rideable::new::getCar("MyCar"); // D
				
	}

}
