package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//newBufferedReader
public class Readline {
	
	public static void main(String[] args) {
		Path path = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir1\\file.txt");
		
		// By default it uses StandardCharsets.UTF_8
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.ISO_8859_1)) {
			String line = null;
			while ((line = reader.readLine()) != null)
				System.out.println(line);
		} catch (IOException e) {

		}
	}
	
}
