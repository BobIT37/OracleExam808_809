package com.wealth.certificate.study_1z0_809.chapter11.unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 
 * Key Points
 * 
 * - A method reference is the shorthand syntax to a lambda expression that executes just one method.
 * - The syntax of a lambda expression is:
 * 	> ObjectOrClassName :: methodName
 * - In a method reference, you place the object (or class) that contains the method before the :: operator and the name of the method after it without arguments.
 * - There are four types of method references:
 * 	> A method reference to a static method
 * 	> A method reference to an instance method of an object of a particular type
 * 	> A method reference to an instance method of an existing object
 * 	> A method reference to a constructor
 * - For static methods, we have a lambda expression like the following:
 * 	> (args) -> Class.staticMethod(args)
 * - That can be turned into the following method reference:
 * 	> Class::staticMethod
 * - For instance methods of objects of a particular type, we have a lambda expression like the following:
 * 	> (obj, args) -> obj.instanceMethod(args)
 * - Where an instance of an object is passed as an argument and one of its methods is executed with some optional(s) parameter(s).
 * - And that can be turned into the following method reference:
 * 	> ObjectType::instanceMethod
 * - For instance methods of existing objects, we have a lambda expression like the following:
 * 	> (args) -> obj.instanceMethod(args)
 * - That can be turned into the following method reference:
 * 	> obj::instanceMethod
 * - For creating objects (calling a constructor), we have a lambda expression like the following:
 * 	> (args) -> new ClassName(args)
 * - That can be turned into the following method reference:
 * 	> ClassName::new
 *
 */

/** [Conclusion] -------------------------------------------------------------------------------------- **/
/** Test ============================================================================ **/
interface Test {
	default void test() { System.out.println("Default interface"); };
	
	static void test2() {
		System.out.println("Static interface");
	}
	
	void test3();
}

/** Super - Sub Class =============================================================== **/
abstract class SuperClass {
   void method() { 
       System.out.println("Superclass method()");
   }
   void method2() { 
      System.out.println("Superclass method2()");
  }
}
class SubClass extends SuperClass {
   @Override
   void method() {
   	System.out.println("Subclass method()");
   	
      Runnable superMethodL = () -> super.method();
      superMethodL.run();
      Runnable superMethodMR = SubClass.super::method;
      superMethodMR.run();
   }
}

/** Static Method =================================================================== **/
class Numbers {
   public static boolean isMoreThanFifty(int n1, int n2) {
       return (n1 + n2) > 50;
   }
   
   public static List<Integer> findNumbers(
       List<Integer> l, BiPredicate<Integer, Integer> p) {
       List<Integer> newList = new ArrayList<>();
       for(Integer i : l) {
           if(p.test(i, i + 10)) {
               newList.add(i);
           }
       }
       return newList;
   }
   
   public static final void method1(){
   	System.out.println("Static final class");
   }
   
   public final int method2(){
   	System.out.println("Final only class");
   	return 0;
   }
}
/** Instance method of an arbitrary object of a particular type ===================== **/
class Shipment {
   public double calculateWeight() {
       double weight = 0;
       // Calculate weight
       return weight;
   }
}
/** Instance method of an existing object =========================================== **/
class Car {
   private int id;
   private String color;
   // More properties
   // And getter and setters
   public int getId()
   {
   	return id;
   }
}
class Mechanic {
   public void fix(Car c) {
       System.out.println("Fixing car " + c.getId());
   }
}

public class Keypoints {
	public List<Double> calculateOnShipments(
	   List<Shipment> l, Function<Shipment, Double> f) {
	   List<Double> results = new ArrayList<>();
	   for(Shipment s : l) {
	       results.add(f.apply(s));
	   }
	   return results;
	}
	
	public void execute(Car car, Consumer<Car> c) {
	   c.accept(car);
	}
	
	public static void main(String argr[]){
/** Static Method =================================================================== **/
		List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);

