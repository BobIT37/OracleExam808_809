package com.wealth.certificate.dumps_1z0_808.question182;

public class ForTest
{
	public static void main(String[] args) 
	{
		int[] array = {1,2,3};
		
		//for(foo){
			// A > Can compile because it is a for each loop
			// int i : array 
			
			// B > Can compile because it is a infinite loop
			// int i = 0; i < 1;
			
			// C > Can compile because for loop require two param(s) and it is a infinite loop
			// ; ;
			
			// D > Compile failed because i is not initialize;
			// i < 1; i++
			
			// E > Compile failed because i is no declare some type;
			// i = 0; i < 1;
		//}
		/** Answered : A,B,C is correct **/
	}
}
