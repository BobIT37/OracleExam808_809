package com.wealth.certificate.study_1z0_809.chapter07.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Project {
    String label;
    public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	String value;

}
public class TestTreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		System.out.println(set.add("b")); 	// true
		System.out.println(set.add("x")); 	// true
		System.out.println(set.add("h")); 	// true
		System.out.println(set.add("b")); 	// false
		//System.out.println(set.add(null));// NullPointerException
		System.out.println(set); // [b, h, x]
		
		
		Project p = new Project();
        p.setLabel("Solar");
        p.setValue("foo");
        Project p2 = new Project();
        p2.setLabel("Gov");
        p2.setValue("foo2");
        Project p3 = new Project();
        p3.setLabel("foo");
        p3.setValue("foo3");
        Project p4 = new Project();
        p4.setLabel("Zoo");
        p4.setValue("foo4");
        Set<Project> projects = new TreeSet<>((o1, o2) -> {
            if (o1.getLabel().equals("foo")) return -2;
            if (o1.getLabel().equals("Solar")) return -1;
            if (o1.getLabel().equals("Gov")) return 1;
            if (o1.getLabel().equals("Zoo")) return -3;
            return 0;
        });
        projects.add(p);
        projects.add(p2);
        projects.add(p3);
        projects.add(p4);
        
        projects.iterator().forEachRemaining(pp -> {
            System.out.println(pp.getLabel());
        });
	}
}
