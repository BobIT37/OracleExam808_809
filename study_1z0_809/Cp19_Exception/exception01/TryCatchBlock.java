package com.wealth.certificate.study_1z0_809.chapter19.exception01;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TryCatchBlock {

	public static void main(String[] args) {
		//try {
			int[] arr = new int[3];
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i * 2;
			}
		//} catch (ArrayIndexOutOfBoundsException e) {
		//	System.out.println("Exception caught");
		//}
		System.out.println("Done");
			
			
			//---------example throws with throw-------------
			TryCatchBlock tcb = new TryCatchBlock();
			try {
				tcb.myMethod();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			//---------example Unhandled exception type-------
			try {
			    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd");
			    Date date = sdf.parse("01-10");
			    System.out.println(date);
			} catch (SQLException e) { // Compile-time error because exception type ParseException
			    System.out.println("ParseException caught");
			}
			
			
			
			
			
	}
	
	public void myMethod() throws SQLException {
	    throw new SQLException();
	}	

}
