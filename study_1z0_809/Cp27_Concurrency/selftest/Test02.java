package com.wealth.certificate.study_1z0_809.chapter27.selftest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Test02 {
	public static void main(String[] args) throws Exception {
//		A
		Map<String, Integer> map = new ConcurrentHashMap<>();
		int i = map.get("a");
		map.put("a", ++i);
		
//		B
		ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();
		map.put("a", map.get("a")+1);
		
//		C
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map2 = Collections.synchronizedMap(map);
		int i = map.get("a");
		map.put("a", ++i);
		
//		D
		Map<String, AtomicInteger> map = new ConcurrentHashMap<>();
		map.get("a").incrementAndGet();
	}
}

//2. The correct answer is D.
//Only option D performs the operation atomically. 
//The other options perform the operation in two steps, 
//which makes it vulnerable to race conditions.