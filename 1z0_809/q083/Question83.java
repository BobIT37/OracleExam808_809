package com.wealth.certificate.dumps_1z0_809.question083;

public class Question83 {
	// D. Use a static reference to point to the single instance.
	private static Question83 instance = null;

	// B. Make the constructor private.
	private Question83() {
		// Exists only to defeat instantiation.
	}

	public static Question83 getInstance() {
		if (instance == null) {
			instance = new Question83();
		}
		return instance;
	}
}
