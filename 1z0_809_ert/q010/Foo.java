package com.wealth.certificate.dumps_1z0_809_ert.question010;

public class Foo<K, V> {
	private K key;
	private V value;

	public Foo(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public static <T> Foo<T, T> twice(T value) { 
		return new Foo<T, T>(value, value);
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A)
		Foo<String, Integer> mark = new Foo<String, Integer>("Steve", 1);
		// B)
		Foo<String, String> pair = Foo.<String>twice("Hello World!");
		// C)
		Foo<Object, Object> percentage = new Foo<String, Integer>("Steve", 1);
		// D)
		Foo<String, String> grade = new Foo<>("John", "A");
	}
}


/*

 Which option fails? 
 A) Foo<String, Integer> mark = new Foo<String, Integer>(“Steve”, 1); 
 B) Foo<String, String> pair = Foo.<String>twice(“Hello World!”); 
 C) Foo<object, Object> percentage = new Foo<String, Integer>(“Steve”,1); 
 D) Foo<String, String> grade = new Foo<>(“John”, “A”);  
 
*/