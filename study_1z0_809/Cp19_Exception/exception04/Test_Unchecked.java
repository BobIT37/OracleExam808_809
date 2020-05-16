package com.wealth.certificate.study_1z0_809.chapter19.exception04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Unchecked {

    public void analyze(List<String> data) {
        if (data.size() > 5) {
            //runtime exception
            throw new CustomerException_Unchecked("List can't exceed 5 items!");
        }
    }

    public static void main(String[] args) {

    	Test_Unchecked obj = new Test_Unchecked();

		//create String size = 10
        List<String> data = new ArrayList<>(Collections.nCopies(10, "Test"));
        /*for(String str : data){
        	System.out.println(str);
        }*/
       
        obj.analyze(data);

    }
    
    /*   ------------------The main members of the Exception class---------------------
    Description																Constructor/Method
    Default constructor														Exception()
    Constructor that takes a message										Exception(String)
    Constructor that takes another exception (that represents the cause)	Exception(Throwable)
    Returns exception's message												String getMessage()
    Returns (if any) the exception's cause									Throwable getCause()
    Returns the list of suppressed exceptions								Throwable[] getSuppressed()
    Prints the stack trace (cause and suppressed exceptions included)		void printStackTrace()
    */
    
}
