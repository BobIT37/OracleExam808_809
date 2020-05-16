package com.wealth.certificate.exam_1z0_809.question003;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Question0003 {
	public static void main(String[] args) {
		String str = "tests";
		try {
			Files.write(Paths.get(getCurrentPath()  + "/file.txt"), str.getBytes(), StandardOpenOption.APPEND); //I can't remember the filename, This is just example.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String getCurrentPath()
	{
		return System.getProperty ("user.dir") + "/src/main/java/com/wealth/certificate/exam_1z0_809/question003";
	}
}

/*
 * Assume that file.txt is not exist. Ask the result
 * Answer: throw java.nio.file.NoSuchFileException
 * 
 * But If the file.txt is already exist , Text will be appended.
 */
