package com.wealth.certificate.dumps_1z0_809_ert.question047;

import java.util.*;
import java.util.function.Predicate;

class Product{
	String name;
	int qty;
	
	public String toString(){
		return name;
	}
	
	public Product(String name, int qty){
		this.name = name;
		this.qty = qty;
	}
	
	static class ProductFilter{
//		public boolean isAvailable(Product p) { // line n1
//			return p.qty >= 10;
//		}
		
		// B Replace
		public static boolean isAvailable(Product p) {
			return p.qty >= 10;
		}
	}
	
	// D Implement Predicate in the Product.ProductFilter Class and replace
	/*static class ProductFilter implements Predicate<Product> {
		public boolean test(Product p) {
			return p.qty >= 10;
		}
	}*/
}

public class Question047 {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
				new Product("MotherBoard",5),
				new Product("Speaker",20));
				products.stream()
					.filter(Product.ProductFilter::isAvailable ) // line n2
					
					// A Replace
					//.filter(p -> Product::ProductFilter::isAvailable())
					
					// C Replace
					//.filter(p -> p.ProductFilter::isAvailable(p))
					
					// D Implement Predicate in the Product.ProductFilter Class and replace
					//.filter(p -> p.ProductFilter.test(p))
					
					.forEach(p -> System.out.println(p));
	}

}
