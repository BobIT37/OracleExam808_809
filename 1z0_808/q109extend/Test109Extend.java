package com.wealth.certificate.dumps_1z0_808.question109extend;

import com.wealth.certificate.dumps_1z0_808.question109.Test109;

public class Test109Extend extends Test109 {

	public static void main(String[] args) {
		Test109 t = new Test109();

		System.out.println("Before - Ext Class Value: "+t.getValue());

		t.setValue(60);
		
		System.out.println("After - Ext Class Value: "+t.getValue());
	}

}