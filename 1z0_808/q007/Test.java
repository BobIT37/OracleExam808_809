package com.wealth.certificate.dumps_1z0_808.question007;

import java.io.IOException;

class X {
	/*C. is correct => throws IOException must declare at printFileContent*/
	public void printFileContent() throws IOException {// Line 2
		/*D. not correct
		throw IOException("Exception raised");*/
		throw new IOException(); //Line 4
		
	}
}

public class Test {
	/*A. is correct throws Exception must declare  at main */
	public static void main(String[] args) throws Exception {//Line 8
		/*B. not correct because Exception is Super
		try {*/
			X xobj = new X();
			xobj.printFileContent();
		/*} catch (Exception e) {	
		}catch (IOException e){
		}*/
    /********E. is correct ���� main �ա�û�С��  throws Exception ����������բ�͹��*/
	throw new IOException();}//Line 11
	

}
