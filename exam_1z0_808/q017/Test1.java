package com.wealth.certificate.exam_1z0_808.question017;

public class Test1 {

	public static void main(String[] args) {
		int [] i = {10,20,30};
		int size = 3;
		int idx = 0;
		//line 1;
		//A
		/*while(idx <= size-1) {
			idx++;
		}*/
		
		//B
		do {
			idx ++;
		} while (idx < size-1);
		
		//C
		/*while(idx < size) {
			idx++;
		}*/
		
		//D
		/*do {
			idx ++;
		} while (idx <= size);*/
		
		//E
		/*do {
			idx ++;
		} while (idx > size);*/
		
		
		System.out.println("....."+i[idx]);
	}
	
	
	
	//fill line 1 to show result 30
	//Answer: B 

}
