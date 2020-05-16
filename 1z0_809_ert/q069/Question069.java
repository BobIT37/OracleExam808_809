package com.wealth.certificate.dumps_1z0_809_ert.question069;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question069 {
	public static void main(String[] args) {
		Path source = Paths.get(getCurrentPath() +"/data/december/log.txt");
		Path destination = Paths.get(getCurrentPath() +"/data/log.txt");
		try {
			Files.copy(source, destination);
			System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809_ert/question069";
	}
}