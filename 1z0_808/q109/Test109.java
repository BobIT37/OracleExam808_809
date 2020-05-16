package com.wealth.certificate.dumps_1z0_808.question109;

public class Test109 {

	protected int value = 0; 
	
	public static void main(String[] args) {
		Test109 t = new Test109();
		t.display();
	}
	
	void display () {
		Acc ac = new Acc();
		ac.settingValue();
		
		System.out.println("Before init value: "+this.value);
		
		this.value = 10;
		
		System.out.println("After init value: "+this.value);
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}


class Acc {
	
	void settingValue() {
		
		Test109 t = new Test109();
		System.out.println("Before init Acc value: "+t.value);
		
		t.value = 50;
		
		System.out.println("After init Acc value: "+t.value);
	}
	
}
