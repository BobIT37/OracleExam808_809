package com.wealth.certificate.dumps_1z0_809.question043.ext;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.omg.Messaging.SyncScopeHelper;

class A {
	String getName() {
		return "A";
	}
	
	static String getSName() {
		return "Static Name A";
	}
}

class B extends A {
	String getName() {
		return "B";
	}
	
	static String getStaticName() {
		return "Static Name B";
	}
}

class C extends B {
	String getName() {
		return "C";
	}
	
	static String getStaticName() {
		return "Static Name C";
	}
}

class D extends C {
	String getName() {
		return "D";
	}
	
	static String getStaticName() {
		return "Static Name D";
	}
	
	public D(String key) {
		
	}
	
}

public class MyMethodRef {

	public static void testSupplier(Supplier<String> sp) {
		System.out.println(sp.get());
	}
	
	public static void testFunction(Function<A, String> fn) {
		fn.apply(new A());
	}
	
	public static void main(String[] args) {
		List<A> list = Arrays.asList(new A(), new B(), new C());

		// Method Reference
		System.out.println("1. Reference to a static method");
		Supplier<String> sp1 = A::getSName;
		
		System.out.println("2. Reference to an instance method of a particular object");
		Supplier<String> fa = new A()::getName;
		Supplier<String> fb = new B()::getName;
		Supplier<String> fc = new C()::getName;		
		System.out.println(fa.get());
		System.out.println(fb.get());
		System.out.println(fc.get());
		
		
		System.out.println("3. Reference to an instance method of an arbitrary object of a particular type");		
		Function<A, String> function = A::getName;
		System.out.println(function.apply(new A()));
		System.out.println(function.apply(new B()));
		System.out.println(function.apply(new C()));

		//list.stream().map(A::getName).forEach(System.out::println);
				
		Supplier<String> s = new A()::getName; 	// lambda  ( ) -> {return this.getName();}		
		Function<A, String> f = A::getName;		// lambda  (a) -> {return a.getName();}		
				
		
		System.out.println("4. Reference to a constructor");
		Supplier<A> ca = A::new;
		Supplier<B> cb = B::new;
		Supplier<C> cc = C::new;
		A a = ca.get();
		B b = cb.get();
		C c = cc.get();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Function<String,D> dd = D::new;
		D d = dd.apply("D");
		System.out.println(d);
		
		
		/*
		instance::staticMethod
		class::staticMethod		
		
		instance::instanceMethod		
		class::instanceMethod --> auto pass this
				
		class::new
		*/
	}

}
