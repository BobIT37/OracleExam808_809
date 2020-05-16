package com.wealth.certificate.dumps_1z0_808.question123;


class X {
	public void mX() {
		System.out.println("Xm1");
	}
}

class Y extends X {
	// this is an Override method from X
	public void mX() { 
		System.out.println("Xm2");
	}
	
	public void mY() {
		System.out.println("Ym");

	}
}

class Z extends X {
	public void mZ() {
		System.out.println("Zm");
	}
}

public class Question123 {
	
	public static void main(String[] args) {
		X xRef = new Y();
		Y yRef = (Y) xRef;
		yRef.mY();
		xRef.mX();
		
	}
	
}