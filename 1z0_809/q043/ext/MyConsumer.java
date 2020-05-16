package com.wealth.certificate.dumps_1z0_809.question043.ext;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyConsumer {

	public static void main(String[] args) {
						
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Consumer<Integer> consumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		list.stream().forEach(consumer);
		list.stream().forEach(t->System.out.println(t));
				
		Consumer<String> println = System.out::println;
		println.accept("Hello");
		
		list.stream().forEach(System.out::println);
		
	}

}
