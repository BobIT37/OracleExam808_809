package com.wealth.certificate.dumps_1z0_809_vce.question049;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		/*A.*/ /*Locale loc1 = "UK";*/
		/*B.*/ /*Locale loc2 = Locale.getInstance("ru");*/
		/*C.*/ /*Locale loc3 = Locale.getLocaleFactory("RU");*/
		/*D.*/ Locale loc4 = Locale.UK;
		/*E.*/ Locale loc5 = new Locale ("ru", "RU");
		
		/*Locale locale = Locale.getDefault();
		System.out.println(locale);*/
		
		//en is language and lowercase
		//US is country and uppercase
		
		/*US*/ // can have a language without a country, but not the reverse
		/*enUS*/ // missing underscore
		/*US_en*/ // the country and language are reversed
		/*EN*/ // language must be lowercase
	}

}
