package com.wealth.certificate.dumps_1z0_809.question043.ext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyCollectObject {

	String fName;
	String lName;

	public MyCollectObject(String fn, String ln) {
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

		List<MyCollectObject> emp = Arrays.asList(new MyCollectObject("111", "333"), new MyCollectObject("222", "222"),new MyCollectObject("222", "111"));
		
		emp.stream().collect(Collectors.toList()).forEach(p->System.out.println(p.fName));		

	}

}
