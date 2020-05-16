package com.wealth.certificate.study_1z0_809.chapter23.iowrapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//ObjectInputStream
public class Wrapper04 {
	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/obj.dat");
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
			Box box = null;
			Object obj = ois.readObject();
			if (obj instanceof Box) {
				box = (Box) obj;
				System.out.println(box.name);
			}
		} catch (IOException ioe) {
		} catch (ClassNotFoundException cnfe) {
		}
	}
}

