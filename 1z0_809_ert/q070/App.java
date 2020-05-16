package com.wealth.certificate.dumps_1z0_809_ert.question070;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Vehicle> vehicle = Arrays.asList(
				new Vehicle(2, "Car"),
				new Vehicle(3, "Bike"),
				new Vehicle(1, "Truck"));
		
		vehicle.stream()
			// Line n1
			// A
//			.sorted((v1,v2) -> Integer.compare(v1.getVId(), v2.getVId()))
			// B
//			.sorted(Comparator.comparing( (Vehicle v) -> v.getVId() ))
			// C
//			.map(v -> v.getVId())
//			.sorted()
			// D
//			.map(v -> v.getVId())
//			.sorted()
//			.compare(v1.getVId(), v2.getVId())
			.forEach(System.out::print);
	}

}
