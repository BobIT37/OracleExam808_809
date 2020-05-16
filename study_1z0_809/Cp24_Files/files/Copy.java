package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

//copy
public class Copy {
	
	public static void main(String[] args) {
		try {
			Path in = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir1\\in.txt");
			Path out = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir2\\out.txt");
			
			Path result = Files.copy(in, out, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Path in = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir3");
			Path out = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir5");
			
			Path result = Files.copy(in, out, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
