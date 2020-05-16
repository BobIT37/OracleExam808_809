package com.wealth.certificate.dumps_1z0_809_ert.question055;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test {
	List<String> list = null;
	public void printValues(){
		System.out.print(getList());
	}
	public List<String> getList(){return list;}
	public void setList (List<String> newList){list = newList;}
	
	
//	static List<String> listStatic = null;
//	public static void printValuesStatic(String i){
//		System.out.print(getListStatic());
//	}
//	public static List<String> getListStatic(){return listStatic;}
}

public class Question055 {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Dog", "Cat", "Mouse");
		Test t=new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(Test :: printValues);
		
//		Runnable r = Test :: printValues;
//		t.getList().forEach(Test :: printValuesStatic);
		t.getList().forEach(a -> System.out.println(a));
		t.getList().forEach(System.out::println);
	}
}
