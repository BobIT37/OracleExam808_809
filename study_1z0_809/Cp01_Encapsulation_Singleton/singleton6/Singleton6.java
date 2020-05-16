
package com.wealth.certificate.study_1z0_809.chapter01.singleton6;

public class Singleton6 {

}

class Singleton {
	//use the volatile keyword, which guarantees that any read/write operation of a variable shared by many threads would be atomic and not cached.
	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

//http://tutorials.jenkov.com/java-concurrency/volatile.html