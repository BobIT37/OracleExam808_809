package com.wealth.certificate.dumps_1z0_809_ps.question038;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream (getCurrentPath() + "/resources/Message.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1"));
		System.out.println(prop.getProperty("welcome2", "Test"));//line n1
		System.out.println(prop.getProperty("welcome3"));
		
		/** Answered : D is incorrect, Correct is C **/
		/* Print :
		 * Good day!
		 * Test
		 * null
		 */
	}
	
	// Not in Question : Addition for get question's properties file path.
	private static String getCurrentPath()
	{
		return System.getProperty ("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question014";
	}
}
