package com.wealth.certificate.study_1z0_809.chapter06.JavaGenerics;

class GM<T> {
	
	T first;
	T second;
	
	public void setFirst(T t) {
		this.first = t;
	}
	
	public void setSecond(T t) {
		this.second = t;
	}
	
	public <U> U add (U t) {
		return t;
	}
	
	public <A,B> T sum (A a, B b) {
		return (a.hashCode() > b.hashCode()) ? this.first : this.second;
	}
	
}

public class TestGenericMethod {

	public static void main(String[] args) {
//		GM<String> gm = new GM<>();
		GM<String> gm = new GM<String>();
		System.out.println(gm.add("hello").getClass().toGenericString());
		System.out.println(gm.add(5).getClass().toGenericString());
		gm.setFirst("First");
		gm.setSecond("Second");
		System.out.println(gm.sum("Java",5).getClass().toGenericString());
	}
	
}
