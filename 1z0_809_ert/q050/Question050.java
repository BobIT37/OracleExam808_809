package com.wealth.certificate.dumps_1z0_809_ert.question050;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.wealth.certificate.study_1z0_809.chapter23.files.Files01;

public class Question050 {

	public static String getCurrentPath() {
		return System.getProperty("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809_ert/question050/files";
	}
	
	public static void main(String[] args) throws IOException {
		writeFiles();
	}
	
	public static void writeFiles() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(getCurrentPath() + "/data.txt")); 
		BufferedWriter bw = new BufferedWriter(new FileWriter(getCurrentPath() + "/alldata.txt")); 
		String line = null;
		while((line = br.readLine()) != null ){
			bw.append(line + "\n");
		}
		bw.flush(); // A
//		br.close(); // B
//		br.flush(); // C
//		bw.writeln(); // D
	}
}
