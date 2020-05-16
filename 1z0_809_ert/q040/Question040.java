package com.wealth.certificate.dumps_1z0_809_ert.question040;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Product {
	String name;
	Integer price;
	Product(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	public void printVal() { System.out.print(name + " Price: " + price); }
	public void setPrice(int price) { this.price = price;}
	public Integer getPrice() {return price;}
}

public class Question040 {

	public static void main(String[] args) {
		List<Product> li = Arrays.asList(new Product("TV", 1000), new Product("Refrigerator", 2000));
		Consumer<Product> raise = e -> e.setPrice(e.getPrice() + 100);
		li.forEach(raise);
		li.stream().forEach(Product::printVal);
	}

}
