package com.wealth.certificate.dumps_1z0_808.question073;

public class Series {
	private boolean flag;
	
	public void displaySeries() {
		int num = 2;
		System.out.println("+++ displaySeries "+flag);
		while (flag) {
			if(num % 7 == 0)
				flag = false;
			System.out.print(num);
			num += 2;
		}
	}
	public static void main(String[] args) {
		System.out.println("+++");
		new Series().displaySeries();
	}
}
