package com.wealth.certificate.dumps_1z0_809_ert.question005;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class App {
	
	private static final Path PATH = Paths.get(System.getProperty("user.dir"), "src", "main", "java", "com","wealth","certificate","dumps_1z0_809_ert","question005");		
			
	public static void main(String[] args) throws IOException {
		
		/*
		 * Using <Path>.resolve instead of Path.get to locate customers.txt dues to file is accessible
		 */
		
//		A.
//		Stream<Path> stream = Files.list(PATH.resolve("customers.txt"));
//		stream.forEach(c -> System.out.println(c));
		
//		B.
//		Stream<String> lines = Files.lines(PATH.resolve("customers.txt"));
//		lines.forEach(c -> System.out.println(c));
		
//		C.
//		Stream<Path> stream = Files.find(PATH.resolve("customers.txt"));
//		stream.forEach(c -> System.out.println(c)); 
		
//		D.
//		Stream<String> stream = Files.find(PATH.resolve("customers.txt"));
//		stream.forEach(c -> System.out.println(c)); 

	}

}
