package com.wealth.certificate.dumps_1z0_808.question152;

interface Z {
}

public class Test152 implements Z {
	public String toString() {
		return "X ";
	}

	public static void main(String[] args) {
		Y myY = new Y();
		Test152 myX = myY;
		Z myZ = myX;

		System.out.print(myX);
		System.out.print((Y) myX);
		System.out.print(myZ);

	}

}

class Y extends Test152 {
	public String toString() {
		return "Y ";
	}
}

//Answer : D. Y YY but result is Y Y Y