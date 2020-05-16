package com.wealth.certificate.dumps_1z0_809_ert.question060;

public class Txt {
	
	public static void main(String[] args) {
		boolean res = new LengthValidator(){
			public boolean checkLength(String str){
				return str.length()>5 && str.length() < 10;
			}
		}.checkLength("Hello");
	}
}
