package com.wealth.certificate.study_1z0_809.chapter07.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		System.out.println("\n-----------V put(K key, V value)-----------");
		Map<String, Integer> map = new HashMap<>();
		// Adding a key/value pair
		System.out.println( map.put("oranges", 7) ); 	// null
		System.out.println( map.put("apples", 5) );  	// null
		System.out.println( map.put("lemons", 2) );  	// null
		System.out.println( map.put("bananas", 7) ); 	// null
		// Replacing the value of an existing key. Returns the old one
		System.out.println( map.put("apples", 4) ); 	// 5
		System.out.println( map.put(null, 8) ); 			// null
		System.out.println( map.put("vegetable", null) ); 	// null
		
		System.out.println("\n-----------int size()-----------");
		System.out.println( map.size() ); // 4

		// {oranges=7, bananas=7, apples=4, lemons=2}
		System.out.println(map);
		System.out.println("\n-----------V get(Object key)-----------");
		// Getting a value
		System.out.println(map);
		// {null=8, oranges=7, bananas=7, vegetable=null, apples=4, lemons=2}
		System.out.println( map.get("oranges") ); 	// 7
		System.out.println( map.get("orangess") );	// null
		System.out.println( map.get(null) );		// 8
		
		System.out.println("\n----------boolean containsKey(Object key)-----------");
		// Testing if the map contains a key
		// {null=8, oranges=7, bananas=7, vegetable=null, apples=4, lemons=2}
		System.out.println( map.containsKey("apples") );	// true
		System.out.println( map.containsKey("appless") );	// false
		System.out.println( map.containsKey(null) );		// true
		
		System.out.println("\n-----------boolean containsValue(Object value)-----------");
		// Testing if the map contains a value
		// {null=8, oranges=7, bananas=7, vegetable=null, apples=4, lemons=2}
		System.out.println( map.containsValue(5) ); 	// false
		System.out.println( map.containsValue(7) ); 	// true
		System.out.println( map.containsValue(null) ); 	// true
		
		System.out.println("\n-----------V remove(Object key)-----------");
		// {null=8, oranges=7, bananas=7, vegetable=null, apples=4, lemons=2}
		// Removing the key/value pair and returning the value
		System.out.println( map.remove("lemons") ); 	// 2
		// Returns null if it can't find the key
		System.out.println( map.remove("lemons") ); 	// null
		System.out.println( map.remove(null) ); 		// 8
		
		System.out.println("\n-----------boolean remove(Object key, Object value)-----------");
		System.out.println( map.remove("bananas", 7) ); // true
		System.out.println( map.remove("oranges", 8) ); // false
		System.out.println( map.remove("bananass", 8) );// false
		
		System.out.println("\n-----------Set<K> keySet()-----------");
		System.out.println( map.put("temp1", 1) ); 		// null
		System.out.println( map.put("temp2", 2) ); 		// null
		System.out.println( map.put("temp3", 3) ); 		// null
		System.out.println( map.put("temp10", 10) ); 		// null
		// Getting the keys as a Set
		// (changes are reflected on the map and vice-versa)
		Set<String> keys = map.keySet(); 				// [oranges, temp10, vegetable, temp2, apples, temp3, temp1]
		System.out.println(keys);
		
		System.out.println("\n-----------Collection<V> values()-----------");
		// Getting the values as a Collection
		// (changes are reflected on the map and vice-versa)
		Collection<Integer> values = map.values(); 
		System.out.println(values);						// [7, 4]
		
		System.out.println("\n-----------V replace(K key, V value)-----------");
		int result_1 = map.replace("oranges", 9);		// 7
		System.out.println(result_1);
		
		//int result_2 = map.replace(null, 9);			// Exception in thread "main" java.lang.NullPointerException
		//System.out.println(result_2);
		
		//int result_3 = map.replace("orangesss", 9);	// Exception in thread "main" java.lang.NullPointerException
		//System.out.println(result_3);
		
		System.out.println("\n-----------boolean replace(K key, V oldValue, V newValue)-----------");
		boolean result__1 = map.replace("oranges", 9, 10);		// true
		System.out.println(result__1);
		
		boolean result__2 = map.replace("oranges", 9, 1);		// false
		System.out.println(result__2);
		System.out.println(map);								// {oranges=10, apples=4}							// 
		
		boolean result__3 = map.replace(null, 9, 1);			// false
		System.out.println(result__3);
		
		boolean result__4 = map.replace("orangess", 9, 1);		// false
		System.out.println(result__4);
		
		System.out.println("\n-----------void replaceAll(BiFunction<? super K,? super V,? extends V> function)-----------");
		Map<Integer,Integer> numbers = new HashMap<>();
        for (int i = 1; i <= 10; ++i) {
            numbers.put(i, i);
        }
        System.out.println("Original: " + numbers);
 
        numbers.replaceAll((key, oldValue) -> oldValue * oldValue);
        System.out.println("Squared: " + numbers);
		
		
		System.out.println("\n-----------void putAll(Map<? extends K,? extends V> m)-----------");
		// create two hash maps
		HashMap newmap1 = new HashMap();
		HashMap newmap2 = new HashMap();
	      
		// populate hash map
		newmap1.put(1, "tutorials");
		newmap1.put(2, "point");
		newmap1.put(3, "is best");
	      
		System.out.println("Values in newmap1: "+ newmap1);
	      
		// put all values in newmap2
		newmap2.putAll(newmap1);

		System.out.println("Values in newmap2: "+ newmap2);
		
		System.out.println("\n-----------V putIfAbsent(K key, V value)-----------");
		HashMap<Integer, String> mapStudent = new HashMap<>();
		// put contents to our HashMap
		mapStudent.put(73654, "Shyra Travis");
		mapStudent.put(98712, "Sharon Wallace");
		mapStudent.put(71245, "Leo Batista");	
		
		// put a new value to our map object
		String result1 = mapStudent.putIfAbsent(73654, "Darwin Bocalbos");
		System.out.println(result1);	// Shyra Travis
		
		String result2 = mapStudent.putIfAbsent(11111, "Darwin Bocalbos");
		System.out.println(result2);	// null
		
		String result3 = mapStudent.putIfAbsent(null, "Darwin Bocalbos");
		System.out.println(result3);	// null
		
		mapStudent.put(null, "xx xx");	
		String result4 = mapStudent.putIfAbsent(null, "yy yy");
		System.out.println(result4);	// xx xx
		
		System.out.println("-----------V getOrDefault(Object key, V defaultValue)-----------");
		// declare the hashmap
		mapStudent = new HashMap<>();
		// put contents to our HashMap
		mapStudent.put(1, "Shyra Travis");
		mapStudent.put(2, "Sharon Wallace");
		
		String name = mapStudent.getOrDefault(2, "Kokosz");
		String nameDefault = mapStudent.getOrDefault(3, "Kokosz");
        System.out.println("Name: " + name + "\nName Default : " + nameDefault);
        
        System.out.println("-----------void clear()-----------");
        // Removing all key/value pairs
        mapStudent.clear();
 		
        System.out.println("-----------boolean isEmpty()-----------");
        System.out.print("isEmpty() : ");
        System.out.println(mapStudent.isEmpty());		// true
        
        System.out.println("-----------Object clone()-----------");
        // create two hash maps
        newmap1 = new HashMap();
        newmap2 = new HashMap();
           
        // populate 1st map
        newmap1.put(1, "tutorials");
        newmap1.put(2, "point");
        newmap1.put(3, "is best"); 
           
        // clone 1st map
        newmap2=(HashMap)newmap1.clone();
           
        System.out.println("1st Map: " + newmap1);
        System.out.println("Cloned 2nd Map: " + newmap2);  
        
        System.out.println("-----------V compute(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)-----------");
        Map<Integer,String> nameForId = new HashMap<>();
        nameForId.put(1, "Java");
        nameForId.put(2, "Clojure");
        nameForId.put(3, null);
        System.out.println("Original map: " + nameForId);
 
        // recompute the values:
        nameForId.compute(1, (key, oldVal) -> oldVal.concat("Script"));
        nameForId.compute(2, (key, oldVal) -> oldVal.concat("Script"));
        //nameForId.compute(3, (key, oldVal) -> oldVal.concat("Script"));	// Exception in thread "main" java.lang.NullPointerException
        //nameForId.compute(4, (key, oldVal) -> oldVal.concat("Script"));	// Exception in thread "main" java.lang.NullPointerException
        System.out.println("Recomputed map: " + nameForId);
 
        // return "null" to remove value:
        nameForId.compute(1, (key, oldVal) -> null);
        // null for nothing does nothing:
        nameForId.compute(3, (key, oldVal) -> null);
        System.out.println("After null: " + nameForId);
 
        // unchecked exceptions are rethrown:
        try {
            nameForId.compute(1, (key, oldVal) -> {
                throw new RuntimeException("Drakaris!");
            });
        } catch (RuntimeException e) {
            System.out.println("Rethrown: " + e.getMessage());
        }
        System.out.println("Map after exception: " + nameForId);
        
        System.out.println("-----------V computeIfAbsent(K key, Function<? super K,? extends V> mappingFunction)-----------");
        nameForId = new HashMap<>();
        nameForId.put(1, "Java");
        nameForId.put(2, "Clojure");
        nameForId.put(3, null);
        System.out.println("Original map: " + nameForId);
        
        // recomputeIfAbsent the values:
        nameForId.computeIfAbsent(1, key -> "Script"+key);
        nameForId.computeIfAbsent(2, key -> "Script"+key);
        nameForId.computeIfAbsent(3, key -> "Script"+key);	// 3=Script3
        nameForId.computeIfAbsent(4, key -> "Script"+key);	// 4=Script4
        System.out.println("Recomputed map: " + nameForId);
        
        System.out.println("-----------V computeIfPresent(K key, BiFunction<? super K,? super V,? extends V> remappingFunction)-----------");
        nameForId = new HashMap<>();
        nameForId.put(1, "Java");
        nameForId.put(2, "Clojure");
        nameForId.put(3, null);
        System.out.println("Original map: " + nameForId);
        
        // recomputeIfPresent the values:
        nameForId.computeIfPresent(1, (key, oldVal) -> oldVal.concat("Script"));
        nameForId.computeIfPresent(2, (key, oldVal) -> oldVal.concat("Script"));
        nameForId.computeIfPresent(3, (key, oldVal) -> oldVal.concat("Script"));	// null
        nameForId.computeIfPresent(4, (key, oldVal) -> oldVal.concat("Script"));	// null
        System.out.println("Recomputed map: " + nameForId);
        
        System.out.println("-----------Set<Map.Entry<K,V>> entrySet()-----------");
        // create hash map
        HashMap newmap = new HashMap();
           
        // populate hash map
        newmap.put(1, "tutorials");
        newmap.put(2, "point");
        newmap.put(3, "is best");
           
        // create set view for the map
        Set set=newmap.entrySet();
           
        // check set values
        System.out.println("Set values: " + set);
        
        System.out.println("-----------void forEach(BiConsumer<? super K,? super V> action)-----------");
        newmap.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));
        
        System.out.println("-----------V merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction)-----------");
        HashMap<String,String> strMap = new HashMap<String,String>();
        strMap.put("Key1", "Value1");
        strMap.put("Key2", "Value2"); 
        strMap.put("Key3", null);   
        String str1 = strMap.merge("Key1","Value56",(v1,v2)->v1.substring(3).concat(v2));
        String str2 = strMap.merge("Key3","Value33",(v1,v2)->v1.substring(3).concat(v2));
        String str3 = strMap.merge("Key4","Value44",(v1,v2)->v1.substring(3).concat(v2));
        System.out.println(str1); 	// ue1Value56
        System.out.println(str2); 	// Value33
        System.out.println(str3); 	// Value44
        System.out.println(strMap); // {Key2=Value2, Key1=ue1Value56, Key4=Value44, Key3=Value33}
	
	
	}
}
