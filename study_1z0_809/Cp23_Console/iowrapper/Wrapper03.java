package com.wealth.certificate.study_1z0_809.chapter23.iowrapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//ObjectOutputStream
public class Wrapper03 {
	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/obj.dat");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
			Box box = new Box();
			oos.writeObject(box);
		} catch (IOException e) {
			/** ... */
		}
	}
}

class Box implements java.io.Serializable {
	public String name = "Box";
}

