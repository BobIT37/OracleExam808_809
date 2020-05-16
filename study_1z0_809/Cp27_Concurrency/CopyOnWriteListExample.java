package com.wealth.certificate.study_1z0_809.chapter27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListExample {

	public static void main(String[] args) {
		
		List<Integer> subject = new ArrayList<>();
//		List<Integer> subject = new CopyOnWriteArrayList<>();
		
		subject.addAll(Arrays.asList(1,2,3,4,5));
		
		Iterator<Integer> it = subject.iterator();
		
		while(it.hasNext())
		{
			Integer i = it.next();
			
			System.out.println("element : "+i);
			
			if(i == 3) {
				subject.add(9);
				System.out.println("add 9");
				
//				it.remove();
//				subject.remove(i);
//				System.out.println("remove "+i);
			}
			
		}
		
		System.out.println(subject);
	}
	
}
