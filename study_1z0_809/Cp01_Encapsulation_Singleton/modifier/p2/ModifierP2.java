package com.wealth.certificate.study_1z0_809.chapter01.modifier.p2;

public class ModifierP2 {
	public static void main(String[] args) {
		
		//Cannot access in the different package
		ModifierP1 mod1 = new ModifierP1();
		
		//Cannot access in the different package
		Interface1 int1 = new Interface1() {
			
		};
		
		//Can Access in the same package
		Interface2 int2 = new Interface2() {
			
		};
	}
}
