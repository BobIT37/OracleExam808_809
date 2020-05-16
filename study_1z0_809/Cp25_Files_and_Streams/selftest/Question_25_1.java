package com.wealth.certificate.study_1z0_809.chapter25_Files_and_Streams.selftest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question_25_1 {
	public static void main(String[] args) {
		try (Stream<Path> stream = Files.walk(Paths.get("/temp"), 0)) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
		}
	}
}
/*
1. Given the following structure and class:

/temp/
   /dir1/
      1.txt
   0.txt
   
What is the result?
A. /temp
B. /temp/dir1
/temp/0.txt
C. /temp/0.txt
D. Nothing is printed


Answer A.
A value of zero for the maxDepth argument means that only the starting directory is visited (no files or subdirectories).


*/