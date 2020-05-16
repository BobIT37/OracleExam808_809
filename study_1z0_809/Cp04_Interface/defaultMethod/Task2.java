package com.wealth.certificate.study_1z0_809.chapter04_Interface.defaultMethod;

interface Processable2 {
	void processInSequence();

	default void processInParallel() {
		System.out.println("Processable parallel");
	}
}

interface Parallelizable2 {
	default void processInParallel() {
		System.out.println("Parallelizable parallel");
	}
}

public class Task2 implements Processable2, Parallelizable2 {
	public void processInSequence() {
		System.out.println("Processing in sequence");
	}

	public static void main(String args[]) {
		Task t = new Task();
		t.processInParallel();
	}
}

class Task3 implements Processable2, Parallelizable2 {
	public void processInSequence() {
		System.out.println("Processing in sequence");
	}

	public void processInParallel() {
		System.out.println("Task parallelizable");
	}

	public static void main(String args[]) {
		Task t = new Task();
		t.processInParallel();
	}
}