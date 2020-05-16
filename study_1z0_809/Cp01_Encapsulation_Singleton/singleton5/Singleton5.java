package com.wealth.certificate.study_1z0_809.chapter01.singleton5;

public class Singleton5 {

}

class Singleton {
	private static Singleton instance;

	private Singleton() {
	}

	//NOT PERFECT
	//The problem is at the Java Virtual Machine (JVM) level. 
	//The JVM, or sometimes the compiler, can optimize the code by reordering or caching the value of variables (and not making the updates visible).
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
/*
Synchronized

synchronized(this) is synchronized on the current object, so only one thread can access each instance, 
but different threads can access different instances. E.g. you can have one instance per thread.

This is typically useful to prevent multiple threads from updating an object at the same time, which could create inconsistent state.

synchronized(SomeClass.class) is synchronized on the class of the current object ( or another class if one wished) 
so only one thread at a time can access any instances of that class.

This might be used to protect data that is shared across all instances of a class (an instance cache, perhaps) from getting into an inconsistent state .

*/
//https://stackoverflow.com/questions/2056243/java-synchronized-block-for-class
//https://stackoverflow.com/questions/9056190/what-is-the-difference-between-synchronizedthis-and-synchronizedclassname-cla