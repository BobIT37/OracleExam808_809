package com.wealth.certificate.study_1z0_809.chapter17.stream07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
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

public class GroupingBy {

	public static void main(String[] args) {

		/*
		 * 1. groupingBy(Function) 
		 * 2. groupingBy(Function, Collector) 
		 * 3. groupingBy(Function, Supplier, Collector)
		 */

		List<Item> itemList = Arrays.asList(
				new Item[] { new Item("Apple", 200.0, Locale.US)
						, new Item("Apple", 100.0,Locale.CHINA)
						, new Item("Apple", 150.0,Locale.CHINA)
						, new Item("Melon", 50.0,Locale.CHINA)
						, new Item("Apple", 150.0,Locale.JAPAN) 
						, new Item("Melon", 100.0,Locale.JAPAN)
						});

		/*groupingBy(Function) */
		{
			Map<Locale, List<Item>> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn()));
			System.out.println(map);
		}
		
		/*groupingBy(Function, Collector) */
		{
			Map<Locale, List<Item>> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(), Collectors.toList()));
			System.out.println(map);			
		}
		
		{
			Map<Locale, Map<String, List<Item>> > map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(), Collectors.groupingBy(e -> e.getName() )));
			System.out.println(map);
			System.out.println(map.get(Locale.CHINA).get("Apple"));
		}
		
		/*Since calculation methods can be implementing as reductions*/
		/*		
		Method			Returned value from collect()	Description
		averagingInt									Returns the average of the input elements.	
		averagingLong									Returns the average of the input elements.
		averagingDouble Double							Returns the average of the input elements.		
		counting		Long							Counts the elements of input elements.		
		maxBy			Optional<T>						Returns the maximum element according to a given Comparator.		
		minBy			Optional<T>						Returns the minimum element according to a given Comparator.		
		summingInt		Integer							Returns the sum of the input elements
		summingLong		Long							Returns the sum of the input elements
		summingDouble	Double							Returns the sum of the input elements
 		*/	
		
		
		/*counting*/
		{
			Map<Locale, Long> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(), Collectors.counting()));
			System.out.println(map);
		}
		
		/*summingDouble*/
		{
			Map<Locale, Double> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(), Collectors.<Item>summingDouble(i->i.getPrice())));
			System.out.println(map);
		}
		
		/*averagingDouble*/
		{
			Map<Locale, Double> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(), Collectors.<Item>averagingDouble(i->i.getPrice())));
			System.out.println(map);
		}
		
		/*minBy*/
		{
			
			Comparator<Item> compareItem = new Comparator<Item>() {
				@Override
				public int compare(Item o1, Item o2) {
					return o1.getPrice()==o2.getPrice()?0:o1.getPrice()>o2.getPrice()?1:-1;
				}
			};
			
			Map<Locale, Optional<Item>> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(), Collectors.<Item>minBy( compareItem )));
			System.out.println(map);
		}
		
		/*summarizingDouble*/
		{
			Map<Locale, DoubleSummaryStatistics> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(), Collectors.<Item>summarizingDouble(i->i.getPrice())));
			System.out.println(map);
		}
		
		
		/*groupingBy(Function, Supplier, Collector)*/
		{
			Map<Locale, List<Item>> map = itemList.stream()
					.collect(Collectors.groupingBy(e -> e.getMadeIn(),HashMap::new,Collectors.toList()));
			System.out.println(map);
			System.out.println(map.getClass().toGenericString());
		}
	}

}
