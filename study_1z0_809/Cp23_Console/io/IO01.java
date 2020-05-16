package com.wealth.certificate.study_1z0_809.chapter23.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//FileInputStream
public class IO01 {
	
	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/file.txt");
		try (InputStream in = new FileInputStream(file)) {
			int b;
			// read() = Reads the next byte of data from the input stream.
			while ((b = in.read()) != -1) { // -1 indicates the end of the file
				System.out.print(b + " ");
			}
		} catch (IOException e) {
		}
		System.out.println();
		try (InputStream in = new FileInputStream(Files01.getCurrentPath() + "/home/file.txt")) {
			byte[] data = new byte[1024];
			int numberOfBytesRead;
			// read(byte[] b) = Reads some number of bytes from the input stream and stores them into the buffer array
			while ((numberOfBytesRead = in.read(data)) != -1) {
				System.out.println("numberOfBytesRead : " + numberOfBytesRead);
			}
		} catch (IOException e) {
		}
	}

}

