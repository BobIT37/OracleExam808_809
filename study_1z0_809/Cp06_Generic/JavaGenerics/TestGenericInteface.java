package com.wealth.certificate.study_1z0_809.chapter06.JavaGenerics;

public interface TestGenericInteface<T> {
	
	public default int sum (T a, T b) {
		return a.hashCode() + b.hashCode();
	}
	
	public String getGenericClass(T s);
	
}
