package com.wealth.certificate.dumps_1z0_808.question216;

class Caller{
	private void init() {
		System.out.println("Initializeed");
	}
	
	public void start() {
		init();
		System.out.println("Started");
	}
}
public class TestCall {

	public static void main(String[] args) {
		Caller c = new Caller();
		c.start();
		//c.init();
	}
}
