package com.wealth.certificate.dumps_1z0_809.question075;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Path file = Paths.get("courses.txt");
		
		// Remove comment below to get courses.txt in this package
//		Path file = Paths.get(System.getProperty("user.dir"), "src/main/java/com/wealth/certificate/dumps_1z0_809/question075", "courses.txt");
		
		// line n1
		
		// A
		/*List<String> fc = Files.list(file);
	    fc.stream().forEach(s -> System.out.println(s));*/
		
		// B
		/*Stream<String> fc = Files.readAllLines(file);
	    fc.forEach (s -> System.out.println(s));*/
	    
		// C
		List<String> fc = Files.readAllLines(file);
		fc.stream().forEach(s-> System.out.println(s));
		
		// D
//		Stream<String> fc = Files.list(file);
//	    fc.forEach(s -> System.out.println(s));
	}

}
