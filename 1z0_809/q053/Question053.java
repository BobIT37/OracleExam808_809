package com.wealth.certificate.dumps_1z0_809.question053;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Question053 {

	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get(getCurrentPath() +"/data/december/log.txt");
		Path destination = Paths.get(getCurrentPath() +"/data");
		Files.copy(source, destination);
//		Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
//		System.out.println(source.toFile().exists());
		

	}
	
	// Not in Question : Addition for get question's properties file path.
	private static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question053";
	}


}
