package com.wealth.certificate.dumps_1z0_809.question123;

public class Msg {
	
	public static String doMsg(char x) {
		return "Good Day!";
	}
	
	public static String doMsg(int y) {
		return "Good luck!";
	}

	public static void main(String[] args)
	{
		char x = 8;
		int z = '8';
		
		System.out.println(doMsg(x));
		System.out.print(doMsg(z));
	}
}
