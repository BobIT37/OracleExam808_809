package com.wealth.certificate.dumps_1z0_808.question150;

public class Question150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float myarray[] = {10.20f ,20.30f,30.40f,50.60f};
		int index = 0;
		boolean isFound = false;
		float key = 30.40f;
		
		//A
//		while (key == myarray[index++]){
//			isFound = true;
//		}
//		
		//B
		while (index <= 4) {
			if (key == myarray[index]) {
				isFound = true;
				index++;
				break;
			}
		}
//		
//		//C
//		while (index++ < 5){
//			if (key == myarray[index]) {
//				isFound = true;
//			}
//		}
		
		//D
//		while (index < 5){
//			if (key == myarray[index]) {
//				isFound = true;
//				break;
//			}
//			index++;
//		}
			
		
		System.out.println(isFound);
	}

}
