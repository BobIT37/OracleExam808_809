package com.wealth.certificate.study_1z0_809.chapter30;

import java.util.Arrays;
import java.util.Locale;

public class LocalizeEx01 {
	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println("The default locale is: " + Locale.getDefault());
		Locale [] locales = Locale.getAvailableLocales();
		System.out.printf("No. of other available locales is: %d, and they are: %n",
		        locales.length);
		Arrays.stream(locales).forEach(loc -> System.out.printf("Locale code: %s and it stands for %s %n", loc, loc.getDisplayName()));
		System.out.println("--------------");
		Arrays.stream(Locale.getAvailableLocales())
        .filter(loc -> loc.getLanguage().equals("en"))
        .forEach(loc ->
                System.out.printf("Locale code: %s and it stands for %s %n",
                		loc, loc.getDisplayName()));
		System.out.println("--------------");
		System.out.println("Country Code: "+ locale.getCountry());
		System.out.println("Country Name: " + locale.getDisplayCountry());
		System.out.println("Language Code: " + locale.getLanguage());
		System.out.println("Language Name: " + locale.getDisplayLanguage());

	}
}
