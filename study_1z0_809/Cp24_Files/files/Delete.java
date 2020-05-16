package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

//delete
public class Delete {
	
	public static void main(String[] args) {
		try {
			Files.delete(Paths.get("/temp/dir1/file.txt"));
			Files.delete(Paths.get("/temp/dir1"));
		} catch (NoSuchFileException nsfe) {
			// If the file/directory doesn't exists
			nsfe.printStackTrace();
		} catch (DirectoryNotEmptyException dnee) {
			// To delete a directory, it must be empty, otherwise, this exception is thrown
			dnee.printStackTrace();
		} catch (IOException ioe) {
			// File permission or other problems
			ioe.printStackTrace();
		}
		
		try {
		    boolean deleteIfExists = Files.deleteIfExists(Paths.get("/temp/dir1/file.txt"));
		    System.out.println("deleteIfExists : " + deleteIfExists);
		} catch (DirectoryNotEmptyException dnee) {
		    // To delete a directory, it must be empty,
			dnee.printStackTrace();
		} catch (IOException ioe) {
		    // File permission or other problems
			ioe.printStackTrace();
		}
	}
	
}
