package com.wealth.certificate.dumps_1z0_809_ps.question058;

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
			default:
				System.out.println("Found Default"); // Because switch string is case sensitive
		}
	}
}

/*

What is the result?
A. Found Red
Found Default
B. Found Teal
C. Found Red
Found Blue
Found Teal
D. Found Red
Found Blue
Found Teal
Found Default
E. Found Default

Answer: E

*/