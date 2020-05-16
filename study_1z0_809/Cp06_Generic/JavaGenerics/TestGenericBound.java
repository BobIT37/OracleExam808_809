package com.wealth.certificate.study_1z0_809.chapter06.JavaGenerics;

class Employee {

}

class Manager extends Employee {
	
}

class Pair<T> {
	
}

public class TestGenericBound {

	public static void main(String[] args) {
		// Test Upper Bound allows Employee and descendant classes or subclasses
		Pair<? extends Employee> testEmployeeLB = new Pair<Employee>();
		Pair<Employee> employeeLB = (Pair<Employee>) testEmployeeLB; // warning safe type casting
		Pair<Manager> managerLB = (Pair<Manager>) testEmployeeLB; // warning safe type casting
		Pair<Object> objectLB = (Pair<Object>) testEmployeeLB; // compile error 
		
		// Test Lower Bound allows Employee and super classes
		Pair<? super Employee> testEmployeeUB = new Pair<Employee>();
		Pair<Employee> employeeUB = (Pair<Employee>) testEmployeeUB; // warning safe type casting
		Pair<Manager> managerUB = (Pair<Manager>) testEmployeeUB; // compile error
		Pair<Object> objectUB = (Pair<Object>) testEmployeeUB; // warning safe type casting
		
 	}
	
}
