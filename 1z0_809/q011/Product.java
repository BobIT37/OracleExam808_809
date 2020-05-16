package com.wealth.certificate.dumps_1z0_809.question011;

public class Product {
	int id;
	int price;

	public Product(int id, int price) {
		this.id = id;
		this.price = price;
	}

	public String toString() {
		return id + ":" + price;
	}
}