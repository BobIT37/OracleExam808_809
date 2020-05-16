package com.wealth.certificate.dumps_1z0_809_ps.question050;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Question050 {

	public static void main(String[] args) throws IOException {
		BufferedReader brCopy = null;
		try (BufferedReader br = new BufferedReader (new FileReader(getCurrentPath() + "/resources/employee.txt"))) { //line n1
			br.lines().forEach(c -> System.out.println(c));
			brCopy = br;//line n2
		}
		brCopy.ready(); //line n3;
	}
	
	// Not in Question : Addition for get question's properties file path.
	private static String getCurrentPath()
	{
		return System.getProperty ("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809_ps/question050";
	}

}
