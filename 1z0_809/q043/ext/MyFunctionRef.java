package com.wealth.certificate.dumps_1z0_809.question043.ext;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class MyClass {

	public void noArgumentAndNoReturn() {
		System.out.println("MyClass noArgumentAndNoReturn");
	}

	public void OneArgumentAndNoReturn(String msg) {
		System.out.println("MyClass OneArgumentAndNoReturn "+msg);
	}	
	
	public void TwoArgumentAndNoReturn(String a, String b) {
		System.out.println("MyClass TwoArgumentAndNoReturn "+a+","+b);
	}
	
	public String noArgumentAndReturn() {
		System.out.println("MyClass noArgumentAndReturn");
		return "MyClass noArgumentAndReturn";
	}
	
	public String oneArgumentAndReturn(String msg) {
		System.out.println("MyClass oneArgumentAndReturn "+msg);
		return "MyClass oneArgumentAndReturn "+msg;
	}
	
}

public class MyFunctionRef {

	public void testSupplier(Supplier<String> supplier) {
		String result = supplier.get();
		System.out.println(result);
	}
	
	public void testConsumer(Consumer<String> consumer) {
		consumer.accept("OneArgumentAndNoReturn");
	}
	
	public void testBiConsumer(BiConsumer<String,String> consumer) {
		consumer.accept("a","b");
	}
	
	public void testFunction(Function<String,String> function) {
		function.apply("a");
	}
	
	public void testBiFunction(BiFunction<String,String,String> function) {
		function.apply("a","b");
	}
	
	public void testRunnable(Runnable runnable) {
		Thread t = new Thread(runnable);
		t.start();
	}

	
	public static void main(String[] args) {

		MyFunctionRef myFunctionRef = new MyFunctionRef();
		MyClass obj = new MyClass();
		
		System.out.println("Supplier (0 arg and 1 return) --> get method");
		Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				return "noArgumentAndReturn";
			}
		};
		Supplier<String> supplierRef = obj::noArgumentAndReturn;
		
		myFunctionRef.testSupplier(supplier);								
		myFunctionRef.testSupplier(supplierRef);					
		myFunctionRef.testSupplier(obj::noArgumentAndReturn); 						// method reference covert to lambda ()->{...}	
		myFunctionRef.testSupplier(()->"Lambda noArgumentAndReturn");				// lambda expression

	
		System.out.println("Consumer (1 arg and 0 return) --> accept method");
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		Consumer<String> consumerRef = obj::OneArgumentAndNoReturn;
		
		myFunctionRef.testConsumer(consumer);
		myFunctionRef.testConsumer(consumerRef);
		myFunctionRef.testConsumer(obj::OneArgumentAndNoReturn);					// lambda (a)->{}
		myFunctionRef.testConsumer(s->System.out.println("Lambda OneArgumentAndNoReturn"));			
		
		
		
		System.out.println("BiConsumer (2 arg and 0 return) --> accept method");
		BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
			@Override
			public void accept(String a, String b) {
				System.out.println("BiConsumer "+a+","+b);
			}
		};
		BiConsumer<String, String> biConsumerRef = obj::TwoArgumentAndNoReturn;
		
		myFunctionRef.testBiConsumer(biConsumer);
		myFunctionRef.testBiConsumer(biConsumerRef);
		myFunctionRef.testBiConsumer(obj::TwoArgumentAndNoReturn); 					// lambda (a,b)->{}
		myFunctionRef.testBiConsumer((String a,String b)->{System.out.println("Lambda TwoArgumentAndNoReturn "+a+","+b);});

		
		System.out.println("Function (1 arg and 1 return) --> apply method");
		Function<String, String> function = new Function<String, String>() {
			@Override
			public String apply(String msg) {
				return "oneArgumentAndReturn "+msg;
			}
		};
		Function<String, String> functionRef = obj::oneArgumentAndReturn;
		
		myFunctionRef.testFunction(function);
		myFunctionRef.testFunction(functionRef);
		myFunctionRef.testFunction(obj::oneArgumentAndReturn);					// lambda (a)->{...}
		myFunctionRef.testFunction((String msg)->{return "Lambda oneArgumentAndReturn "+msg;});
		
		System.out.println("BiFunction (2 arg and 1 return) --> apply method");
		// Your turn
		

		System.out.println("Runnable (0 arg and 0 return) -- start method");
		myFunctionRef.testRunnable(obj::noArgumentAndNoReturn);
		myFunctionRef.testRunnable(()->{System.out.println("Lambda noArgumentAndNoReturn");});
		
		
	}

}
