package com.wealth.certificate.dumps_1z0_808.question114;

public class CharToStr {
	public static void main(String[] args) {
		String str1 = "Java";
		char str2[] = {'J', 'a', 'v', 'a'};
		String str3 = null;
		for (char c : str2) {
			str3 = str3 + c;
		}
		if (str1.equals(str3))
			System.out.print("Successful");
		else
			System.out.print("Unsuccessful");
	}
}

/*
What is result?
A. Successful
B. Unsuccessful
C. Compilation fails
D. An exception is thrown at runtime
*/
//Answer: C
/*
Explanation:
	str3 will equal to "nullJava", so it not equal str1 which is "Java"
*/