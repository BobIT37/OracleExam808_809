package com.wealth.certificate.study_1z0_809.chapter23.iowrapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//BufferedReader
public class Wrapper01 {

	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/file.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(file), 1)) {
			String line;
			while ((line = br.readLine()) != null) { // null indicates the end of the file
				System.out.println(line);
			}
		} catch (IOException e) {
		}
	}

}
