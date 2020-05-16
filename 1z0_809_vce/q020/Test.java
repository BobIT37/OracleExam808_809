package com.wealth.certificate.dumps_1z0_809_vce.question020;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
		files.forEach(fName -> { // line n1
			try {
				Path aPath = fName.toAbsolutePath(); // line n2
				System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		});
	}
}

/*
What is the result?

A. All files and directories under the home directory are listed with their attributes.
B. A compilation error occurs at line n1. 
C. The files in the home directory are listed along with their attributes . 
D. A Compilation O error CC URS Line AT N2.

Answer A
"System.getProperty("user.home") will get the user's home directory path. The get method of the Paths class can be passed to a path string object or a URI object to generate a Path object. Files method of the walk method can produce a stream object, in order to visit the depth of the first visit to the path of the file represented by the file directory.

So option A is the correct answer.*/
