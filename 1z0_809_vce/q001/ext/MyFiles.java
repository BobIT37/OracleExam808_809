package com.wealth.certificate.dumps_1z0_809_vce.question001.ext;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import com.wealth.certificate.dumps_1z0_809_vce.question001.PathsUtils;

public class MyFiles {

	public static void main(String[] args) {
		System.out.println("----- list -----");
		Path dir = PathsUtils.getPathFromClass(MyFiles.class, "sub1/");
		Path file = PathsUtils.getPathFromClass(MyFiles.class, "sub1/a.txt");
		
		
		System.out.println(dir);
		try {
			Stream<Path> dirList = Files.list(dir);		
			dirList.forEach( (p)->System.out.println(p));		
			
			System.out.println("----- walk -----");
			Stream<Path> dirWalk = Files.walk(dir);		
			dirWalk.forEach( (p)->System.out.println(p));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("----- readAllLines -----");		
		try {
			List<String> content = Files.readAllLines(file);
			content.stream().forEach(p->{System.out.println(p);});
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("----- lines -----");
		try {
			Stream<String> fc = Files.lines(file);
			fc.forEach(p->{System.out.println(p);});
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		
	}

}
