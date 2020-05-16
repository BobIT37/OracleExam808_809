package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CompareToPath {
	
	public static void main(String[] args) {
		//Path implements the Iterable
		Path path1 = Paths.get("c:\\temp\\dir1\\file.txt");
		for(Path name : path1) {
		    System.out.println(name);
		}
		
		Path path2 = Paths.get("c:\\temp\\dir1\\file.txt");
		
		System.out.println("compareTo : " + path1.compareTo(path2));
		System.out.println("equals : " + path1.equals(path2));
	}

}
