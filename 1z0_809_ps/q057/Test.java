package com.wealth.certificate.dumps_1z0_809_ps.question057;

import java.util.Optional;

class Employee {
	Optional<Address> address;

	Employee(Optional<Address> address) {
		this.address = address;
	}

	public Optional<Address> getAddress() {
		return address;
	}

}

class Address {
	String city = "New York";

	public String getCity() {
		return city;
	}

	public String toString() {
		return city;
	}
}

public class Test {

	public static void main(String[] args) {
		Address address = null;
		Optional<Address> addrs1 = Optional.ofNullable(address);
		
		Employee e1 = new Employee(addrs1);
		
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		
		System.out.println(eAddress);
		
	}

}
