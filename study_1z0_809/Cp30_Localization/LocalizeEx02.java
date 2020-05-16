package com.wealth.certificate.study_1z0_809.chapter30;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class LocalizeEx02 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ITALY);
		Locale currentLocale = Locale.getDefault();
		ResourceBundle resBundle = ResourceBundle.getBundle("PropertyResource", currentLocale);
		System.out.printf(resBundle.getString("Greeting"));


	}
}
