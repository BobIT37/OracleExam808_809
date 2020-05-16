package com.wealth.certificate.dumps_1z0_809_ps.question007;

import java.util.concurrent.Callable;

class Caller implements Callable<String> {

	String str;

	public Caller(String s) {
		this.str = s;
	}

	public String call() throws Exception {
		return str.concat("Caller ");
	}
	
}


