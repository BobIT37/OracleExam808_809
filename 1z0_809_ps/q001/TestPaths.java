package com.wealth.certificate.dumps_1z0_809_ps.question001;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestPaths {

	public static void main(String[] args) {

		System.out.println("Path function");
		Path path = PathsUtils.getPathFromClass(TestPaths.class, "a.txt");
		System.out.println("exists: " + Files.exists(path));
		System.out.println("isDirectory: " + Files.isDirectory(path));		
		System.out.println("isRegularFile: " + Files.isRegularFile(path));
		System.out.println("isSymbolicLink: " + Files.isSymbolicLink(path));		
		System.out.println("toString(): " + path.toString());
		System.out.println("getFileName(): " + path.getFileName());
		System.out.println("getNameCount(): " + path.getNameCount());
		System.out.println("getName(0): " + path.getName(0));
		System.out.println("getName(1): " + path.getName(1));
		System.out.println("subpath(0,2): " + path.subpath(0, 2));
		System.out.println("getParent(): " + path.getParent());
		System.out.println("getRoot(): " + path.getRoot());
		for (Path p : path) {
			System.out.println(p);
		}
		
				
		System.out.println("Relative Path");
		Path a = PathsUtils.getPathFromClass(TestPaths.class, "a.txt");
		Path aa = PathsUtils.getPathFromClass(TestPaths.class, "../question001/a.txt");
				
		System.out.println("a toString(): " + a.toString());
		System.out.println("a exists: " + Files.exists(a));
		System.out.println("aa toString(): " + aa.toString());
		System.out.println("aa exists: " + Files.exists(aa));
		System.out.println("aa normalize toString(): " + aa.normalize().toString());
		System.out.println("aa exists: " + Files.exists(aa.normalize()));
		
		
				
		System.out.println("Symbolic Link");
		Path b = PathsUtils.getPathFromClass(TestPaths.class, "b.txt"); // require permission
		try {
			Files.createSymbolicLink(b, a);
		} catch (IOException e1) {
			System.out.println("Symbolic link already exitsts (skip)");
		}
		
		System.out.println("exists: " + Files.exists(b));
		System.out.println("isDirectory: " + Files.isDirectory(b));		
		System.out.println("isRegularFile: " + Files.isRegularFile(b));
		System.out.println("isSymbolicLink: " + Files.isSymbolicLink(b));		
		try {
			System.out.println("a toString(): " + a.toString());
			System.out.println("b toRealPath(): " + b.toRealPath().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
