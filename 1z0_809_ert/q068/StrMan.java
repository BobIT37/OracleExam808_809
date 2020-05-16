package com.wealth.certificate.dumps_1z0_809_ert.question068;

public class StrMan {
	public static void doStuff(String s) {
		try {
			if (s == null) {
				throw new NullPointerException();
			}
		} finally {
				System.out.println("-finally-");
		}
		System.out.println("-doStuff-");
	}
		
	public static void main(String[] args){
		try{
			doStuff(null);
		} catch (NullPointerException npe) {
			System.out.println("-catch-");
		}
	}
}
