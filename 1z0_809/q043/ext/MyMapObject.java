package com.wealth.certificate.dumps_1z0_809.question043.ext;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyMapObject {

	String fName;
	String lName;

	public MyMapObject(String fn, String ln) {
		fName = fn;
		lName = ln;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}	
			
	public static void main(String[] args) {
		
		List<MyMapObject> emp = Arrays.asList (new MyMapObject ("111", "333"), new MyMapObject ("222", "222"), new MyMapObject ("222", "111"));		
		emp.stream().forEach(p -> System.out.println(p.getfName()+" "+p.getlName()) );
		System.out.println("----------------------");
		
		Function<MyMapObject, String> getFieldToMap = new Function<MyMapObject, String>() {
			@Override
			public String apply(MyMapObject t) {
				return t.getfName();
			}
		};		
		// function ref
		emp.stream().map(getFieldToMap).sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p) );
		
		// lambda
		emp.stream().map( (e)->e.getfName() ).sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p) );
				
		// method ref
		emp.stream().map(MyMapObject::getfName).sorted(Comparator.reverseOrder()).forEach(p -> System.out.println(p) );
		
		
		
	}

}
