package com.wealth.certificate.dumps_1z0_809_ps.question092;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question092 {

	public static void main(String[] args) {
		Stream<Path> paths = Stream.of (Paths.get(getCurrentPath()+"/resources/data.doc"),
										Paths.get(getCurrentPath()+"/resources/data.txt"),
										Paths.get(getCurrentPath()+"/resources/data.xml"));
		//edit endWith -> endsWith
		paths.filter(s-> s.toString().endsWith("txt"))
				.forEach(s -> {
					try {
						Files.readAllLines(s).stream().forEach(System.out::println); //line n1
					} catch (IOException e) {
						System.out.println("Exception"); 
					}
				}
		);
	}
	
	// Not in Question : Addition for get question's properties file path.
	private static String getCurrentPath()
	{
		return System.getProperty ("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809_ps/question092";
	}

}
