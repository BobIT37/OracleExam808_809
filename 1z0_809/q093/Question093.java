package com.wealth.certificate.dumps_1z0_809.question093;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question093 {

	public static void main(String[] args) throws IOException {
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/wealth/certificate/dumps_1z0_809/question093/employee.txt"))) { // line n1
			br.lines().forEach(c -> System.out.println(c));
			brCopy = br; // line n2
		}
		brCopy.ready(); // line n3;
	}

}