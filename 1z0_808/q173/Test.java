package com.wealth.certificate.dumps_1z0_808.question173;

public class Test {

	void readCard(int cardNo) throws Exception {
		System.out.println("Reading Card");
	}

	void checkCard(int cardNo) throws RuntimeException { // line n1
		System.out.println("Checking Card");
	}

	public static void main(String[] args) {
		Test ex = new Test();
		int cardNo = 12344;
		ex.checkCard(cardNo); // line n2
		ex.readCard(cardNo); // line n3
	}

}
