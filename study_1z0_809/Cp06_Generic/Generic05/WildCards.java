package com.wealth.certificate.study_1z0_809.chapter06.Generic05;

import java.util.ArrayList;
import java.util.List;

public class WildCards<T> {
	public static void maint(String [] args){
		//-------------first problem----------------
		List<Object> list = new ArrayList<String>();
		
		List<Object> list2 = new ArrayList<>(); // it's called diamond operator
		
		
		//----------- example wildcards-------------------------
		//  it's called WildCards
		List<?> unknownTypeList = new ArrayList<String>();
		
		List<String> stringList = new ArrayList<>();
		List<Integer> intList = new ArrayList<>();
		unknownTypeList = stringList;// No problem
		unknownTypeList = intList;// No problem either
		for(Object o : unknownTypeList) { // Not guarantee type is object
		   System.out.println(o);
		}
		
		List<?> listImmutalble = new ArrayList<String>();
		listImmutalble.add("Hi"); // Compile-time error
		listImmutalble.add(null);
		WildCards wc = new WildCards();
		System.out.println(wc.getSize(listImmutalble));// call method wildcard
		
	}
	
	//----------- method wildcards-------------------------
	int getSize(List<?> list) {  
	    return list.size();
	}
	
	
	
	//---------------two problem------------------
	 public void print(T t) {
	      System.out.println(t.toUpperCase());// Error
	      // What if T doesn't represent a String?
	   }
}

//------------Example ? extends T-------
class boundedWildCardExtends<T extends String>{
	
		 public void print(T t) {
		      System.out.println(t.toUpperCase());//OK!
		   }
		 public static void main(String args[]){
			 boundedWildCardExtends<String> ext = new boundedWildCardExtends<>(); // OK
			 ext.print("Hello Wild card extend...");
			 
			 List<? extends Object> list2 = new ArrayList<String>(); // OK!
			 list2.add("Hi"); // Compile-time error because can't modify 
			 
			 boundedWildCardExtends<Integer> p2 = new boundedWildCardExtends<>(); // Error, Integer is not a String
			 
			 //------------Example assign value of subclass To superclass without generic-------------- 
			 List<Integer> listInteger = new ArrayList<>();
			 List<Float> listFloat = new ArrayList<>();
			 List<Number> listNumber = new ArrayList<>(); //*** without extends
			 listNumber.add(new Integer(1)); // OK
			 listNumber.add(new Float(1.0F)); // OK
			 listNumber = listInteger; // Error
			 listNumber = listFloat; // Error

			//------------Example assign value of subclass To superclass use generic-------------- 
			 List<? extends Number> listExtendsNum = new ArrayList<>(); //*** extends
			 listExtendsNum.add(new Integer(1)); // Compile-time error because can't modify 
			 listExtendsNum = listInteger; // OK
			 listExtendsNum = listFloat; // OK
		 }
}

//------------Example ? super T-------
class boundedWildCardSuper{
	public static void main(String [] args){
		List<? super Integer> list = new ArrayList<>();
		list.add(1); // OK!
		list.add(2); // OK!
		
		List<Integer> listInteger = new ArrayList<>();
		List<Object> listObject = new ArrayList<>();
		List<? super Number> listSuperNum = new ArrayList<>();
		listSuperNum.add(new Integer(1)); // OK
		listSuperNum.add(new Float(1.0F)); // OK
		listSuperNum.add(new Object()); //Error!
		listSuperNum = listInteger; // Error!
		listSuperNum = listObject; // OK
	}
	
	
}


