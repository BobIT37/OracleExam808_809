package com.wealth.certificate.study_1z0_809.chapter01.singleton3;

public class Singleton3 {

}

class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	// Bad !!!!
	// In a multithreading environment, if two or more threads are executing this method in parallel, 
	// there's a significant risk of ending up with multiple instances of the class
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
			// more code to create the instance...
		}
		return instance;
	}
}