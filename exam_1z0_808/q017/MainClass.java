package com.wealth.certificate.exam_1z0_808.question017;/**
 * Copyright 2010 WMSL - Wealth Management System Ltd.
 * 
 * WMSL reserves all rights in the Program as delivered.  The Program or any portion thereof may not be reproduced 
 * in any form whatsoever except as provided by license without the written consent of WMSL. A license under WMSL's
 * rights in the Program may be available directly from WMSL.
 * 
 * The embodiments of this Program and supporting materials may be ordered from:
 * 
 * Wealth Management System Limited (WMSL)
 * 5-7/F,Chin Pong Building
 * 383 Ladya Rd, Klongsan Bangkok 10600
 * Phone: +66 (0) 2861 4820
 * Fax:   +66 (0) 2861 4400
 * 
 * THIS NOTICE MAY NOT BE REMOVED FROM THE PROGRAM BY ANY USER THEREOF.
 * 
 * NEITHER WMSL, ANY MEMBER OF WMSL, NOR ANY PERSON OR ORGANIZATION ACTING ON BEHALF OF THEM:
 * 
 * 1.	MAKES ANY WARRANTY OR REPRESENTATION WHATSOEVER, EXPRESS OR IMPLIED, INCLUDING ANY WARRANTY OF MERCHANTABILITY
 *      OR FITNESS OF ANY PURPOSE WITH RESPECT TO THE PROGRAM; OR
 * 
 * 2.	ASSUMES ANY LIABILITY WHATSOEVER WITH RESPECT TO ANY USE OF THE PROGRAM OR ANY PORTION THEREOF OR WITH RESPECT
 *      TO ANY DAMAGES WHICH MAY RESULT FROM SUCH USE.
 * 
 * Source Code History
 * =================================================================================================================
 * Doc No#            Edit By         Date            Status          Desc.
 * =================================================================================================================
 */

/**
 * @author T.Oraphanthong <br>
 * Author        : T.Oraphanthong <br>
 * Created       : May 19, 2014 <br>
 * Objective     : 
 *
 */
public class MainClass {
	public static void main(String[] args){
		int [] array = {2012, 2013, 2014, 2015, 2014};
		int key = 2014;
		int count = 0;
		for(int i : array) {
			if(i == key) {
				continue;
				count++;
			}
			
		}
		System.out.println("count :"+count);
    }
	//Answer compile fails
}