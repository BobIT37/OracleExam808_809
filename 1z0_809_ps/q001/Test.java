package com.wealth.certificate.dumps_1z0_809_ps.question001;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Test {

	private static void initialResourceFile() {
		
		//System.out.println("initialResourceFile ...");
		
		Path source = PathsUtils.getPathFromClass(Test.class, "green.txt");
		Path target = PathsUtils.getPathFromClass(Test.class, "colors/yellow.txt");
		try {
			Files.deleteIfExists(source);
		} catch (IOException e) {
			System.out.println("Can't delete source file.");
		}		
		try {
			Files.deleteIfExists(target);
		} catch (IOException e) {
			System.out.println("Can't delete target file.");
		}	
		try {
			Files.createFile(source);
		} catch (IOException e) {
			//System.out.println("Can't create source file.");
		}	
		try {
			Files.createDirectories(target.getParent());
		} catch (IOException e) {
			//System.out.println("Can't create target dir.");
		}	
		try {			
			Files.createFile(target);
		} catch (IOException e) {
			//System.out.println("Can't create target file.");
		}		
	}
	
	public static void main(String[] args) throws IOException {

		initialResourceFile();
		
		// Path source = Paths.get("/green.txt");
		Path source = PathsUtils.getPathFromClass(Test.class, "green.txt");

		// Path target = Paths.get("/colors/yellow.txt");
		Path target = PathsUtils.getPathFromClass(Test.class, "colors/yellow.txt");
		
		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
		Files.delete(source);

	}

}
