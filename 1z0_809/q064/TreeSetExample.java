package com.wealth.certificate.dumps_1z0_809.question064;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample implements Comparable<Vehicle> {
	int vno;
	String name;
	
	public TreeSetExample (int vno, String name) {
		this.vno = vno;
		this.name = name;
	}
	
	public String toString () {
		return vno + ":" + name;
	}
	
	@Override
	public int compareTo(Vehicle obj) {
		return this.vno - obj.vno;
	}
	
	public static void main(String[] args) {
		//Ex.1 implements Comparable<TreeSetExample>
		System.out.println("== TreeSet implements Comparable<TreeSetExample> ==");
		Set<TreeSetExample> vehicles = new TreeSet <>();
		vehicles.add(new TreeSetExample(10123, "Ford"));
		vehicles.add(new TreeSetExample(10124, "BMW"));
		System.out.println(vehicles);
		
		//Ex2. TreeSet new Object implements Comparator
		System.out.println("== TreeSet new Object implements Comparator ==");
		Set<TreeSetExample> vehicles1 = new TreeSet <>(new TreeSetExampleCompare());
		vehicles1.add(new TreeSetExample(10123, "Ford"));
		vehicles1.add(new TreeSetExample(10124, "BMW"));
		System.out.println(vehicles1);
		
		 //Ex3. TreeSet new Comparator 
		System.out.println("== TreeSet new Comparator ==");
		Set<TreeSetExample> vehicles2 = new TreeSet <>(new Comparator<TreeSetExample>() {		
			@Override
			public int compare(TreeSetExample o1, TreeSetExample o2) {
				return o1.vno - o2.vno;
			}
		});
		
		vehicles2.add(new TreeSetExample(10123, "Ford"));
		vehicles2.add(new TreeSetExample(10124, "BMW"));
		System.out.println(vehicles2);
	}
}

class TreeSetExampleCompare implements Comparator<TreeSetExample>{
	
	@Override
	public int compare(TreeSetExample o1, TreeSetExample o2) {
		return o1.vno - o2.vno;
	}	
}
