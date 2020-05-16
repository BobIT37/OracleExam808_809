package com.wealth.certificate.dumps_1z0_808.question175;

public class Test {

	public static void main(String[] args) {
		int[] lst = {1, 2, 3, 4, 5, 4, 3, 2, 1};
		int sum = 0;
		for(int frnt = 0, rear = lst.length-1; //length = 9
				frnt < 5 && rear >=5; 
				frnt++, rear--){
			sum = sum + lst[frnt] + lst[rear];
		}
		System.out.println(sum);
	}
	
	// round 1 -> frnt = 0, rear = 8 -> sum =2(1+1)
	// round 2 -> frnt = 1, rear = 7 -> sum =4(2+2)
	// round 3 -> frnt = 2, rear = 6 -> sum =6(3+3)
	// round 4 -> frnt = 3, rear = 5 -> sum =8(4+4)
	// round 5 -> frnt = 4, rear = 4 -> out loop 
}
