package com.wealth.certificate.study_1z0_809.chapter06.Generic04;

public class GenericMethods {
	 public static <T> void print(T t) {
	        System.out.println(t);
	    }
	 
	public static void main(String[] args) {
		GenericMethods.print(10);
		GenericMethods.<Integer>print(10);
		
		GenericMethods.print("Hi");
		GenericMethods.<String>print("Hi");

	}

}
