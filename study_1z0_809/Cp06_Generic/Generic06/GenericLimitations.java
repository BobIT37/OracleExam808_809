package com.wealth.certificate.study_1z0_809.chapter06.Generic06;

import java.util.List;

public class GenericLimitations<T> {
	T var = new T(); // 2.don't know the type's constructors
	static T var1; // 3.cannot declare static fields
	
	public static void main(String[] args) {
		 //List<int> list = new ArrayList<>();  //1.don't work with primitive types
		
		 //5.cannot instantiate an array
		 T[] array; // OK
		 T[] array1 = new T[100]; // Error
		 List<String>[] array2 = new List<String>[10]; // Error
		
	}
	
	
	//4.cannot use instanceof
	void check (T obj){
		if(obj instanceof List<Integer>) { // Error
		}
		if (obj instanceof List<?>) {
		    
		} 
	}

}

//6-7. cannot create, catch, or throw generic types but can use a type parameter in a throws
class GenericException<T extends Exception> {
	<T extends Exception> void method() {
	    try {
	        // ...
	    } catch(T e) {
	        // Error
	    }
	}
	
	public void method2() throws T { } // OK
} 

//8.cannot overload a method
class Test {
    public void method(List<String> list) { }
    public void method(List<Integer> list) { }
}



