package com.wealth.certificate.dumps_1z0_809.question043.ext.generics;

import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A{}
class C extends B{}

public class MyGenerics {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add("a");
		list.add(new Integer(1));
		list.add(Boolean.TRUE);

		String s = (String) list.get(0);
		Integer i = (Integer) list.get(1);
		Boolean b = (Boolean) list.get(2);
		
		try {
			String sb = (String) list.get(2);
		}catch(ClassCastException cce) {
			System.err.println(cce.getMessage());
		}
		
		// Checking on compile time?
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<>();
		
		// Under the hood, the compiler inserts all the checks and casts for you, but at runtime, a generic type is seen by Java as a java.lang.Object type.
		
		
		// Wildcards
		// problem 1
		// List<Object> list4 = new ArrayList<String>();		
		List<?> list5 = new ArrayList<String>();		
				
		// problem 2
		// list5.add("Hi"); 
		// list5.add(new Object());
		list5.add(null);		
		int size = getSize(list5);
		
		
		/*	
		The solution is to use the so-called bounded wildcards:
		? extends T (Upper-bounded wildcard)
		? super T (Lower-bounded wildcard)
		*/
				
		List<? extends A> list6 = new ArrayList<>();		
		//list6.add(new A());
		//list6.add(new B());
		//list6.add(new C());
		list6.add(null);
		list6.get(0); // return A
		
		List<A> listA = new ArrayList<>();
		List<B> listB = new ArrayList<>();
		List<C> listC = new ArrayList<>();
		printExtendsA(listA);
		printExtendsA(listB);
		printExtendsA(listC);
		
				
		List<? super A> list7 = new ArrayList<>();
		list7.add(new A());
		list7.add(new B());
		list7.add(new C());
		//A a = list7.get(0); // return Object
		
	}

	static int getSize(List<?> list) {  
	    return list.size();
	}
	
	static void printExtendsA(List<? extends A> list) {
		System.out.println("Hello list of A,B,C");
	}
	

}
