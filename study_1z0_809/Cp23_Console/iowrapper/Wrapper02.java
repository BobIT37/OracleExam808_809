package com.wealth.certificate.study_1z0_809.chapter23.iowrapper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//BufferedWriter
public class Wrapper02 {

	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/output.txt");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("Writing to the file...");
			bw.flush();
		} catch (IOException e) {

		}
	}

}
