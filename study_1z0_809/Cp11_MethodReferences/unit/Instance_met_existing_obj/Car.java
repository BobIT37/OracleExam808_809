package com.wealth.certificate.study_1z0_809.chapter11.unit.Instance_met_existing_obj;

import java.util.function.Consumer;
class Mechanic {
    public void fix(Car c) {
        System.out.println("Fixing car " + c.getId());
    }
}
public class Car {
	 private int id;
     private String color;
     // More properties
     // And getter and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void execute(Car car, Consumer<Car> c) {
	     c.accept(car);
	}
	public void method1() {
		final Mechanic mechanic = new Mechanic();
		Car car = new Car();

		// Using an anonymous class
		execute(car, new Consumer<Car>() {
		     public void accept(Car c) {
		         mechanic.fix(c);
		     }
		});

		// Using a lambda expression
		execute(car, c -> mechanic.fix(c));

		// Using a method reference
		execute(car, mechanic::fix);
	}
}
