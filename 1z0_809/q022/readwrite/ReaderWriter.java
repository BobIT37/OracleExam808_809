package com.wealth.certificate.dumps_1z0_809.question022.readwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		//input keyboard Scanner
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); //read Line
		//String s2 = sc.next(); //read to end whitespec
		//int s3 = sc.nextInt(); //parse to int
		
		//input keyboard BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String b = br.readLine();
		//int b1 = Integer.parseInt(br.readLine());
		
		//=======================================================================================
		
		//Scanner
		//Read File
		Scanner reScan = new Scanner(new File(getCurrentPath() + "/ReadFile.txt"));
		//reScan.lines().forEach(c -> System.out.println(c));
		while (reScan.hasNextLine()) {
            String line = reScan.nextLine();
            System.out.println(line);
        }
			
		//-------------------------------------------------------------------------------------
		
		//BufferedReader , BufferedWriter
		//Read File
		BufferedReader read = new BufferedReader(new FileReader(getCurrentPath() + "/ReadFile.txt"));
		read.lines().forEach(c -> System.out.println(c));
		
		String text = "",a="";
		while ((a=read.readLine())!=null) {
			text+=a+"\n";
		}
		read.close();
		System.out.println(text);
		
		//Write File
		BufferedWriter writer = new BufferedWriter(new FileWriter(getCurrentPath() + "/WriterFile.txt"));
		writer.write(text);
		writer.close();
	}
	
	private static String getCurrentPath()
	{
		return System.getProperty ("user.dir") + "/src/main/java/com/wealth/certificate/dumps_1z0_809/question022/readwrite";
	}

}
