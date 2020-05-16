package com.wealth.certificate.study_1z0_809.chapter05;

public class ExEnumTest02 {

	public static void main(String[] args) {
		System.out.println(Volume.HIGH);
		System.out.println(Volume.LOW.ordinal());
		
//		// Use Volume.HIGH.ordinal()
//		if(Volume.HIGH == 0) {
//			
//		}
//		// Use Volume.HIGH.getValue()
//		if(Volume.HIGH == 100) {
//		   
//		}

		for (Volume v : Volume.values()) {
			System.out.println(v.name() + " " + v.ordinal() + v.getValue());
		}

		for (Volume v : Volume.values()) {
			System.out.print(v + ", ");
			switch (v) {
			case HIGH:
				System.out.println(1);
				break;
			case MEDIUM:
				System.out.println(2);
				break;
			case LOW:
				System.out.println(3);
				break;
			}
		}
		Volume.LOW.printDescription();
		Volume.LOW.printValue();
		Volume.HIGH.printValue();
	}

}
