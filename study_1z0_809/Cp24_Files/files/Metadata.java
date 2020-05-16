package com.wealth.certificate.study_1z0_809.chapter24.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.UserPrincipal;

//metadata
public class Metadata {
	public static void main(String[] args) {
		Path path = Paths.get(ReadFile.getCurrentPath() + "\\temp\\dir1\\file.txt");
		try {
			//static long size(Path path) throws IOException
			// Returns the size of a file (in bytes).
			System.out.println("size : " + Files.size(path) + " bytes.");

			//static boolean isDirectory(Path path, LinkOption... options)
			// Tests whether a file is a directory.
			System.out.println("isDirectory : " + Files.isDirectory(path));

			//static boolean isRegularFile(Path path, LinkOption... options)
			// Tests whether a file is a regular file.
			System.out.println("isRegularFile : " + Files.isRegularFile(path));

			//static boolean isSymbolicLink(Path path)
			// Tests whether a file is a symbolic link.
			System.out.println("isSymbolicLink : " + Files.isSymbolicLink(path));

			//static boolean isHidden(Path path) throws IOException
			// Tells whether a file is considered hidden.
			System.out.println("isHidden : " + Files.isHidden(path));

			//static FileTime getLastModifiedTime(Path path,LinkOption... options) throws IOException
			//static Path setLastModifiedTime(Path path,FileTime time) throws IOException
			// Returns or updates a file's last modified time.
			FileTime fileTime = Files.getLastModifiedTime(path);
			System.out.println("getLastModifiedTime : " + fileTime);
			Files.setLastModifiedTime(path, fileTime);

			//static UserPrincipal getOwner(Path path, LinkOption... options) throws IOException
			//static Path setOwner(Path path,UserPrincipal owner) throws IOException
			// Returns or updates the owner of the file.
			UserPrincipal owner = Files.getOwner(path);
			System.out.println("getOwner : " + owner);
			Files.setOwner(path, owner);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
