package com.wealth.certificate.study_1z0_809.chapter04_Interface.staticMethod;

interface Parallelizable {
	static void log(String s) {
		System.out.println(s);
	}

	default void processInParallel() {
		log("Parallelizable parallel");
	}
}

public class Task implements Parallelizable {
	static void log(String s) { //hiding
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		Task t = new Task();
		t.processInParallel();
		// t.log("The end"); Doesn't compile
		// Task.log("The end"); Doesn't compile either
		Parallelizable.log("The end"); // Compiles!
	}
}