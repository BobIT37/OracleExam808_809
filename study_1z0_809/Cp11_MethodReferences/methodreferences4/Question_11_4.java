package com.wealth.certificate.study_1z0_809.chapter11.methodreferences4;

import java.util.function.IntConsumer;

// Given:
class Car {
     public void drive(int speed) {
         //...
     }
}

// And:
public class Question_11_4
{
	public static void main(String[] args){
		Car c = new Car();
		IntConsumer consumer = (int speed) -> c.drive(speed);
	}
}


/*
Which of the following method references can replace the above lambda expression?
	A. Car.drive
	B. c.drive(speed)
	C. Car::drive
	xD. c::drive
*/