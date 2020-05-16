package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class StartWithPath {
	
	public static void main(String[] args) {
		Path absPath = Paths.get("c:\\temp\\dir1\\file.txt");
		Path relPath = Paths.get("temp\\dir1\\file.txt");

		// boolean startsWith(Path other)
		System.out.println(absPath.startsWith(Paths.get("c:\\temp\\file.txt"))); 		// false
		System.out.println(absPath.startsWith(Paths.get("c:\\temp\\dir1\\img.jpg"))); 	// false
		System.out.println(absPath.startsWith(Paths.get("c:\\temp\\dir1\\"))); 			// true
		System.out.println(absPath.startsWith(relPath)); 								// false

		// boolean startsWith(String other)
		System.out.println(relPath.startsWith("t")); 			// false
		System.out.println(relPath.startsWith("temp")); 		// true
		System.out.println(relPath.startsWith("temp\\d")); 		// false
		System.out.println(relPath.startsWith("temp\\dir1")); 	// true

		// boolean endsWith(Path other)
		System.out.println(absPath.endsWith(Paths.get("file.txt"))); 					// true
		System.out.println(absPath.endsWith(Paths.get("d:\\temp\\dir1\\file.txt"))); 	// false
		System.out.println(relPath.endsWith(absPath)); 									// false

		// boolean endsWith(String other)
		System.out.println(relPath.endsWith("txt")); 				// false
		System.out.println(relPath.endsWith("file.txt")); 			// true
		System.out.println(relPath.endsWith("\\dir1\\file.txt")); 	// false
		System.out.println(relPath.endsWith("dir1\\file.txt")); 	// true
		System.out.println(absPath.endsWith("dir1\\file.txt")); 	// true
	}
	
}
