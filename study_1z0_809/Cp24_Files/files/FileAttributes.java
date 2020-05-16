package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

//FileAttribute
public class FileAttributes {
	
	public static void main(String[] args) {
		try {
			Path path = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir1\\in.txt");
			BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);

			FileTime lastModifiedTime = FileTime.from(Instant.now());
			FileTime lastAccessTime = FileTime.from(Instant.now());
			FileTime createTime = FileTime.from(Instant.now());

			// If any argument is null,
			// the corresponding value is not changed
			view.setTimes(lastModifiedTime, lastAccessTime, createTime);
			
			// Get a class with read-only attributes
			BasicFileAttributes readOnlyAttrs = view.readAttributes();

			// read-only versions of the file views
			BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
			// Size in bytes
			System.out.println("size(): " + attr.size());
			// Unique file identifier (or null if not available)
			System.out.println("fileKey(): " + attr.fileKey());

			System.out.println("isDirectory(): " + attr.isDirectory());
			System.out.println("isRegularFile(): " + attr.isRegularFile());
			System.out.println("isSymbolicLink(): " + attr.isSymbolicLink());
			// Is something other than a file, directory, or symbolic link?
			System.out.println("isOther(): " + attr.isOther());

			// The following methods return a FileTime instance
			System.out.println("creationTime(): " + attr.creationTime());
			System.out.println("lastModifiedTime():" + attr.lastModifiedTime());
			System.out.println("lastAccessTime(): " + attr.lastAccessTime());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
} 
