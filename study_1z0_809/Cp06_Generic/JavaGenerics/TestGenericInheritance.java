package com.wealth.certificate.study_1z0_809.chapter06.JavaGenerics;

class Pairs<T> {
	T first; T second;
	
	public T getFirst() { return first; }
	public void setFirst(T first) { this.first = first; }
	public T getSecond() { return second; }
	public void setSecond(T second) { this.second = second; }
}

public class TestGenericInheritance<T> extends Pairs<T> {
	
	public TestGenericInheritance() {
		setFirst(null);
		setSecond(null);
	}
	public TestGenericInheritance(T f, T s) {
		setFirst(f);
		setSecond(s);
	}
	
	public boolean equals(Object otherObject) {
		if (otherObject == null) return false;
		else if (getClass() != otherObject.getClass()) return false;
		else {
			@SuppressWarnings("unchecked")
			TestGenericInheritance<T> otherPair = (TestGenericInheritance<T>) otherObject;
			return (getFirst().equals(otherPair.getFirst()) && 
					getSecond().equals(otherPair.getSecond()));
		}
	}
	
}
