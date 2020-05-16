package com.wealth.certificate.dumps_1z0_808.question126;

class Alpha {
	int ns; 			// instance field, type int default value = 0
	static int s; 	// static field, type int default value = 0
						// static field live much longer then instance fields.
						// static field is only suppose to be shared among every single instance
	Alpha(int ns) {
		if (s < ns) {
			s = ns;
			this.ns = ns;
		}
	}
	void doPrint() {
		System.out.println("ns = " + ns + " s = " + s);
	}
}

public class TestA 
{
	public static void main(String[] args) {
		Alpha ref1 = new Alpha(50);
		Alpha ref2 = new Alpha(125);
		Alpha ref3 = new Alpha(100);
		ref1.doPrint(); // ns = 50 s = 125
		ref2.doPrint(); // ns = 125 s = 125
		ref3.doPrint(); // ns = 0 s = 125
	/** Answered : B is correct **/
	}
}