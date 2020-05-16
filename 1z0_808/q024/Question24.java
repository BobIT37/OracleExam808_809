package com.wealth.certificate.dumps_1z0_808.question024;

public class Question24 {

	int x;
	int y;
	
	public void doStuff(int x, int y) {
		this.x = x;
		y =this.y;
	}
	public void display() {
		System.out.print(x + " " + y + " : ");
	}
	
	public static void main(String[] args) {
		Question24 m1 = new Question24();
	
		m1.x = 100;
		m1.y = 200;
		
		Question24 m2 = new Question24();
		
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();
		
		//System.out.println(m1==m2);
	}
}

