package com.wealth.certificate.study_1z0_809.chapter23.selftest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Test {
	int val = 54;
}

public class Question_23_4 {
	public static void main(String[] args) {
		Test t = new Test();
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.dat"))) {
			oos.writeObject(t);
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
}

/*
Which of the following is the result of executing the above lines?
A. Nothing is printed, the class is serialized in d.dat
B. Nothing is printed, but the class is not serialized
C. Error
D. An runtime exception is thrown


The correct answer is C.
The class the program is trying to serialize doesn't implement the java.io.Serializable interface. 
When that happens, the writeObject() method throws a java.io.NotSerializableException, which is an IOException. 
This way, the exception is caught and "Error" is printed.

*/