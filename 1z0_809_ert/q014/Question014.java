package com.wealth.certificate.dumps_1z0_809_ert.question014;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Question014 {

	public static void main(String[] args) {
		double d = 15;
		Locale l = new Locale("en", "US");
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(l);
		System.out.println(formatter.format(d));
		
		/*
		System.out.println(formatter.getCurrency().getCurrencyCode());
		System.out.println(formatter.getCurrency().getDisplayName());
		System.out.println(formatter.getCurrency().getSymbol());
		*/
		
		/*
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(l);
		dfs.setCurrencySymbol("~");
		dfs.setGroupingSeparator('.');
		dfs.setMonetaryDecimalSeparator('.');
		((DecimalFormat) formatter).setDecimalFormatSymbols(dfs);
		System.out.println(formatter.format(d));
		*/
		
		/*
		Currency.getAvailableCurrencies().stream().forEach(p->System.out.println(p));
		*/
	}

}
