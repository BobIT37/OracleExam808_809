package com.wealth.certificate.dumps_1z0_809_ps.question028;

import java.util.Set;
import java.util.TreeSet;

class Vehicle {
	int vno;
	String name;
	public Vehicle (int vno, String name) {
		this.vno = vno;
		this.name = name;
	}
	public String toString () {
		return vno + ":" + name;
	}
}

public class Test
{
	public static void main(String[] args)
	{
		Set<Vehicle> vehicles = new TreeSet <> ();
		vehicles.add(new Vehicle (10123, "Ford"));
		vehicles.add(new Vehicle (10124, "BMW"));
		System.out.println(vehicles);
		
		/** Answered : B is incorrect, Correct is D because using TreeSet so Vehicle must implements Comparable. **/
	}
}
