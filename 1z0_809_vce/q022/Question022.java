package com.wealth.certificate.dumps_1z0_809_vce.question022;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Question022 {

	public static void main(String[] args) {
		int i;
		char c;
		try (
				FileInputStream fis = new FileInputStream(getCurrentPath()+"/resources/course.txt");
				InputStreamReader isr = new InputStreamReader(fis);
			) {
			
			while (isr.ready()) { //line n1
				isr.skip(2);
				i = isr.read();
				c = (char) i;
				System.out.print(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Not in Question : Addition for get question's properties file path.
	private static String getCurrentPath()
	{
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809_vce/question022";
	}

}
