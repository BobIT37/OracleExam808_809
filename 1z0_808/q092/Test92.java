package com.wealth.certificate.dumps_1z0_808.question092;

public class Test92 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABCDEFG");
		//A. 
		//sb.deleteAll();
		//B. 
		//sb.delete(0, sb.size());
		//C. 
		sb.delete(0, sb.length());
		//D. 
		//sb.removeAll();
		
		System.out.println(sb);
	}

}
