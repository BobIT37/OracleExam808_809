package com.wealth.certificate.study_1z0_809.chapter30.listresourcebundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {
	public static void main(String[] args) {
        Locale spain = new Locale("es", "ES");
        Locale spanish = new Locale("es");

        ResourceBundle rb =
            ResourceBundle.getBundle("MyBundle", spain);
        System.out.format("%s %s\n",
            rb.getString("hi"), rb.getString("s"));

        rb = ResourceBundle.getBundle("MyBundle", spanish);
        System.out.format("%s %s\n",
            rb.getString("hi"), rb.getString("s"));
    }
}

