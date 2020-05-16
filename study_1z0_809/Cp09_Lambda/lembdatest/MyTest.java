package com.wealth.certificate.study_1z0_809.chapter09.lembdatest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface Searchable {
	public boolean test(Car car);
}

@FunctionalInterface
interface Saleable {
	public boolean approve(Car car);
}

@FunctionalInterface
interface Returnable {
	public Function<Car, Integer> approve(Car car);
}

@FunctionalInterface
interface CreateConstructor {
	public MyTest create();
}

interface CastCar<T> {
	public Car castCarTest(T t);
}

public class MyTest {
	public static CreateConstructor createCon;
	
	public MyTest(){
		createCon = () -> new MyTest();
	}
	

	public static void main(String[] args) {
		//=== Same Lambda Expression for difference interface method ===
		Searchable s1 = c -> c.getCostUSD() > 20000;
		Saleable s2 = c -> c.getCostUSD() > 20000;
		
		//=== the target type (the functional interface) of a lambda expression can be inferred are: ===
		//A variable declaration
		Supplier<Car> SupplierCas = ()-> new Car(1, "Twenty");
		
		//An assignment
		final Map<String, Integer> map = new HashMap<>();
	    map.put("A", null);
	    map.put("B", 2);
	    map.put("C", 3);
	    map.compute("A", (k, v) -> v == null ? 100 : v);
	    map.compute("B", (k, v) -> v == null ? 200 : v);
	    System.out.println(map);
	    
		//A return statement
	    Returnable return1 = c -> {return t-> t.getCostUSD(); };
	    
	    //An array initializer
	    Car[] cars1 = { initCar(() -> new Car(1, "A")), initCar(() -> new Car(2, "B")) };

	    //Method or constructor arguments
	    createCon = () -> new MyTest();
	    
	    //A ternary conditional expression
	    Searchable checkCar = e -> e != null ? true: false;
	    
	    //A cast expression
	    CastCar<Car> castCar = c -> (Car)c;
	       
	}
	
	//A return statement
	public static Searchable Test(List<Car> cars) {
		return car -> car.getType().equals(CarTypes.COMPACT);
	}
	
	//An array initializer
	private static Car initCar(Supplier<Car> cars) {
		// TODO Auto-generated method stub
		return cars.get();
	}
}
