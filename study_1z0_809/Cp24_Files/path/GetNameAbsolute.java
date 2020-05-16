package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetNameAbsolute {
	
	public static void main(String[] args) {
		Path path = Paths.get("C:\\temp\\dir1\\file.txt");
		// Or Path path = Paths.get("/temp/dir1/file.txt");
		System.out.println("toString(): " + path.toString());
		System.out.println("getFileName(): " + path.getFileName());
		System.out.println("getNameCount(): " + path.getNameCount());
		// Indexes start from zero
		System.out.println("getName(0): " + path.getName(0));
		System.out.println("getName(1): " + path.getName(1));
		System.out.println("getName(2): " + path.getName(2));
		// subpath(beginIndex, endIndex) from beginIndex to endIndex-1
		System.out.println("subpath(0,2): " + path.subpath(0, 2));
		System.out.println("getParent(): " + path.getParent());
		System.out.println("getRoot(): " + path.getRoot());
		
		//invalid index
		System.out.println("getName(3): " + path.getName(3));
	}
	
}
