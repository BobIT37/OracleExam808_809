package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.nio.file.Path;
import java.nio.file.Paths;

//Combine two paths
public class ResolvePath {

	public static void main(String[] args) {
		//second path that doesn't have a root element (a partial path), the second path is appended
		Path path = Paths.get("/temp");
		System.out.println(path.resolve("newDir")); // \temp\newDir
		
		//If we have a partial or relative path, and we want to combine it with an absolute path, 
		//this absolute path is returned
		System.out.println(path.resolve("/newDir")); // \newDir
		
		Path path2 = Paths.get("temp");
		System.out.println(path2.resolve("newDir")); // temp\newDir
		System.out.println(path2.resolve("/newDir")); // \newDir
	}
	
}
