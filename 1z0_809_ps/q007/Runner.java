package com.wealth.certificate.dumps_1z0_809_ps.question007;

class Runner implements Runnable {
	String str;

	public Runner(String s) {
		this.str = s;
	}

	public void run() {
		System.out.println(str.concat("Runner "));
	}

}