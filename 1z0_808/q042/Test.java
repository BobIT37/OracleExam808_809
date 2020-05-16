package com.wealth.certificate.dumps_1z0_808.question042;

public class Test
{
	public static void main(String[] args)
	{
		String color = "teal";
		
		switch (color) // switch(String) in JDK 7
		{
			case "Red":
				System.out.println("Found Red");
			case "Blue":
				System.out.println("Found Blue");
				break;
			case "Teal":
				System.out.println("Found Teal");
				break;
			default: /** Answered : B is incorrect, E is correct **/
				System.out.println("Found Default"); // Because switch string is case sensitive
		}
	}
}
