package com.wealth.certificate.dumps_1z0_808.question076;

public class Student {
	public String name = "";
	public int age = 0;
	public String major = "Undeclared";
	public boolean fulltime = true;

	public void display() {
		System.out.println("Name: " + name + " Major: " + major);
	}

	public boolean isFullTime() {
		return fulltime;
	}
	
	public static void main(String... arg) {
		Student student1 = new Student();
		System.out.println(student1.major);
	}
}
/*
Which line of code initializes a student instance?
A. Student student1;
B. Student student1 = Student.new();
C. Student student1 = new Student();
D. Student student1 = Student();

-------------------------
Answer: C
-------------------------
*/