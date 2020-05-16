package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetNameRelative {
	
	public static void main(String[] args) {
		Path path = Paths.get("dir1\\file.txt");// Or dir1/file.txt
		System.out.println("toString(): " + path.toString());
		System.out.println("getFileName(): " + path.getFileName());
		System.out.println("getNameCount(): " + path.getNameCount());
		System.out.println("getName(0): " + path.getName(0));
		System.out.println("getName(1): " + path.getName(1));
		System.out.println("subpath(0,2): " + path.subpath(0, 2));
		System.out.println("getParent(): " + path.getParent());
		System.out.println("getRoot(): " + path.getRoot());
	}
	
}
