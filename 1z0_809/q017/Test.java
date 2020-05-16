package com.wealth.certificate.dumps_1z0_809.question017;

public class Test {
	public static void main(String[] args) {
		Rideable rider = Car :: new;
		Car vehicle = rider.getCar("MyCar");
		
		//A
		//Car auto = Car("MyCar"):: new;
		
		//B
		/*Car auto = Car :: new;
		Car vehicle = auto :: getCar("MyCar");*/
		
		//C
		/*Rideable rider = Car :: new;
		Car vehicle = rider.getCar("MyCar");*/
		
		//D
		/*Car vehicle = Rideable :: new :: getCar("MyCar");*/

	}
}
