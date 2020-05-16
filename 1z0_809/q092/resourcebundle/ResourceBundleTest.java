package com.wealth.certificate.dumps_1z0_809.question092.resourcebundle;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundleTest {


	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("===Locale===");
		System.out.println(Locale.GERMAN); // de
		System.out.println(Locale.GERMANY); // de_DE
		System.out.println(new Locale("th")); // th
		System.out.println(new Locale("th", "TH")); // th_TH
		System.out.println();
		
		
		System.out.println("===ResourceBundle read file properties===");
		ResourceBundle bundle1 = ResourceBundle.getBundle(getPackagePath()+".config");
		displayValues(bundle1);
		
		Locale defaultLocale = Locale.getDefault(); //en_US -> en=language , US=country
		ResourceBundle bundle2 = ResourceBundle.getBundle(getPackagePath()+".config", defaultLocale);
		displayValues(bundle2);
		
		Locale.setDefault(new Locale("")); //set new Default
		ResourceBundle bundleDefult = ResourceBundle.getBundle(getPackagePath()+".config");
		displayValues(bundleDefult);
		
		Locale defaultLocale2 = Locale.getDefault();
		ResourceBundle bundleDefult2 = ResourceBundle.getBundle(getPackagePath()+".config", defaultLocale2);
		displayValues(bundleDefult2);

		Locale swedishLocale = new Locale("sv", "SE");
		ResourceBundle bundle3 = ResourceBundle.getBundle(getPackagePath()+".config", swedishLocale);
		displayValues(bundle3);
		
		
		//Stream
		System.out.println("===ResourceBundle With Stream===");
		Set<String> keys = bundle3.keySet();
		keys.stream()
			.map(k -> k + " = " + bundle3.getString(k))
			.forEach(System.out::println);
		
		
		System.out.println();
		//===ResourceBundle With Java Class===
		System.out.println("===ResourceBundle With Java Class===");
		ResourceBundle rb = ResourceBundle.getBundle(getPackagePath()+".Tax", Locale.US);
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
	}
	
	public static void displayValues(ResourceBundle bundle) {
		System.out.println("menu1 message: " + bundle.getString("menu1"));
		System.out.println("menu2 message: " + bundle.getString("menu2"));
		System.out.println();
	}
	
	private static String getPackagePath(){
		return "com.wealth.certificate.dumps_1z0_809.question092.resourcebundle";
	}
}
