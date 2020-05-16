package com.wealth.certificate.study_1z0_809.chapter30.selftest;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test01 {
	public static void main(String[] args) {
		Locale locale = new Locale("", "");
        ResourceBundle rb = ResourceBundle.getBundle("Bundle1", locale);
        System.out.println(rb.getString("key1"));
	}
}

//1. The correct answer is A.