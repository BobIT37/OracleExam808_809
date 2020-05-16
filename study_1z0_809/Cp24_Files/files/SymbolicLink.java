package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class SymbolicLink {
	public static void main(String[] args) {
		try {
			Path in = Paths.get(ReadFile.getCurrentPath() + "\\temp\\softlink.txt");
			Path out = Paths.get(ReadFile.getCurrentPath() + "\\temp\\copySoftlink.txt");
			
			System.out.println("exists : " + Files.exists(in,LinkOption.NOFOLLOW_LINKS));
			Path result = Files.copy(in, out, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
