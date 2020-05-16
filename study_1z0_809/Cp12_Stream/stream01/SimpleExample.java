package com.wealth.certificate.study_1z0_809.chapter12.stream01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	double score;
	String name;

	public double getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return name + " (" + score + ")";
	}

}

public class SimpleExample {

	public static void main(String[] args) {
		
		// Suppose you have a list of students and the requirements are to extract the students with a score of 90.0 or greater and sort them by score in ascending order.
		
		List<Student> students = Arrays.asList(new Student("A", 85.0), new Student("B", 91.0), new Student("C", 99.0), new Student("D", 89.0));
		
		System.out.println("----- Old style -----");
		List<Student> studentsScore = new ArrayList<Student>();
		for (Student s : students) {
			if (s.getScore() > 90.0) {
				studentsScore.add(s);
			}
		}
		Collections.sort(studentsScore, new Comparator<Student>() {
			public int compare(Student s1, Student s2) {
				return Double.compare(s1.getScore(), s2.getScore());
			}
		});

		for (Student student : studentsScore) {
			System.out.println(student);
		}

		// Using streams
		System.out.println("----- Using stream -----");
		List<Student> studentsScore2 = students.stream().filter(s -> s.getScore() >= 90.0)
				.sorted(Comparator.comparing(Student::getScore)).collect(Collectors.toList());

		for (Student student : studentsScore2) {
			System.out.println(student);
		}

	}

}
