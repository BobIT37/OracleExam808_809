package com.wealth.certificate.dumps_1z0_808.question192;

import java.util.ArrayList;

public class Question192 {

	public static void main(String[] args) {
		ArrayList<Animal> arr = new ArrayList<>();
		arr.add(new Tiger());
		
		ArrayList<Hunter> arr1 = new ArrayList<>();
		arr1.add(new Cat());
		
		ArrayList<Hunter> arr2 = new ArrayList<>();
		arr2.add(new Tiger());
		
		ArrayList<Tiger> arr3 = new ArrayList<>();
		arr3.add(new Cat());
		
		ArrayList<Animal> arr4 = new ArrayList<>();
		arr4.add(new Cat());
		
	}

}
abstract class Animal{}
interface Hunter{}
class Cat extends Animal implements Hunter{}
class Tiger extends Cat{}