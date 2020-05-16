package com.wealth.certificate.study_1z0_809.chapter24.path;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetPath {
	
	public static void main(String[] args) {
		// With an absolute path in windows
		Path pathWin = Paths.get("c:\\temp\\file.txt");
		System.out.println("pathWin : " + pathWin);
		
		// With an absolute path in unix
		Path pathUnix = Paths.get("/temp/file.txt");
		System.out.println("pathUnix : " + pathUnix);
		
		// With a relative path
		Path pathRelative = Paths.get("file.txt");
		System.out.println("pathRelative : " + pathRelative);
		
		//Using the varargs parameter
		// (the separator is inserted automatically)
		Path pathByParts = Paths.get("c:", "temp", "file.txt");
		System.out.println("pathByParts : " + pathByParts);
		
		//use a java.net.URI instance
		try {
		    Path fileURI = Paths.get(new URI("file:///c:/temp/file.txt"));
		    System.out.println("fileURI #1 :" + fileURI);
		} catch (URISyntaxException e) {
		}
		
		//use the static method URI.create(String)
		//It wraps the URISyntaxException exception in an IllegalArgumentException
		Path fileURI = Paths.get(URI.create("file:///c:/temp/file.txt"));
		System.out.println("fileURI #2 : " + fileURI);
		
		//returns the absolute path representation of a Path object
		Path fileURI2 = Paths.get(URI.create("file:///file.txt"));
		System.out.println("URIAbsolutePath : " + fileURI2.toAbsolutePath());
	}
	
}
