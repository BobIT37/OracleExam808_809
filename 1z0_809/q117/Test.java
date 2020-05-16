package com.wealth.certificate.dumps_1z0_809.question117;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		int i;
		char c;
		
		try ( FileInputStream fis = new FileInputStream("courses.txt");
//			  FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/wealth/certificate/dumps_1z0_809/question117/courses.txt");
			  InputStreamReader isr = new InputStreamReader(fis); ) {
			while(isr.ready())	// line n1
			{
				isr.skip(2);
				i = isr.read();
				c = (char) i;
				System.out.print(c);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
