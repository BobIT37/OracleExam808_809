package com.wealth.certificate.study_1z0_809.chapter23.printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

public class PrintWriter01 {
	public static void main(String[] args) {
		
		File file = new File(Files01.getCurrentPath() + "/home/printwriter.txt");
		// Opens or creates the file without automatic line flushing
		// and converting characters by using the default character encoding
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.write("Hi"); // Writing a String
			pw.write(100); // Writing a character

			// write the string representation of the argument
			// it has versions for all primitives, char[], String, and Object
			pw.print(true);
			pw.print(10);

			// same as print() but it also writes a line break as defined by
			// System.getProperty("line.separator") after the value
			pw.println(); // Just writes a new line
			pw.println("A new line...");

			// format() and printf() are the same methods
			// They write a formatted string using a format string,
			// its arguments and an optional Locale
			pw.format("%s %d", "Formatted string ", 1);
			pw.printf("%s %d", "Formatted string ", 2);
			pw.format(Locale.GERMAN, "%.2f", 3.1416);
			pw.printf(Locale.GERMAN, "%.3f", 3.1416);
		} catch (FileNotFoundException e) {
			// if the file cannot be opened or created
		}
		
	}
}
