package com.wealth.certificate.study_1z0_809.chapter01.singleton4;

public class Singleton4 {

}

class Singleton {
	private static Singleton instance;

	private Singleton() {
		
	}
	// Not Efficient
	// We only need synchronization the first time, when the instance is created, not every single time the method is called.
	// Synchronize the method so only one thread at a time can access it.
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}