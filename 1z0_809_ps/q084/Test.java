package com.wealth.certificate.dumps_1z0_809_ps.question084;

import java.util.Arrays;

class CheckClass {
	public static int checkValue (String s1, String s2) {
		return s1.length() - s2.length(); // Fixed s1 length() ?s2.length();
	}
}

public class Test
{
	public static void main(String[] args)
	{
		String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
		
		//line n1
		/*A.*/ Arrays.sort(strArray, CheckClass :: checkValue);
		/*B.*/ // Arrays.sort(strArray, (CheckClass :: new) :: checkValue);
		/*C.*/ // Arrays.sort(strArray, (CheckClass :: new).checkValue);
		/*D.*/ // Arrays.sort(strArray, CheckClass :: new :: checkValue);

		for (String s : strArray) {
			System.out.print (s + " ");
		}
		
		/** Answered : D is incorrect, Correct is A Because declare sorting array is correctly with comparator. **/
	}
}