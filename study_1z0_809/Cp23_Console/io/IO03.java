package com.wealth.certificate.study_1z0_809.chapter23.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//FileReader
public class IO03 {
	
	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/file.txt");
		try (Reader r = new FileReader(file)) {
		    int c;
		    //read() = Reads a single character. 
		    while((c = r.read()) != -1) { // -1 indicates the end of the file
		        char character = (char)c;
		        System.out.print(character);
		    }
		} catch(IOException e) { /** ... */ }
		System.out.println("-----");
		try (Reader r = new FileReader(Files01.getCurrentPath() + "/home/file.txt")) {
			char[] data = new char[1024];
			int numberOfCharsRead;
			//read(char[] cbuf) = Reads characters into an array. 
			while((numberOfCharsRead = r.read(data)) != -1) {
			   System.out.println(data);
			}
		} catch (IOException e) {
		}
	}

}

