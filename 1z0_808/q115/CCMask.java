package com.wealth.certificate.dumps_1z0_808.question115;

class CCMask {
	public static String maskCC(String creditCard) {
		String x = "XXXX-XXXX-XXXX-";
		//line1
		
		//A 	XXXX-XXXX-XXXX-1234-5678-9101-1121
		/*StringBuilder sb = new StringBuilder(creditCard);
		sb.substring(15, 19);
		return x + sb;*/
		
		//B		XXXX-XXXX-XXXX-1121
		//return x + creditCard.substring(15,19);
		
		//C		XXXX-XXXX-XXXX-1121
		/*StringBuilder sb = new StringBuilder(x);
		sb.append(creditCard, 15, 19);
		return sb.toString();*/
		
		//D		XXXX-XXXX-XXXX-1234-5678-9101-1121
		StringBuilder sb = new StringBuilder(creditCard);
		StringBuilder s = sb.insert(0, x);
		return s.toString();
	}	
	public static void main(String[] args) {
		System.out.println(maskCC("1234-5678-9101-1121"));
		
		StringBuilder a = new StringBuilder("aaaa");
		//StringBuilder b = "dsdsd"; //Not Compile
		a.append("c");
		System.out.println(a);
	}
}
