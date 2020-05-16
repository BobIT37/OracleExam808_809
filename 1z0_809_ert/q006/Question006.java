package com.wealth.certificate.dumps_1z0_809_ert.question006;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Question006 {
	public static void main(String [] args){
		Locale currentlocale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
		//Locale currentlocale = new Locale("FR", "fr");
		ResourceBundle messages = ResourceBundle.getBundle(getCurrentPath()+".MessagesBundle", currentlocale);
		Enumeration<String> names = messages.getKeys();
		while(names.hasMoreElements()){
		String key = names.nextElement();
		String name = messages.getString(key);
		System.out.println(key + " – " + name);
		}
	}
	
	private static String getCurrentPath()
	{
		return "com.wealth.certificate.dumps_1z0_809_ert.question006";
	}

}
