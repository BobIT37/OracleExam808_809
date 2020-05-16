package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.concurrent.TimeUnit;

//FileTime
public class FileTime01 {
	
	public static void main(String[] args) {
		try {
		Path path = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir1\\file.txt");
		FileTime fileTime = Files.getLastModifiedTime(path);
		System.out.println("getLastModifiedTime : " + fileTime);
		
		Files.setLastModifiedTime(path, FileTime.from(fileTime.toInstant()));
		System.out.println("from(Instant instant) : " + Files.getLastModifiedTime(path));
		
		Files.setLastModifiedTime(path, FileTime.from(5, TimeUnit.DAYS));
		System.out.println("from(long value, TimeUnit unit) : " + Files.getLastModifiedTime(path));
		
		Files.setLastModifiedTime(path, FileTime.fromMillis(fileTime.toMillis() + 1000));
		System.out.println("fromMillis(long value) : " + Files.getLastModifiedTime(path));
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
