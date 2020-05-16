package com.wealth.certificate.study_1z0_809.chapter23.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

//FileOutputStream
public class IO02 {
	
	static int count = -1;
	public static void main(String[] args) {
		File file = new File(Files01.getCurrentPath() + "/home/output.txt");
		try (OutputStream out = new FileOutputStream(file)) {
			int b;
			while ((b = getData()) != -1) {
				out.write(b);	// Writes b to the file output stream
				out.flush();	// Flushes this output stream and forces any buffered output bytes to be written out. 
			}
		} catch (IOException e) {
		}
	}

	private static int getData() {
		count++;
		if(count > 5)
			return -1;
		return 65 + count;
	}
	
}
