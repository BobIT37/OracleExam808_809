package com.wealth.certificate.dumps_1z0_809.question076;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Test76 {
	public static void main(String[] args) throws IOException {
		Path source = Paths.get(
				getCurrentPath() + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question076/green.txt");
		Path target = Paths.get(
				getCurrentPath() + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question076/colors/yellow.txt");
		
		/*Path target2 = Paths.get(
				getCurrentPath() + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question076/colors/red.txt");*/
		
		Files.move(source, target, StandardCopyOption.ATOMIC_MOVE); // content in yellow.txt replace with content in
																	// green.txt and file green.txt is deleted
		Files.delete(source); // throw java.nio.file.NoSuchFileException
	}

	private static String getCurrentPath() {
		return System.getProperty("user.dir");
	}
}

/*
Given that /green.txt and /colors/yellow.txt are accessible, and the code fragment:

	Path source = Paths.get(“/green.txt);
	Path target = Paths.get(“/colors/yellow.txt);
	Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
	Files.delete(source);

Which statement is true?
A. The green.txt file content is replaced by the yellow.txt file content and the yellow.txt file
is deleted.
B. The yellow.txt file content is replaced by the green.txt file content and an exception is
thrown.
C. The file green.txt is moved to the /colors directory.
D. A FileAlreadyExistsException is thrown at runtime.

Answer: B

Exception in thread "main" java.nio.file.NoSuchFileException: ...\question076\green.txt


Explaination : 
Files.move(source, target, StandardCopyOption.ATOMIC_MOVE)
By default, this method will follow links, throw an exception if the file already exists, and not perform an atomic move.

We can customize this behavior with the following CopyOption enums:

StandardCopyOption.REPLACE_EXISTING
Performs the move when the target already exists. If the target is a symbolic link, only the link itself is moved.
StandardCopyOption.ATOMIC_MOVE
Performs the move as an atomic file operation. If the file system does not support an atomic move, an exception is thrown.

*/