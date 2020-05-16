package com.wealth.certificate.dumps_1z0_808.question049;

public class Test {
	static int count = 0;
	int i =0;
	
	public void changeCount(){
		while(i<5){
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		 Test check1 = new Test();
		 Test check2 = new Test();
		 check1.changeCount();
		 check2.changeCount();
		 System.out.println(check1.count+" : " +check2.count);
	}
	/*Answer: A is correct because count is static*/ 

}