		// Using an anonymous class
		Numbers.findNumbers(list, new BiPredicate<Integer, Integer>() {
		     public boolean test(Integer i1, Integer i2) {
		         return Numbers.isMoreThanFifty(i1, i2);
		     }
		});
	
		// Using a lambda expression
		Numbers.findNumbers(list, (i1, i2) -> Numbers.isMoreThanFifty(i1, i2));
	
		// Using a method reference
		Numbers.findNumbers(list, Numbers::isMoreThanFifty);

/** Instance method of an arbitrary object of a particular type ===================== **/
		Keypoints k = new Keypoints();
		List<Shipment> l = new ArrayList<Shipment>();

	// Using an anonymous class
		k.calculateOnShipments(l, new Function<Shipment, Double>() {
		     public Double apply(Shipment s) { // The object
		         return s.calculateWeight(); // The method
		     }
		});
	
	// Using a lambda expression
		k.calculateOnShipments(l, s -> s.calculateWeight());
	
	// Using a method reference
		k.calculateOnShipments(l, Shipment::calculateWeight);
		
/** Instance method of an existing object =========================================== **/
		final Mechanic mechanic = new Mechanic();
		Car car = new Car();

	// Using an anonymous class
		k.execute(car, new Consumer<Car>() {
		     public void accept(Car c) {
		         mechanic.fix(c);
		     }
		});

	// Using a lambda expression
		k.execute(car, c -> mechanic.fix(c));

	// Using a method reference
		k.execute(car, mechanic::fix);
		
/** Constructor ====================================================================== **/
	/** No Arguments ================================================================== **/
	// Using an anonymous class
		Supplier<List<String>> s = new Supplier() {
		     public List<String> get() {
		         return new ArrayList<String>();
		     }
		};
		List<String> li = s.get();

	// Using a lambda expression
		Supplier<List<String>> s1 = () -> new ArrayList<String>();
		List<String> li2 = s1.get();

	// Using a method reference
		Supplier<List<String>> s2 = ArrayList::new;
		List<String> li3 = s2.get();
		
	/** An Argument ================================================================== **/
	// Using a anonymous class
		Function<String, Integer> f =
		     new Function<String, Integer>() {
		         public Integer apply(String s) {
		             return new Integer(s);
		         }
		};
		Integer i = f.apply("100");

	// Using a lambda expression
		Function<String, Integer> f1 = s3 -> new Integer(s3);
		Integer i1 = f1.apply("100");

	// Using a method reference
		Function<String, Integer> f2 = Integer::new;
		Integer i2 = f2.apply("100");
		
	/** Two Arguments ================================================================== **/
	// Using a anonymous class
		BiFunction<String, String, Locale> f3 = new BiFunction<String, String, Locale>() {
		     public Locale apply(String lang, String country) {
		         return new Locale(lang, country);
		     }
		};
		Locale loc = f3.apply("en","UK");

	// Using a lambda expression
		BiFunction<String, String, Locale> f4 = (lang, country) -> new Locale(lang, country);
		Locale loc1 = f4.apply("en","UK");

	// Using a method reference
		BiFunction<String, String, Locale> f5 = Locale::new;
		Locale loc2 = f5.apply("en","UK");
		
		
		
		
/** Test ============================================================================= **/
	// Test : static final method in class (Static Method)
		Runnable r = Numbers::method1;
		r.run();
		
	// Test : final method in class (Instance method of an existing object)
		Runnable r2 = (new Numbers())::method2;
		r2.run();
		
	// Test : static final method in class (Static Method)
		Runnable r3 = Test::test2;
		r3.run();
		
	// Test : Super in new SubClass
		SuperClass sup = new SubClass();
		Runnable r4 = sup::method; // Overriden method
		r4.run();
		
	// Test : Super in new SubClass
		SuperClass sup2 = new SubClass();
		Runnable r5 = sup2::method2; // Not overriden method
		r5.run();
		
	// Test : Sub	
		SubClass sub = new SubClass();
		Runnable r6 = sub::method;
		r6.run();
	}
}