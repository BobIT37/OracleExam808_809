package com.wealth.certificate.dumps_1z0_809_ert.question043;

interface Runner {
}

abstract class Vehicle {
	abstract void start();
}

class Car extends Vehicle implements Runner {
	public void start() {
		System.out.println(getClass().getName() + " Started");
	}
}
