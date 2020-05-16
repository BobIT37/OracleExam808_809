package com.wealth.certificate.dumps_1z0_809_ps.question057.ext;

import java.util.Optional;
import java.util.OptionalInt;

import javax.sound.midi.SysexMessage;

public class MyOptional {

	public static void main(String[] args) {
		Optional<String> myOptional = Optional.empty();
		System.out.println("isPresent() : "+myOptional.isPresent());		
		myOptional = myOptional.of("1");
		System.out.println("isPresent() : "+myOptional.isPresent());
		System.out.println("get() : "+myOptional.get());
		myOptional = myOptional.empty();
		//System.out.println("get() : "+myOptional.get());
		
		String myStr = null;
		//myOptional = myOptional.of(myStr);
		
		myOptional = myOptional.ofNullable(myStr);
		//System.out.println("get() : "+myOptional.get());
		
		System.out.println(myOptional.isPresent() ? myOptional.get():"Nobody 1");
						
		myOptional.ifPresent(System.out::println);
		
		System.out.println(myOptional.orElse("Nobody 2"));
		
		
		System.out.println(myOptional.orElseGet(()->"Nobody 4"));
		
		myOptional = myOptional.ofNullable("Somebody 1");
		System.out.println(myOptional.orElseGet(()->"Nobody 5"));
		
		myOptional = myOptional.empty();
		try {
			System.out.println(myOptional.orElseThrow(()->new Exception("Nobody 6") ));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		myOptional = myOptional.ofNullable("Somebody 2");
		try {
			System.out.println(myOptional.orElseThrow(()->new Exception("Nobody 7") ));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("----- filter -----");
		System.out.println(myOptional.filter( a->true).orElseGet(()->"Filter true Nobody 8"));
		System.out.println(myOptional.filter( a->false).orElseGet(()->"Filter false Nobody 8"));
		
		
		OptionalInt optionalInt = OptionalInt.of(1);		
		System.out.println(optionalInt.getAsInt());
		
		Optional<Integer> optionalInt2 = Optional.of(2);
		System.out.println(optionalInt2.get().intValue());
		
	}
	
}
