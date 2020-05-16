package com.wealth.certificate.dumps_1z0_808.question151;

class Base {
	// insert code here
//	A. 	
//	private int num; 
//	public int getNum() { return num; }
//	public void setNum(int num) { this.num = num; }
	
//	B. 	
//	public int num; 
//	protected public int getNum() { return num; }		// only one of public / protected / private
//	protected public void setNum(int num) { this.num = num; }		
	
//	C. 	
//	private int num;
//	public int getNum() { return num; } 
//	private void setNum(int num) { this.num = num; } 		// if private then cannot access this method from another class
	
//	D. 	
//	protected int num; 
//	public int getNum() { return num; } 
//	public void setNum(int num) { this.num = num; }
	
//	E. 	
//	protected int num; 
//	private int getNum() { return num; } 				// if private then cannot access this method from another class
//	public void setNum(int num) { this.num = num; }

}

public class Derived extends Base {
	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.setNum(3);
		System.out.println("Square = " + obj.getNum() * obj.getNum());
	}
}