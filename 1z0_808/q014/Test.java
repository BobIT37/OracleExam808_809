package com.wealth.certificate.dumps_1z0_808.question014;

import java.util.ArrayList;
import java.util.List;

class Student 
{
	int rollnumber;
	String name;

	List cources = new ArrayList();
	
// Insert code here
/*
 * A : Compile Error because declare private access modifier
 * 
	private Student(int i, String name, List cs) 
	{
		// initialization code goes here
	}
*/
/*
 * B : Compile Error because using method is not constructor for initialize
 * 
	public void Student(int i, String name, List cs) 
	{
		// initialization code goes here
	}
*/
	/** Answered : C is correct **/
/*
 * C : No Compile Error but must be initialized variable before
 * 
*/
	Student(int i, String name, List cs) 
	{
		// initialization code goes here
	// rollnumber = i;
	// this.name = name;
	// cources = cs;
	}

/*
 * D : Compile Error because using explicit parameters in constructor not match. (ArrayList must changed to List)
 * 
	Student(int i, String name, ArrayList cs) 
	{
		// initialization code goes here
	}
*/
	public String toString() 
	{
		return rollnumber + " : " + name + " : " + cources;
	}
}

public class Test
{
	public static void main(String[] args)
	{
		List cs = new ArrayList();
		cs.add("Java");
		cs.add("C");
		
		Student s = new Student(123,"Fred", cs);
		System.out.println(s);
	}
}
