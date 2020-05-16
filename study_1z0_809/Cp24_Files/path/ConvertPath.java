package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConvertPath {
	
	public static void main(String[] args) {
		File file = new File("/file.txt");
		Path path = file.toPath();
		System.out.println("toPath : " + path);

		path = Paths.get("/file.txt");
		file = path.toFile();
		System.out.println("toFile : " + file);
	}
	
}
