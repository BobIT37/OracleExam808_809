package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {
	
	public static void main(String[] args) {
		Path absPath = Paths.get(getCurrentPath() + "\\temp\\dir1\\file.txt");
		System.out.println("exists : " + Files.exists(absPath));
		System.out.println("notExists : " + Files.notExists(absPath));
		System.out.println("isReadable : " + Files.isReadable(absPath));
		System.out.println("isWritable : " + Files.isWritable(absPath));
		System.out.println("isExecutable : " + Files.isExecutable(absPath));
		
		//If cannot find files, throws java.nio.file.NoSuchFileException
		Path absPath2 = Paths.get(getCurrentPath() + "\\temp\\dir1\\file.txt");
		try {
			System.out.println("isSameFile : " + Files.isSameFile(absPath, absPath2));
			
			//To read a file, we can load the entire file into memory (only useful for small files) 
			byte[] bytes = Files.readAllBytes(absPath);
			
			List<String> readAllLines = Files.readAllLines(absPath);
			System.out.println("readAllLines : " + readAllLines);
			
			List<String> readAllLinesCharset = Files.readAllLines(absPath, StandardCharsets.UTF_8);
			System.out.println("readAllLinesCharset : " + readAllLinesCharset);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/study_1z0_809/chapter24/files";
	}
}
