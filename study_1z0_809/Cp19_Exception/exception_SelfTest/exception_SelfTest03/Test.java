package com.wealth.certificate.study_1z0_809.chapter19.exception_SelfTest.exception_SelfTest03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// A.
		try {
			Test t = new Test();
		} finally {

		}
		
		//C
		try (FileReader fr = new FileReader("/file.txt");
		        BufferedReader br = new BufferedReader(fr)) {
		   
		}
		
		//D
		try {
		    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
		    Date date = sdf.parse("01-10");
		    System.out.println(date);
		} catch (SQLException e) { // Compile-time error because exception type ParseException
		    System.out.println("ParseException caught");
		}

	}

	// B
	void methodTest() throws Exception {
		throw new Exception();
	}
	
	
	
	

}
