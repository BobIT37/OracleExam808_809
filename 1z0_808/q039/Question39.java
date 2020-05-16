package com.wealth.certificate.dumps_1z0_808.question039;

class Product {
	double price;
}

public class Question39 {
	
	public void updatePrice(Product product, double price) {
		price = price * 2;
		product.price = product.price + price;
	}

	public static void main(String[] args) {
		Product prt = new Product();
		prt.price = 200;
		double newPrice = 100;

		Question39 t = new Question39();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + " : " + newPrice);
	}
	
}
