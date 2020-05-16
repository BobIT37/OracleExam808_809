package com.wealth.certificate.dumps_1z0_809_ps.question066;

abstract class Shape {
	private int x;
	private int y;
	public abstract void draw();
	public void setAnchor(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

/** Answered : B, E is correct **/
// A - Compile Error on Shape because Shape is not class and keyword "implements" use only interface
/*
public class Circle implements Shape {
	private int radius;
}
*/
// B - OK abstract can extends abstract
/*
public abstract class Circle extends Shape {
	private int radius;
}
*/
// C - Compile Error on method draw() because draw() has no body or can declare to abstract method.
/*
public class Circle extends Shape {
	private int radius;
	public void draw();
}
*/
// D - Compile Error on Shape, method draw() because 
// 	 Shape is not class and keyword "implements" use only interface
// 	 , draw() has no body or can declare to abstract method.
/*
public abstract class Circle implements Shape {
	private int radius;
	public void draw();
}
*/
// E - OK class extends class and draw() has a body.
/*
public class Circle extends Shape {
	private int radius;
	public void draw() {/* code here *-/}
}
*/
// F - Compile Error on Shape because Shape is not class and keyword "implements" use only interface
/*
public abstract class Circle implements Shape {
	private int radius;
	public void draw() {/* code here *-/}
}
*/