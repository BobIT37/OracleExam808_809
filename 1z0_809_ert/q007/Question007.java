package com.wealth.certificate.dumps_1z0_809_ert.question007;

import java.io.Serializable;

/*
7. Which two are elements of a singleton class?
A) a public method to instantiate the single instance
B) a public reference to point to the single instance
C) a transient reference to point to the single instance
D) a public static method to return a copy of the singleton reference 
E) a private constructor to the class
*/

public class Question007 {
	public static void main(String[] args) {
		System.out.println(MySingleton0.getInstance());
	}
}


class MySingleton0 implements Serializable {
	private static MySingleton0 _instance = new MySingleton0(); //single instance
	
	public Object _instance2 = _instance; //B
	transient Object _instance3 = _instance; //C

	 private MySingleton0() { //E
		 // construct object . . .
	 }

	 public static MySingleton0 getInstance() { //D
		 return _instance;
	 }
	 
	 public MySingleton0 getInstanceBad() { //A
		 return _instance;
	 }
}

//------------------------------- Singleton Patten ---------------------------------
//Listing 1
class MySingleton1{
	private static MySingleton1 _instance = new MySingleton1();

	 private MySingleton1() {
		 // construct object . . .
	 }

	 public static MySingleton1 getInstance() {
		 return _instance;
	 }
	 
	 public MySingleton1 getInstanceBad() {
		 return _instance;
	 }
}

//Listing 2
class MySingleton2 {
	 private static MySingleton2 _instance;

	 private MySingleton2() {
		 // construct object . . .
	 }

	 // For lazy initialization
	 public static synchronized MySingleton2 getInstance() {
		  if (_instance==null) {
			  _instance = new MySingleton2();
		  }
		  return _instance;
	 }
}
