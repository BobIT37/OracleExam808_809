package com.wealth.certificate.dumps_1z0_809.question096;

public class Question096 {
	public static void main(String[] args) {
		Customer c1 = new Customer("Larry", "Smith");
		Customer c2 = new Customer("Pedro", "Gonzales");
		Customer c3 = new Customer("Penny", "Jones");
		Customer c4 = new Customer("Lars", "Svenson");
		c4 = null;
		c3 = c2;
		System.out.println(Customer.getCount());
	}
}