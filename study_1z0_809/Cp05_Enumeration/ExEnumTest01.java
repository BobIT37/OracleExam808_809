package com.wealth.certificate.study_1z0_809.chapter05;

public class ExEnumTest01 {
	enum PrinterType {
	    DOTMATRIX, INKJET, LASER
	}
	
	enum PrinterType2 {
		LASER, INKJET
	}

	PrinterType printerType;

	public ExEnumTest01(PrinterType pType) {
	        printerType = pType;
	    }

	public void feature() {
	        switch(printerType){
	        case DOTMATRIX:
	                System.out.println("Dot-matrix printers");
	                break;
	        case INKJET:
	                System.out.println("Inkjet printers");
	                break;
	        case LASER:
	                System.out.println("Laser printers");
	                break;
	        }
	}

	public static void main(String[] args) {
		
		PrinterType type = PrinterType.DOTMATRIX; // equivalent to invoke the name() : PrinterType.DOTMATRIX.name()
		// ==
		System.out.println("type:: "+ type); // DOTMATRIX 
		System.out.println(type == PrinterType.DOTMATRIX); // true
		
		// equals
		System.out.println(type.equals(PrinterType.DOTMATRIX)); // true
		if(PrinterType.LASER.equals(PrinterType2.LASER)) { // false
            System.out.println(1);
        } else {
            System.out.println(0);
        }
		
		PrinterType type2 = PrinterType.valueOf("LASER");
		System.out.println("type2:: "+ type2);
		
		//PrinterType type3 = PrinterType.valueOf("DotmatriX"); // Run-time exception
		
		System.out.println(PrinterType.INKJET.name());
		// in other words 
		System.out.println(PrinterType.INKJET.toString());

		
		ExEnumTest01 enumTest = new ExEnumTest01(PrinterType.LASER);
		enumTest.feature();
		
	}
}
