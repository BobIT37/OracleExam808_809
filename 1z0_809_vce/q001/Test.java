package com.wealth.certificate.dumps_1z0_809_vce.question001;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {
		
		Path file = PathsUtils.getPathFromClass(Test.class, "courses.txt");
		
		// line n1
		
		// A
		//List<String> fc = Files.list(file);
		//fc.stream().forEach (s-> System.out.println(s));
		
		// B
		//Stream<String> fc = Files.readAllLines(file);
		//fc.forEach (s-> System.out.println(s));
				
		// C
		//List<String> fc = readAllLines(file);
		//fc.stream().forEach (s-> System.out.println(s));
		
		// D
		Stream<String> fc = Files.lines(file);
		fc.forEach (s-> System.out.println(s));
		
	}

}
