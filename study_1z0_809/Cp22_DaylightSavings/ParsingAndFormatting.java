package com.wealth.certificate.study_1z0_809.chapter22;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

public class ParsingAndFormatting {

	public static void main(String[] args) {
		
		LocalDate ldt = LocalDate.of(2015, 1, 20);
		
		System.out.println("---------predefined formatter---------");
		System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(ldt));//DateTimeFormatter 
		System.out.println(LocalDate.parse("2015-01-20"));//CharSequence 
		System.out.println(LocalDate.parse("2015-01-20", DateTimeFormatter.ISO_DATE));//CharSequence, DateTimeFormatter
		
		System.out.println("---------Locale-specific formatters---------");
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		// With the current locale
		System.out.println(formatter.format(ldt));
		System.out.println(ldt.format(formatter));
		// With another locale
		System.out.println( formatter.withLocale(Locale.GERMAN).format(ldt));
		
		System.out.println("---------custom pattern---------");
		DateTimeFormatter formatterC = DateTimeFormatter.ofPattern("QQQQ Y");
		// With the current locale
		System.out.println(formatterC.format(ldt));
		System.out.println(ldt.format(formatterC));
		// With another locale
		System.out.println(formatter.withLocale(Locale.GERMAN).format(ldt));
		
		System.out.println("-----parse a date and/or time----");
		
		// Format according to ISO-8601
		String str1 = "2015-06-29T14:45:30";
		// Custom format
		String str2 = "2015/06/29 14:45:30";
		LocalDateTime ldt2 = LocalDateTime.parse(str1);//***
		System.out.println("format str1: "+ldt2);
		
		// Using DateTimeFormatter
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		// LocalDateTime returns an instance of the same type
		ldt2 = LocalDateTime.parse(str2, formatter2);//***
		System.out.println("format str2: "+ldt2);
		
		
		
		

	}

}
