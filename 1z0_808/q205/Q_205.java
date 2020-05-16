package com.wealth.certificate.dumps_1z0_808.question205;

class CD {
	int r;

	CD(int r) {
		this.r = r;
	}
}

class DVD extends CD {
	int c;

	// Implicit super constructor CD() is undefined. Must explicitly invoke another constructor
	DVD(int r, int c) {
		// line n1
		//A
		//super.r = r;
		//this.c = c;
		
		//B
		//super(r);
		//this(c); //Constructor call must be the first statement in a constructor
		
		//C
		super(r);
		this.c = c;
		
		//D
		//this.c = r;
		//super(c); //Constructor call must be the first statement in a constructor
	}
}

public class Question205 {

	public static void main(String[] args) {
		DVD dvd = new DVD(10,20);
	}

}
