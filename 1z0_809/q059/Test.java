package com.wealth.certificate.dumps_1z0_809.question059;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		Stream<Path> paths = Stream.of (Paths. get("./src/main/java/com/wealth/certificate/dumps_1z0_809/question059/data.doc"),
		Paths. get("./src/main/java/com/wealth/certificate/dumps_1z0_809/question059/data.txt"),
		Paths. get("./src/main/java/com/wealth/certificate/dumps_1z0_809/question059/data.xml"));
		paths.filter(s-> s.toString().endsWith("txt")).forEach(
			s -> {
				try {
					Files.readAllLines(s)
					.stream()
					.forEach(System.out::println); //line n1
				} catch (IOException e) {
					System.out.println("Exception");
				}
			}
		);
	}
}
