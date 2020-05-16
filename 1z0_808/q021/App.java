package com.wealth.certificate.dumps_1z0_808.question021;

public class App{
	String myStr = "7007";
	
	public void doStuff(String str){
		int myNum = 0;
		try {
			String myStr = str;
			myNum = Integer.parseInt(myStr);
		} catch (NumberFormatException ne) {
			System.err.println("Error");
		}
		System.out.println(
				"myStr:"+ myStr+", myNum:" +myNum);
	}
	public static void main(String[]args){
		App obj = new App();
		obj.doStuff("9009");
	}
}

/** Answered : C is correct -> การเปลี่ยน ค่า myStr ใน doStuff ไม่มีผลต่อ myStr ที่เป็น class variable**/ 
