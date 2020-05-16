package com.wealth.certificate.dumps_1z0_809_vce.question029;

class Canvas implements Drawable {
	public void draw() {
	}
}

abstract class Board extends Canvas {
}

class Paper extends Canvas {
	protected void draw(int color) {
	}
}

class Frame extends Canvas implements Drawable {
	public void resize() {
	}
}

interface Drawable {
	public abstract void draw();
}

public class Test{
	public static void main(String[] args) {
		
	}
}