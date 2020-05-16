package com.wealth.certificate.dumps_1z0_808.question134;

public class Test2{
	//public static void doChange(int[] arr){ // doChange(arr[0], arr[1], arr[2]) will compile error
	public static void doChange(int... arr){
		//System.out.println(arr);
		for(int pos = 0; pos < arr.length; pos++){
			arr[pos] = arr[pos] + 1; 
		}
	}
	public static void main(String[] args){
		int[] arr = {10, 20, 30};
		//System.out.println(arr);
		doChange(arr); 		// send address Array
		for(int x: arr){
			System.out.print(x + ", ");
		}
		doChange(arr[0], arr[1], arr[2]); // send value of Array
		System.out.print(arr[0] + ", " + arr[1] + ", " + arr[2]);
	}	
}