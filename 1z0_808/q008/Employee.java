package com.wealth.certificate.dumps_1z0_808.question008;

public class Employee {
	String name;
	boolean contract ;
	double salary;
	Employee () { 
		// line n1
		this.name = new String("Joe"); 
		this.contract = new Boolean(true); 
		this.salary = new Double(100) ;
		//
	}
	public String toString () { 
		return name + " : " + contract + " : " + salary;
	}
	public static void main (String[] args) { 
		Employee e = new Employee () ; 
		// line n2 
		e.name = "Joe"; 
		e.contract = true; 
		e.salary  = 100;
		//
		System.out.print(e);
	}
}
