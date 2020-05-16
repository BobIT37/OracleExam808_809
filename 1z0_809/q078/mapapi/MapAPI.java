package com.wealth.certificate.dumps_1z0_809.question078.mapapi;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapAPI {
	public static void main (String [ ] args) {
		//problem
		//put key duplicate that value change
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Bus Tour");
		favorites.put("Jenny", "Tram");
		System.out.println(favorites); // {Jenny=Tram}
		
		//putIfAbsent is method check key not duplicate to put key and value
		Map<String, String> favorites1 = new HashMap<>();
		favorites1.put("Jenny", "Bus Tour");
		favorites1.put("Tom", null);
		favorites1.putIfAbsent("Jenny", "Tram"); //not put
		favorites1.putIfAbsent("Sam", "Tram");   //put
		favorites1.putIfAbsent("Tom", "Tram");	 //value is null will put 
		System.out.println(favorites1); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
		
		//---------------------------------
		
		//merge(key, value, BiFunction)
		BiFunction<String, String, String> mapper = (v1, v2)
					-> v1.length() > v2.length() ? v1: v2;

		Map<String, String> favorites2 = new HashMap<>();
		favorites2.put("Jenny", "Bus Tour");
		favorites2.put("Tom", "Tram");

		String jenny = favorites2.merge("Jenny", "Skyride", mapper);
		String tom = favorites2.merge("Tom", "Skyride", mapper);

		System.out.println(favorites2); // {Tom=Skyride, Jenny=Bus Tour}
		System.out.println(jenny); // Bus Tour
		System.out.println(tom); // Skyride
		
		
		//merge(key, value, BiFunction) for delete  //same remove(key)
		BiFunction<String, String, String> mapper3 = (v1, v2) -> null;
		Map<String, String> favorites3 = new HashMap<>();
		favorites3.put("Jenny", "Bus Tour");
		favorites3.put("Tom", "Bus Tour");
		favorites3.merge("Jenny", "Skyride", mapper);
		favorites3.merge("Sam", "Skyride", mapper);
		System.out.println(favorites3); // {Tom=Bus Tour, Sam=Skyride}
		
		//computeIfPresent is method at runs only when the key present
		Map<String, Integer> counts = new HashMap<>();
		counts.put("Jenny", 1);
		
		BiFunction<String, Integer, Integer> mapper4 = (k, v) -> v + 1;
		
		Integer jenny1 = counts.computeIfPresent("Jenny", mapper4);
		Integer sam1 = counts.computeIfPresent("Sam", mapper4);
		
		System.out.println(counts); // {Jenny=2}
		System.out.println(jenny1); // 2
		System.out.println(sam1); // null
		
		//computeIfPresent is method at runs only when the key isn’t present or is null:
		Map<String, Integer> counts5 = new HashMap<>();
		counts5.put("Jenny", 15);
		counts5.put("Tom", null);
		Function<String, Integer> mapper5 = (k) -> 1;
		Integer jenny5 = counts5.computeIfAbsent("Jenny", mapper5); // 15
		Integer sam5 = counts5.computeIfAbsent("Sam", mapper5); // 1
		Integer tom5 = counts5.computeIfAbsent("Tom", mapper5); // 1
		System.out.println(counts5); // {Tom=1, Jenny=15, Sam=1
		
	}
}
