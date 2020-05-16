package com.wealth.certificate.dumps_1z0_809.question043.ext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyHashObject implements Comparable<MyHashObject>{

	String key;
	String value;
	
	MyHashObject(String key,String value){
		this.key = key;
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		return key.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		//return super.equals(obj);
		return this.hashCode() == ((MyHashObject)obj).hashCode() ? true:false;
	}

	@Override
	public int compareTo(MyHashObject o) {		
		return this.key.compareTo(o.key);
	}
	
	@Override
	public String toString() {
		return "["+key+","+value+"]";
	}
	
	public static void main(String[] args) {
		
		MyHashObject obj1 = new MyHashObject("A","AA");
		MyHashObject obj2 = new MyHashObject("A","BB");
		MyHashObject obj3 = new MyHashObject("B","BB");
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj2.equals(obj3));
		
		System.out.println(obj1==obj2);
				
		System.out.println(obj1.compareTo(obj2));
		System.out.println(obj2.compareTo(obj3));
		System.out.println(obj3.compareTo(obj1));
		
		Comparator<MyHashObject> comp = new Comparator<MyHashObject>() {
			@Override
			public int compare(MyHashObject o1, MyHashObject o2) {
				return o1.compareTo(o2);
			}
		};			
		List<MyHashObject> list = new ArrayList<>();
		list.add(obj2);
		list.add(obj1);		
		list.stream().forEach(System.out::println);
		list.sort(comp);
		list.stream().forEach(System.out::println);
		
	}
	


}
