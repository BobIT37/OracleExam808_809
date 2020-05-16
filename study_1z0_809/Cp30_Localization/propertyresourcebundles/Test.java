package com.wealth.certificate.study_1z0_809.chapter30.propertyresourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		Locale spain = new Locale("es", "ES");
		Locale spanish = new Locale("es");
		ResourceBundle rb = ResourceBundle.getBundle("MyBundle", spain);
		System.out.format("%s %s\n", rb.getString("hi"), rb.getString("s"));
		rb = ResourceBundle.getBundle("MyBundle", spanish);
		System.out.format("%s %s\n", rb.getString("hi"), rb.getString("s"));

		// if you don't specify a locale, the ResourceBundle class will use the default locale of your system
		ResourceBundle rb2 = ResourceBundle.getBundle("MyBundle");
		System.out.format("%s %s\n", rb2.getString("hi"), rb2.getString("s"));

		// resource bundle with the method keySet():
		ResourceBundle rb3 = ResourceBundle.getBundle("MyBundle", spain);
		Set<String> keys = rb3.keySet();
		keys.stream().forEach(key -> System.out.format("%s %s\n", key, rb3.getString(key))); // String val = (String)rb3.getObject("hi");
	}
}
