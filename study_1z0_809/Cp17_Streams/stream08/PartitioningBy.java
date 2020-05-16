package com.wealth.certificate.study_1z0_809.chapter17.stream08;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

class Item {

	private String name;
	private double price;
	private Locale madeIn;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Locale getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(Locale madeIn) {
		this.madeIn = madeIn;
	}

	public Item(String name, double price, Locale madeIn) {
		this.name = name;
		this.price = price;
		this.madeIn = madeIn;
	}

	@Override
	public String toString() {
		return this.name + ":" + this.price+":"+this.madeIn;
	}
}

public class PartitioningBy {

	public static void main(String[] args) {
		
		/*The second method for grouping is partitioningBy().
		The difference with groupingBy() is that partitioningBy() will return a Map with a Boolean as the key type, which means there are only two groups, one for true and one for false.*/
		
		
		/*partitioningBy(Predicate)*/
		List<Item> itemList = Arrays.asList(
				new Item[] { new Item("Apple", 200.0, Locale.US)
						, new Item("Apple", 100.0,Locale.CHINA)
						, new Item("Apple", 150.0,Locale.CHINA)
						, new Item("Melon", 50.0,Locale.CHINA)
						, new Item("Apple", 150.0,Locale.JAPAN) 
						, new Item("Melon", 100.0,Locale.JAPAN)
						});
		
		{
			Map<Boolean, List<Item>> map = itemList.stream()
					.collect(Collectors.partitioningBy(i -> i.getPrice()<150));
			System.out.println(map);
		}
		
		
		/*partitioningBy(Predicate, Collector)*/
		{
			Map<Boolean, Map<Boolean, List<Item>>> map = itemList.stream()
					.collect(
							Collectors.partitioningBy(
									i -> i.getPrice()<150,Collectors.<Item>partitioningBy(i-> i.getMadeIn().equals(Locale.CHINA))
							)
					);
			System.out.println(map);
			System.out.println(map.get(true));
			System.out.println(map.get(true).get(false));
		}

	}

}
