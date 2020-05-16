package com.wealth.certificate.dumps_1z0_809.question042;

public class Test {
	public static void main(String[] args)
	{
		int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		int sum = 0;
		for (int frnt = 0, rear = lst.length - 1; // lst.length = 9
			  frnt < 5 && rear >= 5;
			  frnt++, rear--) {
			sum = sum + lst[frnt] + lst[rear];
		}
		System.out.println(sum); // 20
		
		/** Answered : A is correct **/
		/*
		 *   	sum = sum + lst[frnt] + lst[rear]
		 * #1 sum = sum + lst[0] + lst[8] = 0+1+1 = 2
		 * #2 sum = sum + lst[1] + lst[7] = 2+2+2 = 6
		 * #3 sum = sum + lst[2] + lst[6] = 6+3+3 = 12
		 * #4 sum = sum + lst[3] + lst[5] = 12+4+4 = 20
		 */
	}
}
