package com.wealth.certificate.dumps_1z0_809_ert.question023;

class MyClass implements AutoCloseable {
	int test;

	public void close() { }

	public MyClass copyObject() {
		return this;
	}
	
	public static void main(String[] args) {

		MyClass obj = null;
		try (MyClass obj1 = new MyClass()) {
			obj1.test = 100;
			obj = obj1.copyObject(); // line n1 

		}
		
		System.out.println(obj.test); //line n2 
	}
	
}
