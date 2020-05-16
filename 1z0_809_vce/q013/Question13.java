package com.wealth.certificate.dumps_1z0_809_vce.question013;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	String name, course, city;
	
	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public String getCity() {
		return city;
	}

	public Student(String name, String course, String city) {
		this.name = name;
		this.course = course;
		this.city = city;
	}
}

public class Question13 {
	
	public static void main(String[] args) {
		List<Student> stds = Arrays.asList(
			new Student("Jessy", "Java ME", "Chicago"),
			new Student("Helen", "Java EE", "Houston"),
			new Student("Mark", "Java ME", "Chicago")
		);
		// collect return Map<String, List<Student>>, Object> Map<String, List<Student>> 
		// Collectors.groupingBy return 
		// <Student, String> Collector<Student, ?, Map<String, List<Student>>> 
		stds.stream().collect(Collectors.groupingBy(Student::getCourse))
		// BiConsumer<? super String, ? super List<Student>>
		.forEach((src,res)->System.out.println(src));
		//.collect(Collectors.groupingBy(Student::getCourse))

	}
	
}
