package com.wealth.certificate.study_1z0_809.chapter07.map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		System.out.println("\n-----------V put(K key, V value)-----------");
		Map<String, Integer> map = new TreeMap<>();
		System.out.println( map.put("oranges", 7) ); 		// null
		System.out.println( map.put("apples", 5) ); 		// null
		System.out.println( map.put("lemons", 2) ); 		// null
		System.out.println( map.put("bananas", 7) ); 		// null
		System.out.println( map.put("bananas", 8) ); 		// 7
		//System.out.println( map.put(null, 8) ); 			// NullPointerException
		System.out.println( map.put("vegetable", null) ); 	// null
		//{apples=5, bananas=8, lemons=2, oranges=7, vegetable=null}
		
		System.out.println("\n-----------void putAll(Map<? extends K,? extends V> map)-----------");
		Map<String, Integer> map2 = new TreeMap<>();
		// Putting 2nd map in 1st map
		map2.putAll(map);
		
		System.out.println(map2);						// {apples=5, bananas=8, lemons=2, oranges=7}
		
		System.out.println("\n-----------Set<K> keySet()-----------");
		System.out.println( map.put("zzzz", 1) ); 		// null
		System.out.println( map.put("aaaa", 9) ); 		// null
		Set<String> keys = map.keySet();
		System.out.println(keys);						// [aaaa, apples, bananas, lemons, oranges, zzzz]

		System.out.println("\n-----------Collection<V> values()-----------");
		Collection<Integer> values = map.values(); 
		System.out.println(values);						// [9, 5, 8, 2, 7, 1]
		
		System.out.println("\n-----------Map.Entry<K,V> ceilingEntry(K key)-----------");
		// creating tree map 
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
	      
		// populating tree map
		treemap.put(2, "two");
		treemap.put(1, "one");
		treemap.put(3, "three");
		treemap.put(6, "six");
		treemap.put(5, "five");
		treemap.put(10, "ten"); 
		
		System.out.println(treemap);	// {1=one, 2=two, 3=three, 5=five, 6=six}
		System.out.println("Ceiling entry for 4: "+ treemap.ceilingEntry(4));	// Ceiling entry for 4: 5=five
		System.out.println("Ceiling entry for 5: "+ treemap.ceilingEntry(5));	// Ceiling entry for 5: 5=five
		System.out.println("Ceiling entry for 6: "+ treemap.ceilingEntry(6));	// Ceiling entry for 6: 6=six
		System.out.println("Ceiling entry for 7: "+ treemap.ceilingEntry(7));	// Ceiling entry for 7: 10=ten
		System.out.println("Ceiling entry for 8: "+ treemap.ceilingEntry(8));	// Ceiling entry for 8: 10=ten
		System.out.println("Ceiling entry for 9: "+ treemap.ceilingEntry(9));	// Ceiling entry for 9: 10=ten
		System.out.println("Ceiling entry for 10: "+ treemap.ceilingEntry(10));	// Ceiling entry for 10: 10=ten
		System.out.println("Ceiling entry for 11: "+ treemap.ceilingEntry(11));	// Ceiling entry for 11: null
		//System.out.println("Ceiling entry for null: "+ treemap.ceilingEntry(null));	// Exception in thread "main" java.lang.NullPointerException
	
		System.out.println("\n-----------K ceilingKey(K key)-----------");
		treemap = new TreeMap<Integer, String>();
	      
		// populating tree map
		treemap.put(2, "two");
		treemap.put(1, "one");
		treemap.put(3, "three");
		treemap.put(6, "six");
		treemap.put(5, "five");
		treemap.put(10, "ten");
		
		System.out.println("Ceiling key entry for 4: "+ treemap.ceilingKey(4));			// Ceiling key entry for 4: 5
		System.out.println("Ceiling key entry for 5: "+ treemap.ceilingKey(5));			// Ceiling key entry for 5: 5
		System.out.println("Ceiling key entry for 7: "+ treemap.ceilingKey(7));			// Ceiling key entry for 7: 10
		System.out.println("Ceiling key entry for 7: "+ treemap.ceilingKey(-7));		// Ceiling key entry for 7: 1
		System.out.println("Ceiling key entry for 11: "+ treemap.ceilingKey(11));		// Ceiling key entry for 11: null
		//System.out.println("Ceiling key entry for null: "+ treemap.ceilingKey(null));	// Exception in thread "main" java.lang.NullPointerExceptionat java.util.TreeMap.compare(TreeMap.java:1294)
		
		System.out.println("\n-----------void clear()-----------");
		treemap.clear();
		System.out.println(treemap);		// {}
		
		
	}
}
