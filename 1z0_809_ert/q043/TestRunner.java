package com.wealth.certificate.dumps_1z0_809_ert.question043;

public class TestRunner {
	public static void check(Runner r) {
		System.out.println(r.getClass());
		System.out.println(r instanceof Vehicle);
		if (r instanceof Vehicle) {
			Vehicle v = (Vehicle) r;
			System.out.println(v.getClass());
			v.start();
		}
	}

	public static void main(String[] args) {
		Runner v = new Car();
		check(v);
	}
}