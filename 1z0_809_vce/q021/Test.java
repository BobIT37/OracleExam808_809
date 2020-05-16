package com.wealth.certificate.dumps_1z0_809_vce.question021;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<Vehicle> vehicles = new TreeSet<>();
		vehicles.add(new Vehicle(10123, "Ford"));
		vehicles.add(new Vehicle(10124, "BWM"));
		System.out.println(vehicles);
		
		//ClassCastException is thrown at run time. because every element in a set much be unique, 
		//any object must be compared with the objects in the set already before it is added

	}

}
