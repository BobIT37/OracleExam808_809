package com.wealth.certificate.dumps_1z0_808.question043;

public class AccessModifyConstructor {

	private AccessModifyConstructor() {
		System.out.println("Private constructor.");
	}
	
	AccessModifyConstructor(int x) {
		this();
	}

	protected AccessModifyConstructor(int x , int y) {
		this(x);
	}

	public AccessModifyConstructor(int x , int y , int z) {
		this(x,y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifyConstructor amc = new AccessModifyConstructor(1,2,3);
	}

}
