package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//copy - stream
public class CopyStream {
	public static void main(String[] args) {
		try (InputStream in = new FileInputStream(ReadFile.getCurrentPath() + "\\temp\\dir1\\in.csv"); 
				OutputStream out = new FileOutputStream(ReadFile.getCurrentPath() + "\\temp\\dir1\\out.csv")) {
			
			Path path = Paths.get("/temp/in.txt");
			// Copy stream data to a file
			Files.copy(in, path);
			// Copy the file data to a stream
			Files.copy(path, out);
			
		} catch (IOException e) {

		}
	}
}
