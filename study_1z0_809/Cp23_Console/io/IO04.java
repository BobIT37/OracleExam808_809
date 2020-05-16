package com.wealth.certificate.study_1z0_809.chapter23.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//FileWriter
public class IO04 {
	
	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/output.txt");
		try (Writer w = new FileWriter(file)) {
		    w.write('-'); 						// writing a character
		    w.write("Writing to the file...");
		    w.flush();
		} catch(IOException e) { /** ... */ }
	}

}
